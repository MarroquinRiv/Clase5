package edu.ejercicios;
import edu.ejercicios.Padre.Empleado;
import edu.ejercicios.hijo.ScrumMaster;

public class Main {

    public static void imprime (Empleado emple) {
        System.out.println("Objeto.ObtenerDatos()=" +emple.ObtenerDatos());
    }

    public static void determinarTipo (Empleado emple) {
        if (emple instanceof ScrumMaster) {
            System.out.println("Es de tipo ScrumMaster");
        } else if (emple instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (emple instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

    public static void main(String[] args) {
        //Empleado em = new Empleado("Daniel", "5000.75");System.out.println(em.ObtenerDatos());em.setNombre("Juan");em.setSueldo(5000.75);System.out.println("Nombre: " + em.getNombre());em.setNombre("Homero");System.out.println("Nombre: " + em.getNombre());ScrumMaster sm = new ScrumMaster("Gabriel", "8900", "IT");System.out.println(sm.ObtenerDatos());
        Empleado emple = new Empleado("Daniel", "5000.75");
        imprime(emple);
        ScrumMaster sm = new ScrumMaster("Gabriel", "8900", "IT");
        imprime(sm);
        System.out.println(sm.toString());
    }

}