
package CapaNegocio;
import interfaces.ISaldos;

public class Sereno extends Empleado implements ISaldos{
    private int rango;
    private double saldo;
    
   // public Sereno(String codigo,String nombre,String apellido,String dni,int rango){
       public Sereno(String codigo,String nombre,String apellido,String dni,int rango,double saldo){
         super(codigo, nombre, apellido, dni);
         this.rango=rango;
         this.saldo=saldo;
        
    }
    @Override
    public double getSaldo(){
        return saldo;
    }
    @Override
    public void calcularS(){
        saldo = 150 * rango;
    }
    @Override
    public String toString(){
        return super.toString()
                +"  "+ rango+"  "+saldo+"\n ";
    }
    
    
}
