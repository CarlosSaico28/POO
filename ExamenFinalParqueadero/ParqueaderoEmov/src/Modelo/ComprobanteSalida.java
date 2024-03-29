/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ComprobanteSalida {
    private long id;
    private Date horaEntrada;
    private Date horaSalida;
    private double valorPagar;
    private ComprobanteEntrada comprobanteEntrada;

    public ComprobanteSalida(long id, Date horaEntrada, Date horaSalida, double valorPagar) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorPagar = valorPagar;
    }

    public ComprobanteSalida(long id, Date horaEntrada, Date horaSalida, double valorPagar,ComprobanteEntrada comprobanteEntrada) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorPagar = valorPagar;
        this.comprobanteEntrada = comprobanteEntrada;
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

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public ComprobanteEntrada getComprobanteEntrada() {
        return comprobanteEntrada;
    }

    public void setComprobanteEntrada(ComprobanteEntrada comprobanteEntrada) {
        this.comprobanteEntrada = comprobanteEntrada;
    }

    @Override
    public String toString() {
        return "ComprobanteSalida{" + "id=" + id + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", valorPagar=" + valorPagar + '}';
    }
    
    

 
}

