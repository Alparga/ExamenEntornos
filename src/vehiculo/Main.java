
package vehiculo;

/**
 *
 * @author Jorge del Cid Moreno
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoJDM2223 miVehiculoJDM2223;
        int stockActual;
        

        operativaVehiculosJDM2223(20);
    }

      /**
       * 
       * @param cantidad 
       */
    private static void operativaVehiculosJDM2223(int cantidad) {
        VehiculoJDM2223 miVehiculoJDM2223;
        int stockActual;
        
        miVehiculoJDM2223 = new VehiculoJDM2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoJDM2223.vender(cantidad);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoJDM2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoJDM2223.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

}
    
