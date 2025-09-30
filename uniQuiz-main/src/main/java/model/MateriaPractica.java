package model;

public class MateriaPractica extends Materia{
    private int numeroHorasPractica;
    private int numeroHorasLaboratorio;

    public MateriaPractica(String nombre, String codigo, int numeroHorasSemanales, int creditos, String semestre, int numeroHorasPractica, int numeroHorasLaboratorio, Carrera OwnedByCarrera, Profesor profesor) {
        super(nombre, codigo, numeroHorasSemanales, creditos, semestre, OwnedByCarrera, profesor);
        this.numeroHorasPractica = numeroHorasPractica;
        this.numeroHorasLaboratorio = numeroHorasLaboratorio;
    }

    public int getNumeroHorasPractica() {
        return numeroHorasPractica;
    }

    public void setNumeroHorasPractica(int numeroHorasPractica) {
        this.numeroHorasPractica = numeroHorasPractica;
    }

    public int getNumeroHorasLaboratotio() {
        return numeroHorasLaboratorio;
    }
    public void setNumeroHorasLaboratorio(int numeroHorasLaboratorio) {
        this.numeroHorasLaboratorio = numeroHorasLaboratorio;
    }
}
