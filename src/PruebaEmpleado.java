import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Empleado empleado1 = new Empleado("Jose", "Espinoza", 123.56);
        Empleado empleado2 = new Empleado();
        Scanner entry = new Scanner(System.in);
        /**Declaración de variables*/
        double salarioAnual, salarioTotal;
        boolean allow = false;
        /**Desarrollo de la aplicación*/
        System.out.println("\tSimulador de salario empleados");
        System.out.println("Ingrese el nombre del empleado 1");
        empleado1.setNombre(entry.nextLine());
        System.out.println("Ingrese el apellido paterno del empleado 1");
        empleado1.setApellidoPaterno(entry.nextLine());
        do{
            System.out.println("Ingrese el salario mensual del empleado 1");
            empleado1.setSalario(Double.parseDouble(entry.nextLine()));
            allow = empleado1.ValorPermitido();
        } while(!allow);
        /**Presentación de los cálculos del empleado 1*/
        salarioAnual = empleado1.salarioAnual();
        salarioTotal = empleado1.aumento(salarioAnual);
        empleado1.mensajeSalario(salarioAnual);
        empleado1.mensajeAumento(salarioAnual,salarioTotal);

        /**Información del 2do objeto*/
        System.out.println("Ingrese el nombre del empleado 2");
        empleado2.setNombre(entry.nextLine());
        System.out.println("Ingrese el apellido paterno del empleado 2");
        empleado2.setApellidoPaterno(entry.nextLine());
        do{
            System.out.println("Ingrese el salario mensual del empleado 2");
            empleado2.setSalario(Double.parseDouble(entry.nextLine()));
            allow = empleado2.ValorPermitido();
        } while(!allow);
        /**Presentación de cálculos del empleado 2*/
        salarioAnual = empleado2.salarioAnual();
        salarioTotal = empleado2.aumento(salarioAnual);
        empleado2.mensajeSalario(salarioAnual);
        empleado2.mensajeAumento(salarioAnual,salarioTotal);

    }
}