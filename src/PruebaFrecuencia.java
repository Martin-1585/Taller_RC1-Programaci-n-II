import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaFrecuencia {
    public static void main(String[] args) throws IOException {
        /**Declaración de objetos*/
        FrecuenciasCardiacas paciente1 = new FrecuenciasCardiacas("Lukas", "Bustamante", 1, 10, 2006);
        BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
        /**Variables*/
        int edad, frecuenciaMax;
        double frecuenciaEsperada;
        /**Desarrollo de la aplicación de JAVA
         * Ingreso de datos del usuario*/
        System.out.println("\tSimulador de calculadora de frecuencia cardíaca");
        System.out.println("Ingrese la información del paciente:");
        System.out.println("Nombre: ");
        paciente1.setNombre(entry.readLine());
        System.out.println("Apellido: ");
        paciente1.setApellido(entry.readLine());
        System.out.println("Mes de nacimiento");
        paciente1.setMes(Integer.parseInt(entry.readLine()));
        System.out.println("Día de nacimiento");
        paciente1.setDia(Integer.parseInt(entry.readLine()));
        System.out.println("Año de nacimiento");
        paciente1.setAnio(Integer.parseInt(entry.readLine()));
        /**Calculo de datos*/
        edad = paciente1.edadUsuario();
        frecuenciaMax = paciente1.frecuenciaMax(edad);
        frecuenciaEsperada = paciente1.frecuenciaEsperada(frecuenciaMax);
        paciente1.informacionPaciente(edad,frecuenciaMax,frecuenciaEsperada);
    }
}
