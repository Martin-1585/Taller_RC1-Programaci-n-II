import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    /**Declaración de atributos*/
    private String nombre;
    private String apellido;
    private String sexo;
    private int mes;
    private int dia;
    private int anio;
    private double altura;
    private double peso;
    /**Declaración de constructores*/
    public PerfilMedico() {
    }

    public PerfilMedico(String nombre, String apellido, String sexo, int mes, int dia, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }
    /**Métodos propios de Java*/
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**Métodos propios del programador*/
    public Integer calcularEdad(){
        LocalDate fechaNacimiento = LocalDate.of(this.getAnio(),this.getMes(),this.getDia());
        LocalDate fechaActual = LocalDate.now();
        //Calcular la edad del usuario
        Period edad =   Period.between(fechaNacimiento,fechaActual);
        return edad.getYears();
    }

    public Integer frecuenciaMaxima(int edad){
        int maximo = 220, frecuenciaMax;
        frecuenciaMax = maximo - edad;
        return frecuenciaMax;
    }

    public Double frecuenciaEsperada(int frecuenciaMax){
        double min, max, promedio;
        min = frecuenciaMax * 0.5;
        max = frecuenciaMax * 0.85;
        promedio = (min + max)/2;
        return promedio;
    }

    public Double indiceMasaC(){
        double indiceMasaC, alturaCuadrado, alturaMetros;
        alturaMetros = this.getAltura()/100;
        alturaCuadrado = (alturaMetros * alturaMetros);
        indiceMasaC = this.getPeso()/alturaCuadrado;
        return indiceMasaC;
    }

    public String valoresBMI(double iMC){
        String message;
        if (iMC > 0 && iMC <= 18.5){
            message = "Bajo peso";
        } else if (iMC > 18.5 && iMC <= 24.9){
            message = "Normal";
        } else if (iMC > 24.9 && iMC < 29.9){
            message = "Sobrepeso";
        } else {
            message = "Obeso";
        }
        return message;
    }

    public void mensajeUsuario(){
        JOptionPane.showMessageDialog(null, "\tInformación del paciente:\n" +
                "Nombre: " + this.getNombre() +
                "\nApellido: " + this.getApellido() +
                "\nSexo: " + this.getSexo() +
                "\nFecha de nacimiento: " +
                this.getMes() + "/" + this.getDia() + "/" + this.getAnio() +
                "\nAltura: " + this.getAltura() + " cm" +
                "\nPeso: " + this.getPeso() + " kg"
                );
    }

    public void signosVitales(int edad,int frecuenciaMax, double frecuenciaEsperada, double iMC, String message){
        JOptionPane.showMessageDialog(null, "\tSignos vitales:\n" +
                "Edad: " + edad +
                "\nFrecuencia Maxima: " + frecuenciaMax + " (lat/min)" +
                "\nFrecuencia Esperada: " + frecuenciaEsperada + " (lat/min)" +
                "\nIMC: " + iMC +
                "\nEstado con respecto al IMC: " + message);
    }
}
