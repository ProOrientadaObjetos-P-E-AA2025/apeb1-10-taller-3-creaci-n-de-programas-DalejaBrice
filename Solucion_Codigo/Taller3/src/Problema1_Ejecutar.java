public class Problema1_Ejecutar {
    public static void main(String[] args) {
        double area = 0;
        double ancho = 15;
        double largo = 12;
        double valorMetroCuadrado = 3;
        double costoTotal= 0;
        
        Problema1_Terreno terreno = new Problema1_Terreno();
        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setArea();
        terreno.setCostoTerreno(costoTotal);
        terreno.setValorMetroCuadrado(largo);
        System.out.println("Terreno");
        System.out.println("____________________");
        System.out.println("El area del terreno es de "+terreno.getArea()+
                " y el costo por metro cuadrado es de "+terreno.getValorMetroCuadrado()+" el costo total es: "+terreno.getCostoTerreno());
    }
}
