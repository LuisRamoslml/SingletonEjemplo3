
package CapaNegocio;


public class Administrativos extends Empleado{
    private String sector;
    
    public Administrativos(String codigo,String nombre,String apellido,String dni,String sector){
        super(codigo, nombre, apellido, dni);
        this.sector=sector;
    }
   /* public String getSector(){
        return sector;
    }*/
    @Override
    public String toString(){
        return super.toString()
                +"  "+ sector+"\n ";
    }
    
   
}
