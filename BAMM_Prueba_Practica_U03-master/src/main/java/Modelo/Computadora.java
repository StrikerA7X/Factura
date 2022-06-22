
package Modelo;

/**
 *
 * @author USER
 */
public class Computadora {

    private int codigo;
    private String ram;
    private String modelo;
    private int marca;

    public Computadora(int codigo, String ram, String modelo, int marca) {
        this.codigo = codigo;
        this.ram = ram;
        this.modelo =modelo;
        this.marca = marca;
    }

    public Computadora() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String titulo) {
        this.ram = titulo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String director) {
        this.modelo = director;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int numeroActores) {
        this.marca = numeroActores;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", ram=" + ram + ", modelo=" + modelo + ", marca=" + marca + '}';
    }

    public Object getram() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getmodelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getmarca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
