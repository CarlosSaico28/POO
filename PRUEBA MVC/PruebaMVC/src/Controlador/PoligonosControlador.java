/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Figura;
import Modelo.Poligonos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class PoligonosControlador {
    private List<Poligonos> listaPoligonos;
    private Poligonos seleccionado;
    
    public void PoligonosControlador(){
    listaPoligonos= new ArrayList();
    seleccionado=null;
    }
    public boolean crear(long id, int numeroLineas, String lineasConforman){
        Poligonos poligonos= new Poligonos(id, numeroLineas, lineasConforman);
        return this.listaPoligonos.add(poligonos);
    }

    public Poligonos buscar(String lineasConforman){
    for( Poligonos poligonos: listaPoligonos){
        if(poligonos.getLineasConforman().equals(lineasConforman)){
        return poligonos;
        }
    }
    return null;
    }
    
    public boolean actualizar(String lineasConforman, int numeroLineas){
        Poligonos poligonos = this.buscar(lineasConforman);
        if(poligonos != null){
            int posicion = listaPoligonos.indexOf(poligonos);
            poligonos.setNumeroLineas(numeroLineas);
            listaPoligonos.set(posicion, poligonos);
            return true;
        }
        return false;
    }
    public boolean eliminar(String lineasConforman){
        Poligonos poligonos = this.buscar(lineasConforman);
        if(poligonos != null) {
            poligonos.getFigura().getListaPoligonos().remove(poligonos);
            return listaPoligonos.remove(poligonos);
        }
        return false;    
    }
    public List<Poligonos> getListaPoligonos(){
    return listaPoligonos;
    }
    public void setListaPoligonos(List<Poligonos> listaPoligonos){
    this.listaPoligonos= listaPoligonos;
    }
    public Poligonos getSeleccionado(){
    return seleccionado;
    }
    public void setSeleccionado(Poligonos seleccionado){
    this.seleccionado= seleccionado;
    }

    public boolean crear(long id, int numeroLineas, String lienasConforman, Figura figura) {
              Poligonos poligonos= new Poligonos(id, numeroLineas, lienasConforman,figura);
        return this.listaPoligonos.add(poligonos);
    }


}
