/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ComprobanteEntrada;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class EntradaControlador {
    private List<ComprobanteEntrada> datos;
    private ComprobanteEntrada seleccionado;
    
    public EntradaControlador(){
        datos = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(Date horaEntrada, Vehiculo vehiculo){
        ComprobanteEntrada comprobanteEntrada = new ComprobanteEntrada(this.generarId(), horaEntrada, vehiculo);
        //vehiculo.getListaServicios().add(servicio);
        return datos.add(comprobanteEntrada);
    }
    public ComprobanteEntrada buscar(Date horaEntrada) {
        for (ComprobanteEntrada dato : datos) {
            if(dato.getHoraEntrada().equals(horaEntrada))
                return dato;
        }
        return null;
    }
    public boolean actualizar(Date horaEntrada){
        ComprobanteEntrada comprobanteEntrada = this.buscar(horaEntrada);
        if(comprobanteEntrada != null) {
            int posicion=datos.indexOf(comprobanteEntrada);
            
            comprobanteEntrada.setHoraEntrada(horaEntrada);
            datos.set(posicion, comprobanteEntrada);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date horaEntrada) {
        ComprobanteEntrada comprobanteEntrada = this.buscar(horaEntrada);
        if(comprobanteEntrada != null){
            comprobanteEntrada.getVehiculo().getListaServicios().remove(comprobanteEntrada);
            return datos.remove(comprobanteEntrada);
        }
        return false;
    }

    public List<ComprobanteEntrada> getDatos() {
        return datos;
    }

    public void setDatos(List<ComprobanteEntrada> datos) {
        this.datos = datos;
    }

    public ComprobanteEntrada getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(ComprobanteEntrada comprobanteEntrada) {
        this.seleccionado = seleccionado;
    } 

    
}

