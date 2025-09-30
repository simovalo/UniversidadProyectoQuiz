package model;

public class ProfesorCatedra extends Profesor {
    private int numeroHorasContratadas;
    private String empresaExterna;

    public ProfesorCatedra(String identificador, String nombre, String tituloAcademico, int experiencia, Carrera OwnedByCarrera,
                           int numeroHorasContratadas, String empresaExterna){
    super(identificador, nombre, tituloAcademico, experiencia, OwnedByCarrera);
    this.numeroHorasContratadas = numeroHorasContratadas;
    this.empresaExterna = empresaExterna;
    }

    public int getNumeroHorasContratadas() {
        return numeroHorasContratadas;
    }

    public void setNumeroHorasContratadas(int numeroHorasContratadas) {
        this.numeroHorasContratadas = numeroHorasContratadas;
    }

    public String getEmpresaExterna() {
        return empresaExterna;
    }

    public void setEmpresaExterna(String empresaExterna) {
        this.empresaExterna = empresaExterna;
    }
}
