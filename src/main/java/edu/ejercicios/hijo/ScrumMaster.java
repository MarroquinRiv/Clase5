package edu.ejercicios.hijo;
import edu.ejercicios.Padre.Empleado;

public class ScrumMaster extends Empleado {
    private String departamento;
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public ScrumMaster(String nombre, String sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String ObtenerDatos(){
        return super.ObtenerDatos()+" Departamento: "+this.departamento;
    }
}
