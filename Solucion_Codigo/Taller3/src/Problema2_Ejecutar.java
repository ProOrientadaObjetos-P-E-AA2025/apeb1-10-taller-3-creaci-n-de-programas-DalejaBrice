public class Problema2_Ejecutar {
    public static void main(String[] args) {
        double horas = 32;
        
        Problema2_EquivalenteHora equivalente = new Problema2_EquivalenteHora(horas);
        
        System.out.println("Los equivalentes de "+horas+" horas son: ");
        System.out.println(equivalente.toString());
    }
}