import javax.swing.*;

public class Empleado {
    /**Declaración de atributos*/
    private String nombre;
    private String apellidoPaterno;
    private double salario;
    /**Declaración de constructores*/
    public Empleado() {
    }

    public Empleado(String nombre, String apellidoPaterno, double salario) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
    }
    /**Métodos propios de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {

        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**Métodos propios del programador*/
    public Boolean ValorPermitido(){
        boolean allow;
        if (this.getSalario() < 0){
            System.out.println("Valor no permitido, ingrese nuevamente");
            allow = false;
        } else {
            allow = true;
        }
        return allow;
    }

    public Double salarioAnual(){
        double salarioAnual;
        salarioAnual = this.getSalario() * 12;
        return salarioAnual;
    }

    public Double aumento(double salarioAnual){
        double aumento, salarioTotal;
        aumento = (salarioAnual * 0.10);
        salarioTotal = salarioAnual + aumento;
        return salarioTotal;
    }

    public void mensajeSalario(double salarioAnual){
        JOptionPane.showMessageDialog(null, "\tInformación para factura anual\n"
                + "Nombre: " + this.getNombre()
                + "\nApellido paterno: " + this.getApellidoPaterno()
                + "\nSalario anual: $" + salarioAnual);
    }

    public void mensajeAumento(double salarioAnual, double salarioTotal){
        JOptionPane.showMessageDialog(null, "\tInformación para factura con aumento\n"
                + "Nombre: " + this.getNombre()
                + "\nApellido paterno: " + this.getApellidoPaterno()
                + "\nSalario anual: $" + salarioAnual
                + "\nSalario con aumento del 10%: $" + salarioTotal);
    }
}
