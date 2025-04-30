
public class Problema3_InstitucionesEducativas {
    public String nombre;
    public String tipo;
    public int nAl;
    public int nDo;
    public int nSed;
    public double gastos;
    public double presupuesto;
    
    public Problema3_InstitucionesEducativas(String name,String tipoIns, 
            int nA, int nD, int nS, double gas){
        nombre = name;
        tipo = tipoIns;
        nAl = nA;
        nDo = nD;
        nSed = nS;
        gastos = gas;
        presupuesto = nAl * gastos;
    }
    public String toSrting(){
        return "Institucion \n ______________\n Nombre: "+nombre+"\nTipo: "+tipo+"\nNumero de alumnos: "+nAl+"\nNumero de sedes: "+nSed+"\nGastos por estudiante: "+gastos+"\nPresupuestos: "+presupuesto;
    }
            
}
