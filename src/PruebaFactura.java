import javax.swing.*;
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Factura producto1 = new Factura("1", "Tornillo", 3, 4.5);
        Scanner entry = new Scanner(System.in);
        /**Declaración de variables*/
        double precioTotal;
        /**Desarrollo de la aplicación*/
        JOptionPane.showMessageDialog(null, "\tSimulador de facturas");
        producto1.setnPieza(JOptionPane.showInputDialog(null, "Ingrese el número de la pieza"));
        producto1.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese una breve descripción de la pieza"));
        producto1.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto")));
        producto1.setPrecioArticulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto")));
        //Cálculos para obtener el monto de la factura
        precioTotal = producto1.obtenerMontoFactura();
        producto1.mensaje(precioTotal);
    }
}
