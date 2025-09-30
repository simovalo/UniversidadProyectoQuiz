package model;

public  class Pregrado extends Estudiante{
    private boolean beca;

    public Pregrado(String identificacion, String nombre, String documentoIdentidad, String semestreActual, double notas, Carrera OwnedByCarrera, boolean beca) {
        super(identificacion, nombre, documentoIdentidad, semestreActual, notas, OwnedByCarrera);
        this.beca = beca;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }
}
