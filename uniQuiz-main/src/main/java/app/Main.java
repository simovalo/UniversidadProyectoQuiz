package app;

import model.*;

public class Main {
    public static void main(String[] args) {
        // en esta agregamos una carrera
        Carrera carrera = new Carrera("Ingeniería de Sistemas");

        // aqui creaamos un profe
        Profesor profesor = new ProfesorPlanta("P001", "Carlos Perez", "PhD en CS", 10, Dedicacion.COMPLETO);

        // en esta creamos materias
        MateriaTeorica mt = new MateriaTeorica("Programación I", "M001", 6, 3, "1", carrera, profesor);
        MateriaPractica mp = new MateriaPractica("Laboratorio de Programación", "M002", 4, 2, "1", 2, 2, carrera, profesor);

        // aqui registamos materias
        carrera.registrarMateria(mt);
        carrera.registrarMateria(mp);

        // creamos algunos estudiantes
        Estudiante e1 = new Pregrado("E001", "Ana Lopez", "12345", "1", 4.0, true);
        Estudiante e2 = new Pregrado("E002", "Juan Torres", "67890", "1", 3.8, false);

        // Inscribir estudiantes en materias
        carrera.inscribirEstudianteEnMateria(e1, "M001");
        carrera.inscribirEstudianteEnMateria(e2, "M002");

        // consultamos matrias por semestre
        System.out.println("Materias de 1er semestre: ");
        for (Materia m : carrera.consultarMateriasPorSemestre("1")) {
            System.out.println("- " + m.getNombre());
        }

        // aqui podemos listrar estudiantes por materia
        System.out.println("Estudiantes en Programación I: ");
        for (Estudiante est : carrera.listarEstudiantesPorMateria("M001")) {
            System.out.println("- " + est.getNombre());
        }

        // cons esto calculamos horas de una materia
        System.out.println("Horas semanales de Programación I: " + carrera.calcularHorasMateria("M001"));

        // aqui calculamos creditos de un estudiante
        System.out.println("Créditos de Ana: " + carrera.calcularCreditosEstudiante(e1));

        // creamos una asociacion de profesor a materia
        carrera.asociarProfesorAMateria(profesor, "M002");
        System.out.println("Profesor de Laboratorio: " + mp.getProfesor().getNombre());
    }
}
