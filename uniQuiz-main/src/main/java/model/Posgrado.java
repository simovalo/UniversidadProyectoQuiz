package model;

public class Posgrado extends Estudiante {
    private String seminario;
    private PregradoOPosgrado tipoGrado;

    public Posgrado(String identificacion, String nombre, String documentoIdentidad, String semestreActual, double notas, Carrera OwnedByCarrera, String seminario, PregradoOPosgrado tipoGrado) {
        super(identificacion, nombre, documentoIdentidad, semestreActual, notas, OwnedByCarrera);
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
