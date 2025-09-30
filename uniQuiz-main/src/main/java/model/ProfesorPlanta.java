package model;

public class ProfesorPlanta extends Profesor {
    private Dedicacion tipoDedicacion;

    public ProfesorPlanta(String nombre, String id, String titulo, int añosDeExperiencia, Dedicacion tipoDedicacion) {
        super(nombre, id, titulo, añosDeExperiencia);
        this.tipoDedicacion = tipoDedicacion;
    }

    public Dedicacion getTipoDedicacion() {
        return tipoDedicacion;
    }

    public void setTipoDedicacion(Dedicacion tipoDedicacion) {
        this.tipoDedicacion = tipoDedicacion;
    }
}
