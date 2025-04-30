
public class Problema7_Automotor {
    public String cedula;
    public String marca;
    public int anioFabricacion;
    public double valorVehiculo;
    public double valorDeMatricula;
    
    public Problema7_Automotor(String dni,String mar, int anioFa, double valorV){
        cedula = dni;
        marca = mar;
        anioFabricacion = anioFa;
        valorVehiculo = valorV;
        valorDeMatricula = ((valorVehiculo * 0.00002) *(2025-anioFabricacion) );
    }
    public String toString(){
        return "Cedula: "+cedula+"\nMarca: "+marca+"\nAnio Fabricacion: "+ anioFabricacion+"\nValor del Vehiculo: "+valorVehiculo+"\nValor de matricula: "+ valorDeMatricula;
    }
    
}
