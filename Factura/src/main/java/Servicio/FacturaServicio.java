/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author Gus-Gus
 */
import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author TUF GAMING
 */
public class FacturaServicio implements IFacturaSerivicio {

 private static List<Factura> facturaList = new ArrayList<>();

 @Override
 
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

 @Override
    public Factura modificar(int codigoNuevo, Factura facturaNuevo) {
        var posicion = this.buscarposicion(this.buscarPorCodigo(codigoNuevo));
        this.listar().get(posicion).setNumFactura(facturaNuevo.getNumFactura());
        this.listar().get(posicion).setFecha(facturaNuevo.getFecha());
        this.listar().get(posicion).setTotal(facturaNuevo.getTotal());
        this.listar().get(posicion).setCantidad(facturaNuevo.getCantidad());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        this.listar().get(posicion).setUnCliente(facturaNuevo.getUnCliente());
        this.listar().get(posicion).setUnProducto(facturaNuevo.getUnProducto());
        return facturaNuevo;
    }

    @Override
     public Factura eliminar(int codigoFactura) {
        Factura factura = this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPorCodigo(codigoFactura);
        this.listar().remove(posicion);
        return factura;
    }

    @Override
      public Factura buscarPorCodigo(int codigoFactura) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFactura==f.getCodigo()){
                factura=f;
                break;
            }
     }
        return factura;
    }

    @Override
    
    public int buscarposicion(Factura factura) {
    int posicion=-1;
        for(var f:this.facturaList){
            posicion++;
            if(f.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    
    public List<Factura> listar() {
        return this.facturaList;
    }

    @Override
    public int buscarPosicion(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
