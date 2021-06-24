/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Planos;
import Modelo.Proyectos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class PlanosControlador {
    private List<Planos> listaPlanos;
    private Planos seleccionado;
    
    public PlanosControlador(){
    listaPlanos= new ArrayList();
    seleccionado=null;
    }
 
    public boolean crear(long id, String numeroIdentificacion, String fechaEntrega, String graficoPlano){
        Planos planos= new Planos(id, numeroIdentificacion, fechaEntrega,graficoPlano);
        return this.listaPlanos.add(planos);
    }
    public boolean crear(long id, String numeroIdentificacion, String fechaEntrega, String graficoPlano, Proyectos propietario){
        Planos planos= new Planos(id, numeroIdentificacion, fechaEntrega,graficoPlano, propietario);
        propietario.getListaPlanos().add(planos);
        return this.listaPlanos.add(planos);
    }
    public Planos buscar (String numeroIdentificacion){
        for(Planos planos: listaPlanos){
        if(planos.getNumeroIdentificacion().equals(numeroIdentificacion)==true){
        return planos;
        }
        }
    return null;
    }
    public boolean actualizar(String numeroIdentificacion, String fechaEntrega){
    Planos planos= this.buscar(numeroIdentificacion);
    if(planos !=null){
    int posicion= listaPlanos.indexOf(planos);
    planos.setFechaEntrega(fechaEntrega);
    listaPlanos.set(posicion, planos);
    return true;
    }
    return false;
    }
    public boolean eliminar(String numeroIdentificacion){
   Planos planos= this.buscar(numeroIdentificacion);
   if(planos !=null){
   planos.getPropietario().getListaPlanos().remove(planos);
   return listaPlanos.remove(planos);
   }
   return false;
   }
    public List<Planos> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(List<Planos> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }
    
   public Planos getSeleccionado(){
   return seleccionado;
   }
   public void setSeleccionado(Planos planos){
   this.seleccionado= seleccionado;
   }
    
}
