/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ComprobanteEntrada {
    private long id;
    private Date horaEntrada;
    private Vehiculo vehiculo;
    private List<ComprobanteSalida> listaComprobanteSalida;
    
    

    public ComprobanteEntrada(long id, Date horaEntrada) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.listaComprobanteSalida= new ArrayList();
    }

    public ComprobanteEntrada(long id, Date horaEntrada,Vehiculo vehiculo,List<ComprobanteSalida> listaComprobanteSalida) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.vehiculo = vehiculo;
        this.listaComprobanteSalida= listaComprobanteSalida;
    }
        public ComprobanteEntrada(long id, Date horaEntrada,Vehiculo vehiculo) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.vehiculo = vehiculo;
        this.listaComprobanteSalida= new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<ComprobanteSalida> getListaComprobanteSalida() {
        return listaComprobanteSalida;
    }

    public void setListaComprobanteSalida(List<ComprobanteSalida> listaComprobanteSalida) {
        this.listaComprobanteSalida = listaComprobanteSalida;
    }

    @Override
    public String toString() {
        return "ComprobanteEntrada{" + "id=" + id + ", horaEntrada=" + horaEntrada + ", vehiculo=" + vehiculo + '}';
    }
    
    

 
}