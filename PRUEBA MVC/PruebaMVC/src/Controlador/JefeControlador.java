/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jefe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class JefeControlador {
    
    private List<Jefe> listaJefe;
    private Jefe seleccionado;
    
    public JefeControlador(){
    listaJefe= new ArrayList();
    seleccionado=null;
    }
    
    public boolean crear(long id, String codigo, String nombre, String apellido, String direccion, String telefono){
        Jefe jefe= new Jefe(id,codigo,nombre,apellido,direccion,telefono);
        return listaJefe.add(jefe);
    }
    
    public Jefe buscar(String codigo){
        for (Jefe jefe : listaJefe) {
            if(jefe.getCodigo().equals(codigo)){
                return  jefe;
            }
        }
        return null;
    }    
    
    public boolean actualizar(String codigoAnterior, String codigoNuevo){
        Jefe jefe = this.buscar(codigoAnterior);
        if(jefe != null) {
            int posicion = listaJefe.indexOf(jefe);
            jefe.setCodigo(codigoNuevo);
            listaJefe.set(posicion, jefe);
            return true;
        }
        return false;
    }

    public boolean eliminar(String codigo){
        Jefe jefe = this.buscar(codigo);
        if(jefe != null) {
            return listaJefe.remove(jefe);
        }
        return false;
    }   
    
        public List<Jefe> getListaJefe() {
        return listaJefe;
    }

    public void setListaJefe(List<Jefe> listaJefe) {
        this.listaJefe = listaJefe;
    }

    public Jefe getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Jefe seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
