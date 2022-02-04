
package CapaNegocio;


public class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private String dni;
    
    public Empleado (String codigo,String nombre,String apellido,String dni){
       this.codigo=codigo;
       this.nombre=nombre;
       this.apellido=apellido;
       this.dni=dni;
    }
    public String getApellido(){
        return apellido;
    }
    @Override
    public String toString(){
        return codigo+"  "+nombre+"  "+apellido+"  "+dni;
        
    }
    
}
