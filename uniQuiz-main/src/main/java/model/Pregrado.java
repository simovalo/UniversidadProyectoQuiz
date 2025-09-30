package model;

public  class Pregrado extends Estudiante{
    private boolean beca;

    public Pregrado(String identificacion, String nombre, String documentoIdentidad, String semestreActual, double notas, boolean beca) {
        super(identificacion, nombre, documentoIdentidad, semestreActual, notas);
        this.beca = beca;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }
}
