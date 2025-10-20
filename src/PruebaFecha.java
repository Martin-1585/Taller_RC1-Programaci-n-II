import javax.swing.*;
import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Fecha fecha1 = new Fecha(10,24, 2009);
        Scanner entry = new Scanner(System.in);
        /**Desarrollo de la aplicación*/
        JOptionPane.showMessageDialog(null, "\tSimulador de fecha"); //Presentación del simulador
        fecha1.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes en el que estamos")));
        fecha1.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día en el que estamos")));
        fecha1.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año en el que estamos")));
        /**Despliegue de fecha*/
        fecha1.mostrarFecha();

    }
}
