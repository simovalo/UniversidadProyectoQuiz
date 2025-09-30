package model;

public class Posgrado extends Estudiante {
    private String seminario;
    private PregradoOPosgrado tipoGrado;

    public Posgrado(String identificacion, String nombre, String documentoidentidad, String semestreActual, double notas, String seminario, PregradoOPosgrado tipoGrado) {
        super(identificacion, nombre, documentoidentidad, semestreActual, notas);
        this.tipoGrado = tipoGrado;
        this.seminario = seminario;
    }


    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public PregradoOPosgrado getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(PregradoOPosgrado tipoGrado) {
        this.tipoGrado = tipoGrado;
    }
}
