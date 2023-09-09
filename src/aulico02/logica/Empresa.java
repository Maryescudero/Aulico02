
package aulico02.logica;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author marus
 */
public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;


    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }

  

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return razonSocial;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.razonSocial, other.razonSocial);
    }
    
}
