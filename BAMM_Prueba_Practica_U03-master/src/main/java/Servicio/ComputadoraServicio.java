
package Servicio;

import Modelo.Computadora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ComputadoraServicio implements IComputadoraServicio {

    public static List<Computadora> computadoraList = new ArrayList<>();
    
    @Override
    public Computadora crear(Computadora computadora) {
        ComputadoraServicio.computadoraList.add(computadora);
        return computadora;
        
    }

    @Override
    public Computadora buscarPorCodigo(int i) {
        var computadora = new Computadora();
        for(Computadora p:ComputadoraServicio.computadoraList){
            if(p.getCodigo()==i){
                computadora=p;
                break;
            }
        }
        return computadora;
    }

    @Override
    public List<Computadora> listar() {
        return ComputadoraServicio.computadoraList;
    }

}
