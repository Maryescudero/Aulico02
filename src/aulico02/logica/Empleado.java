
package aulico02.logica;

/**
 *
 * @author marus
 */
public class Empleado implements Comparable<Empleado>{

   

   private String nombre;
   private String apellido;
   private int dni;
   private double sueldo;
   private Categorias puesto;
   private Empresa  empresa;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int dni, double sueldo, Categorias puesto,Empresa empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Categorias getPuesto() {
        return puesto;
    }

    public void setPuesto(Categorias puesto) {
        this.puesto = puesto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
  

    @Override
    public int compareTo(Empleado t) {
         if(dni == t.dni){
        
            return 0;
        } else if(dni > t.dni){
        
            return 1;
        }else {
        
            return -1;
        }
    }
    
   

}