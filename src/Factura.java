import javax.swing.*;

public class Factura {
    /**Declaración de artibutos*/
    private String nPieza;
    private String descripcion;
    private int cantidad;
    private double precioArticulo;
    /**Declaración de constructores*/
    public Factura() {
    }

    public Factura(String nPieza, String descripcion, int cantidad, double precioArticulo) {
        this.nPieza = nPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioArticulo = precioArticulo;
    }
    /**Métodos propios de Java*/
    public String getnPieza() {
        return nPieza;
    }

    public void setnPieza(String nPieza) {
        this.nPieza = nPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
    /**Métodos propios del programador*/
    public Double obtenerMontoFactura(){
        double precioTotal;
        if (this.getCantidad() < 0){
            precioTotal = 0.0;
        } else if (this.getPrecioArticulo() < 0){
            precioTotal = 0.0;
        } else {
            precioTotal = this.getPrecioArticulo() * this.getCantidad();
        }
        return precioTotal;
    }

    public void mensaje(double precioTotal){
        JOptionPane.showMessageDialog(null,"El monto factura es:\n"
                + "Número de pieza: " + this.getnPieza()
                + "\nDescripción: " + this.getDescripcion()
                + "\nCantidad: " + this.getCantidad()
                + "\nPrecio: $" + precioTotal);

    }
}
