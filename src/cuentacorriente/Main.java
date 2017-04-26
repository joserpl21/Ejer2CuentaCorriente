package cuentacorriente;

/**
 *
 * @author Berta
 */
public class Main {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente miCuenta;
        double saldoActual;
        
        miCuenta = new CuentaCorriente("Mariano Martinez","1001-5632-58-234567891",2500,0);
        try 
        {
            miCuenta.retirar(-5);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(1695);
        } catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }
    
}
