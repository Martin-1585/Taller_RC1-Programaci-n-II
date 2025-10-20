import javax.swing.*;

public class Fecha {
    /**Declaración de atributos*/
    private int mes;
    private int dia;
    private int anio;
    /**Declaración de constructores*/
    public Fecha() {
    }

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    /**Métodos propios de Java*/
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
    public void mostrarFecha(){
        JOptionPane.showMessageDialog(null,"La fecha ingresada es\n"
            + this.getMes() + "/" + this.getDia() + "/" + this.getAnio());
    }

}
