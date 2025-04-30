
public class Problema6_Profesores {
    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTotal;
    public int cedula;
    
    public Problema6_Profesores(String name, String ap, double sueldoBa, int dni){
        nombre = name;
        apellido = ap;
        sueldoBasico = sueldoBa;
        sueldoTotal = (sueldoBasico + (sueldoBasico * 0.2));
        cedula = dni;
    }
    public String toString(){
        return "Nombre: "+ nombre+"\nApellido: "+apellido+"\nSueldo Basico: "+ sueldoBasico+"\nSueldo Total: "+sueldoTotal+"\nCedula: "+ cedula;
    }
}
