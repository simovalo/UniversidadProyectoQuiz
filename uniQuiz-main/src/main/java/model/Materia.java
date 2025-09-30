package model;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private String codigo;
    private int numeroHorasSemanales;
    private int creditos;
    private String semestre;
    private Carrera OwnedByCarrera;
    private Profesor profesor;
    private ArrayList<Estudiante> listaEstudiantes;

    public Materia(String nombre, String codigo, int numeroHorasSemanales, int creditos, String semestre, Carrera OwnedByCarrera, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroHorasSemanales = numeroHorasSemanales;
        this.creditos = creditos;
        this.semestre = semestre;
        this.OwnedByCarrera = OwnedByCarrera;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHorasSemanales() {
        return numeroHorasSemanales;
    }

    public void setNumeroHorasSemanales(int numeroHorasSemanales) {
        this.numeroHorasSemanales = numeroHorasSemanales;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Carrera getOwnedByCarrera() {
        return OwnedByCarrera;
    }

    public void setOwnedByCarrera(Carrera OwnedByCarrera) {
        this.OwnedByCarrera = OwnedByCarrera;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }



    public void inscribirEstudiante(Estudiante e) {
        if (!listaEstudiantes.contains(e)) {
            listaEstudiantes.add(e);
        }
    }

    public ArrayList<Estudiante> listarEstudiantes() {
        return listaEstudiantes;
    }

    public int calcularHorasSemanales() {
        return numeroHorasSemanales;
    }






}


