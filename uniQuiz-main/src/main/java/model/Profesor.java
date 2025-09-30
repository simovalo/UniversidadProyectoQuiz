package model;

import java.util.ArrayList;

public abstract class Profesor {
    private String identificador;
    private String nombre;
    private String tituloAcademico;
    private int añosDeExperiencia;
    private ArrayList<Materia> listaMateria;

    public Profesor(String identificador, String nombre, String tituloAcademico, int añosDeExperiencia) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tituloAcademico = tituloAcademico;
        this.añosDeExperiencia = añosDeExperiencia;
        this.listaMateria = new ArrayList<>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
}