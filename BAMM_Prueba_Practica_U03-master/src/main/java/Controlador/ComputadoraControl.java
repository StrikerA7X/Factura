
package Controlador;

import Modelo.Computadora;
import Servicio.ComputadorServicio;
import java.util.List;

/**
 *
 * @author USER
 */
public class ComputadoraControl {

    private final ComputadorServicio Servicio = new ComputadorServicio();
    
    public Computadora crear(String []args){
        var computadora = new Computadora(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]));
        this.Servicio.crear(computadora);
        return computadora;
    }
    
    public List<Computadora> listar(){
        return this.Servicio.listar();
    }
    
}
