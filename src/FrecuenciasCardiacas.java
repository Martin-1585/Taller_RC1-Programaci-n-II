import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    /**Declaración de atributos*/
    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int anio;
    /**Declaración de constructores*/
    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public FrecuenciasCardiacas(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    /**Métodos propios de JAVA*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**Métodos propios del programador*/
    public Integer edadUsuario(){
        LocalDate fechaNacimiento = LocalDate.of(this.getAnio(), this.getMes(), this.getDia());
        LocalDate fechaActual = LocalDate.now();
        //Calcular la diferencia entre fechas
        Period diferencia = Period.between(fechaNacimiento,fechaActual);
        return diferencia.getYears();
    }

    public Integer frecuenciaMax(int edad){
        int maximo = 220, frecuenciaMaxima;
        frecuenciaMaxima = maximo - edad;
        return frecuenciaMaxima;
    }

    public Double frecuenciaEsperada(int frecuenciaMax){
        double promedio, min, max;
        min = frecuenciaMax * 0.5;
        max = frecuenciaMax * 0.85;
        promedio = (max + min)/2;
        return promedio;
    }

    public void informacionPaciente(int edad, int frecuenciaMax, double frecuenciaEsperada){
        JOptionPane.showMessageDialog(null, "\tInformación del paciente:\n" +
                "Nombre: "+this.getNombre() +
                "\nApellido: "+this.getApellido() +
                "\nEdad: " + edad +
                "\nFrecuencia Maxima: " + frecuenciaMax + " (lat/min)"+
                "\nFrecuencia Esperada: " + frecuenciaEsperada + " (lat/min)");
    }

}
