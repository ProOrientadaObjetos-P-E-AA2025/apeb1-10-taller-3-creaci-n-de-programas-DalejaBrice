
public class Problema4_DispositivosElectronicos {
    public String sistemaOperativo;
    public double tamanioPantalla;
    public double costoInicial;
    public double iva;
    public double ivaCostoInicial;
    public double costoFinal;
    public String direccionMac;
    public String infoImei;
    
    public Problema4_DispositivosElectronicos(String sistema, double tamanio, double costoI, 
            double i, String direcM, String infImei){
        sistemaOperativo = sistema;
        tamanioPantalla = tamanio;
        costoInicial = costoI;
        iva = i;
        direccionMac = direcM;
        infoImei = infImei;
        ivaCostoInicial = costoInicial * (iva/100);
         costoFinal = costoInicial + ivaCostoInicial;
    }
    public String toString(){
        return "Sistema Operativo\n_______________________\nTamanio de la pantalla: "+tamanioPantalla+"\n Costo: "+costoFinal+"\nDireccion "
                +direccionMac+"\n Informacion IMEI: "+infoImei;
    }
}
