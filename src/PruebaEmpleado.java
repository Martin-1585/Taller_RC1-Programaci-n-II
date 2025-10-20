import javax.swing.*;
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
        JOptionPane.showMessageDialog(null, "\tSimulador de salario empleados");
        empleado1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado 1"));
        empleado1.setApellidoPaterno(JOptionPane.showInputDialog(null, "Ingrese el apellido paterno del empleado 1"));
        do{
            empleado1.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario mensual del empleado 1")));
            allow = empleado1.ValorPermitido();
        } while(!allow);
        /**Presentación de los cálculos del empleado 1*/
        salarioAnual = empleado1.salarioAnual();
        salarioTotal = empleado1.aumento(salarioAnual);
        empleado1.mensajeSalario(salarioAnual);
        empleado1.mensajeAumento(salarioAnual,salarioTotal);

        /**Información del 2do objeto*/
        empleado2.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado 2"));
        empleado2.setApellidoPaterno(JOptionPane.showInputDialog(null, "Ingrese el apellido paterno del empleado 2"));
        do{
            empleado2.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario mensual del empleado 2")));
            allow = empleado2.ValorPermitido();
        } while(!allow);
        /**Presentación de cálculos del empleado 2*/
        salarioAnual = empleado2.salarioAnual();
        salarioTotal = empleado2.aumento(salarioAnual);
        empleado2.mensajeSalario(salarioAnual);
        empleado2.mensajeAumento(salarioAnual,salarioTotal);

    }
}