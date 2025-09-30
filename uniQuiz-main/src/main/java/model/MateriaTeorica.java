package model;

public class MateriaTeorica extends Materia{

    public MateriaTeorica(String nombre, String codigo, int numeroHorasSemanales, int creditos, String semestre, Carrera OwnedByCarrera, Profesor profesor) {
        super(nombre, codigo, numeroHorasSemanales, creditos, semestre, OwnedByCarrera, profesor);
    }


}
