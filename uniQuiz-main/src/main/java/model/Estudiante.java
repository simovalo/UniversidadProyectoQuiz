package model;

import java.util.ArrayList;

public abstract class Estudiante {
    private String identificacion;
    private String nombre;
    private String documentoIdentidad;
    private String semestreActual;
    private double notas;
    private ArrayList<ProgramaAcademico> listaProgramasAcademocos;
    private ArrayList<Materia> listaMateria;

    public Estudiante(String identificacion, String nombre, String documentoIdentidad, String semestreActual, double notas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.semestreActual = semestreActual;
        this.notas = notas;
        this.listaProgramasAcademocos = new ArrayList<>();
        this.listaMateria = new ArrayList<>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(String semestreActual) {
        this.semestreActual = semestreActual;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
    public ArrayList<ProgramaAcademico> getListaProgramasAcademocos() {
        return listaProgramasAcademocos;
    }

    public void setListaProgramasAcademocos(ArrayList<ProgramaAcademico> listaProgramasAcademocos) {
        this.listaProgramasAcademocos = listaProgramasAcademocos;
    }

    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

}
