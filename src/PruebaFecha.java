import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Fecha fecha1 = new Fecha(10,24, 2009);
        Scanner entry = new Scanner(System.in);
        /**Desarrollo de la aplicación*/
        System.out.println("\tSimulador de fecha"); //Presentación del simulador
        System.out.println("Ingrese el mes en el que estamos");
        fecha1.setMes(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese el día en el que estamos");
        fecha1.setDia(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese el año en el que estamos");
        fecha1.setAnio(Integer.parseInt(entry.nextLine()));
        /**Despliegue de fecha*/
        fecha1.mostrarFecha();

    }
}
