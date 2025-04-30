
public class Problema2_EquivalenteHora {
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public  Problema2_EquivalenteHora(double h){
        horas = h;
        minutos = h*60;
        segundos = h*3600;
        dias = h/24;
    }
    
    public String toString(){
        return "Horas: "+horas + "\nMinutos: "+ minutos + "\nSegundos: "+segundos+"\nDias: "+dias;
    }
}
