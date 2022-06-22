
package Servicio;

import Modelo.Computadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ComputadorServicio implements ComputadoraServicio {

    public static List<Computadora> computadorList = new ArrayList<>();
    
    @Override
    public Computadora crear(Computadora pelicula) {
        ComputadorServicio.computadorList.add(pelicula);
        return pelicula;
        
    }

    @Override
    public Computadora buscarPorCodigo(int i) {
        var pelicula = new Computadora();
        for(Computadora p:ComputadorServicio.computadorList){
            if(p.getCodigo()==i){
                pelicula=p;
                break;
            }
        }
        return pelicula;
    }

    @Override
    public List<Computadora> listar() {
        return ComputadorServicio.computadorList;
    }

}
