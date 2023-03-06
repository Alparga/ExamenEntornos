
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoJDM2223 miVehiculoJDM2223;
        int stockActual;
        
        miVehiculoJDM2223 = new VehiculoJDM2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoJDM2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        operativaVehiculosJDM2223(miVehiculoJDM2223, 100);
    }

    private static void operativaVehiculosJDM2223(VehiculoJDM2223 miVehiculoJDM2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoJDM2223.comprar(cantidad);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoJDM2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
