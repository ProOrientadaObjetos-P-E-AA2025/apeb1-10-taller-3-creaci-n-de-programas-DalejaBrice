
public class Problema8_EntidadFinanciera {
    public String nombre;
    public String banco;
    public double cheque;
    public double comision;
    
    public Problema8_EntidadFinanciera(String name, String ban, double cheq){
        nombre = name;
        banco = ban;
        cheque = cheq;
        comision = (cheque * 0.0003);
    }
    public String toString(){
        return "Nombre: "+nombre+"\nNombre del Banco: "+banco+"\nValor del Cheque: "+ cheque+"\nComision del banco: "+comision;
    }
}
