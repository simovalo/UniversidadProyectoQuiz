package model;

public class Universidad {
    private String nombre;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + '}';
    }

}
