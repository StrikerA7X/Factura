/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Computadora;
import java.util.List;

/**
 *
 * @author USER
 */
public interface IComputadoraServicio {
    
    /**
     *
     * @param computadora
     * @return
     */
    public Computadora crear(Computadora computadora);
    public Computadora buscarPorCodigo(int Codigo);
    public List<Computadora> listar();
    
}
