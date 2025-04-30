
public class Problema5_Estudiantes {
    public String nombre;
    String estado;
    public double nota1;
    public double nota2;
    public double nota3;
    public double promedio;
    
    public Problema5_Estudiantes(String name, double n1, double n2, double n3){
        nombre = name;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        promedio = ((nota1 + nota2 + nota3)/3);
        if(promedio >= 6.5){
            estado = "Aprobado";
        } else {
            estado= "Reprobado";
        }
    }
    public String toString(){
        return "Estudiante: "+ nombre+"\nNota 1: "+nota1+"\nNota 2: "+ nota2 + "\nNota 3: " +nota3+ "\nPromedio: "+ promedio+"\nEstado:" + estado;
    }
}
