import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Factura producto1 = new Factura("1", "Tornillo", 3, 4.5);
        Scanner entry = new Scanner(System.in);
        /**Declaración de variables*/
        double precioTotal;
        /**Desarrollo de la aplicación*/
        System.out.println("\tSimulador de facturas");
        System.out.println("Ingrese el número de la pieza");
        producto1.setnPieza(entry.nextLine());
        System.out.println("Ingrese una breve descripción de la pieza");
        producto1.setDescripcion(entry.nextLine());
        System.out.println("Ingrese la cantidad del producto");
        producto1.setCantidad(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese el precio del producto");
        producto1.setPrecioArticulo(Double.parseDouble(entry.nextLine()));
        //Cálculos para obtener el monto de la factura
        precioTotal = producto1.obtenerMontoFactura();
        producto1.mensaje(precioTotal);
    }
}
