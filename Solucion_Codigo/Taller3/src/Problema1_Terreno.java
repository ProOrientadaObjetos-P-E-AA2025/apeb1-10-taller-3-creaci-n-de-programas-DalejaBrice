
public class Problema1_Terreno {

    public double costoTerreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetroCuadrado;

    public void setAncho(double anch){
        ancho = anch;
    }
    public double getAncho(){
        return ancho;
    }
    public void setLargo(double larg){
        largo = larg;
    }
    public double getLargo(){
        return largo;
    }
    public void setArea(){
        area = (largo*ancho);
    }
    public double getArea(){
        return area;
    }
    public void setValorMetroCuadrado(double metro){
        valorMetroCuadrado = metro;
    }
    public double getValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public void setCostoTerreno(double costoT) {
        costoTerreno = costoT;
    }

    public double getCostoTerreno() {
        return valorMetroCuadrado * area;
    }
}
