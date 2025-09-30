package model;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Carrera {
    private String nombre;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Profesor> listaProfesores;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.listaMaterias = new ArrayList<>();
        this.listaEstudiantes = new ArrayList<>();
        this.listaProfesores = new ArrayList<>();
    }

    public ArrayList<Materia> getListaMateria() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }
    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }


    // 1. Agregar materia a la carrera
    public void addMateria(Materia m) {
        if (!listaMaterias.contains(m)) {
            listaMaterias.add(m);
        }
    }

    // 2. Consultar materias por semestre
    public ArrayList<Materia> consultarMateriasPorSemestre(String semestre) {
        ArrayList<Materia> resultado = new ArrayList<>();
        for (Materia m : listaMaterias) {
            if (m.getSemestre().equalsIgnoreCase(semestre)) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    // 3. Inscribir estudiante en una materia específica de la carrera
    public void inscribirEstudianteEnMateria(Estudiante e, String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equalsIgnoreCase(codigoMateria)) {
                m.inscribirEstudiante(e);
                if (!e.getListaMateria().contains(m)) {
                    e.getListaMateria().add(m);
                }
                break;
            }
        }
    }

    // 4. Listar estudiantes de una materia específica
    public ArrayList<Estudiante> listarEstudiantesPorMateria(String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equalsIgnoreCase(codigoMateria)) {
                return m.listarEstudiantes();
            }
        }
        return new ArrayList<>();
    }

    // 5. Calcular total de horas semanales de una materia específica
    public int calcularHorasMateria(String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equalsIgnoreCase(codigoMateria)) {
                return m.calcularHorasSemanales();
            }
        }
        return 0;
    }

    // 6. Calcular total de créditos de un estudiante en la carrera
    public int calcularCreditosEstudiante(Estudiante e) {
        int total = 0;
        for (Materia m : listaMaterias) {
            if (m.getListaEstudiantes().contains(e)) {
                total += m.getCreditos();
            }
        }
        return total;
    }

    // 7. Asociar profesor a materia
    public void asociarProfesorAMateria(Profesor p, String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equalsIgnoreCase(codigoMateria)) {
                m.setProfesor(p);
                if (!p.getListaMateria().contains(m)) {
                    p.getListaMateria().add(m);
                }
                break;
            }
        }
    }

    // 8. Registrar materia teórica o práctica
    public void registrarMateria(Materia m) {
        if (!listaMaterias.contains(m)) {
            listaMaterias.add(m);
        }
    }
    // desarrollar un metodo que obtenga los profesores que tienen mas de 2 años de experiencia que sean de planta
    public ArrayList<Profesor> obtenerProfesoresConMasDeDosAñosDeExperiencia() {
        return listaProfesores.stream()
                .filter(p -> p instanceof ProfesorPlanta && p != null && p.getAñosDeExperiencia() > 2)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
