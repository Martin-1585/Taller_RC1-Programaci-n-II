import javax.swing.*;
import java.awt.*;
import java.time.Period;
import java.util.Scanner;

public class PruebaMedico {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        PerfilMedico paciente1 = new PerfilMedico();
        Scanner entry = new Scanner(System.in);
        /**Declaración de variables*/
        int edad, frecuenciaMax;
        double frecuenciaEsperada, iMC;
        String message;
        /**Desarrollo de la aplicación*/
        JOptionPane.showMessageDialog(null, "\tSimulador de registros médicos");
        paciente1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente"));
        paciente1.setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido del paciente"));
        paciente1.setSexo(JOptionPane.showInputDialog(null, "Ingrese el sexo del paciente"));
        paciente1.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento del paciente")));
        paciente1.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día de nacimiento del paciente")));
        paciente1.setAnio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento del paciente")));
        paciente1.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del paciente (en cm)")));
        paciente1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso del paciente (kg)")));
        //Asignación de métodos a variables
        edad = paciente1.calcularEdad();
        frecuenciaMax = paciente1.frecuenciaMaxima(edad);
        frecuenciaEsperada = paciente1.frecuenciaEsperada(frecuenciaMax);
        iMC = paciente1.indiceMasaC();
        message = paciente1.valoresBMI(iMC);
        //Mostrar mensajes
        paciente1.mensajeUsuario();
        paciente1.signosVitales(edad,frecuenciaMax,frecuenciaEsperada,iMC,message);
    }
}
