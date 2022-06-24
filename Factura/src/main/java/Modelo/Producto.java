/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gus-Gus
 */
public class Producto {
    
    private String nombreProducto;
    private String tipoProducto;
    private int catidadProducto;
    private int codigoProducto;
    private int precioProducto;
    private int productoStok;
    private Factura Factura;

    public Producto(String nombreProducto, String tipoProducto, int catidadProducto, int codigoProducto, int precioProducto, int productoStok, Factura Factura) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.catidadProducto = catidadProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.productoStok = productoStok;
        this.Factura = Factura;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCatidadProducto() {
        return catidadProducto;
    }

    public void setCatidadProducto(int catidadProducto) {
        this.catidadProducto = catidadProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getProductoStok() {
        return productoStok;
    }

    public void setProductoStok(int productoStok) {
        this.productoStok = productoStok;
    }

    public Factura getFactura() {
        return Factura;
    }

    public void setFactura(Factura Factura) {
        this.Factura = Factura;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", tipoProducto=" + tipoProducto + ", catidadProducto=" + catidadProducto + ", codigoProducto=" + codigoProducto + ", precioProducto=" + precioProducto + ", productoStok=" + productoStok + ", Factura=" + Factura + '}';
    }
    
}
