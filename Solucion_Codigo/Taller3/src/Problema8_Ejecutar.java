import java.util.Random;

public class Problema8_Ejecutar {
    public static void main(String[] args) {
        Random random = new Random();
        
        String[] clientes = {"Carlos Alberca","Ricardo Rosales","Jorge Guerrero","Andres Vallejo"};
        String[] bancos = {"Banco de Loja","Banco Pichincha","Produbanco"};
        String cliente = clientes[random.nextInt(clientes.length)];
        String banco = bancos[random.nextInt(bancos.length)];
        double cheque = 450 + random.nextDouble() * 10000;
        
        Problema8_EntidadFinanciera ban = new Problema8_EntidadFinanciera(cliente, banco, cheque);
        System.out.println(ban.toString());
    }
}
