package edu.ejercicios.Padre;
import edu.ejercicios.Main;

public class Empleado {

    private String nombre;
    private double sueldo;
    public String direccion;
    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre, String sueldo){
        this.nombre=nombre;
        this.sueldo= Double.parseDouble(sueldo);
    }

    public String ObtenerDatos(){
        return "Nombre: "+this.getNombre()+" Sueldo: "+this.getSueldo();
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + this.getNombre() + ", sueldo=" + this.getSueldo() + "]";
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Homero")) {
            this.nombre="Homero no puede ser empleado";
        } else {
            this.nombre = nombre;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
