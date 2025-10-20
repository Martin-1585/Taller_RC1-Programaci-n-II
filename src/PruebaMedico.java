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
        System.out.println("\tSimulador de registros médicos");
        System.out.println("Ingrese el nombre del paciente");
        paciente1.setNombre(entry.nextLine());
        System.out.println("Ingrese el apellido del paciente");
        paciente1.setApellido(entry.nextLine());
        System.out.println("Ingrese el sexo del paciente");
        paciente1.setSexo(entry.nextLine());
        System.out.println("Ingrese el mes de nacimiento del paciente");
        paciente1.setMes(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese el día de nacimiento del paciente");
        paciente1.setDia(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese el ano de nacimiento del paciente");
        paciente1.setAnio(Integer.parseInt(entry.nextLine()));
        System.out.println("Ingrese la altura del paciente (en cm)");
        paciente1.setAltura(Double.parseDouble(entry.nextLine()));
        System.out.println("Ingrese el peso del paciente");
        paciente1.setPeso(Double.parseDouble(entry.nextLine()));
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
