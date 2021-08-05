/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ComprobanteEntrada;
import Modelo.ComprobanteSalida;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class SalidaControlador {
    private List<ComprobanteSalida> datos;
    private ComprobanteSalida seleccionado;
    public static double COSTO_HORA = 1; // Variable estatica, no se puede cambiar el valor
    
    public SalidaControlador(){
        datos = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(Date horaEntrada, Date horaSalida, double valorPagar, ComprobanteEntrada comprobanteEntrada){
        ComprobanteSalida comprobanteSalida = new ComprobanteSalida(this.generarId(), horaEntrada, horaSalida, valorPagar,  comprobanteEntrada);
        //vehiculo.getListaServicios().add(servicio);
        return datos.add(comprobanteSalida);
    }
    public ComprobanteSalida buscar(Date horaEntrada) {
        for (ComprobanteSalida dato : datos) {
            if(dato.getHoraEntrada().equals(horaEntrada))
                return dato;
        }
        return null;
    }
    public boolean actualizar(Date horaEntrada, Date horaSalida){
        ComprobanteSalida comprobanteSalida = this.buscar(horaEntrada);
        if(comprobanteSalida!= null) {
            int posicion = datos.indexOf(comprobanteSalida);
            comprobanteSalida.setHoraSalida(horaSalida);
            long diferenciaSegundos = Math.abs(comprobanteSalida.getHoraSalida().getTime() - comprobanteSalida.getHoraEntrada().getTime());
            long minutos = TimeUnit.MINUTES.convert(diferenciaSegundos, TimeUnit.MILLISECONDS);
            double valorPagar = minutos * (this.COSTO_HORA / 60);
            String str = String.format("%1.2f", valorPagar);
            valorPagar = Double.valueOf(str);
            comprobanteSalida.setValorPagar(valorPagar);
            datos.set(posicion, comprobanteSalida);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date horaEntrada) {
        ComprobanteSalida comprobanteSalida = this.buscar(horaEntrada);
        if(comprobanteSalida != null){
            comprobanteSalida.getComprobanteEntrada().getListaComprobanteSalida().remove(comprobanteSalida);
            return datos.remove(comprobanteSalida);
        }
        return false;
    }

    public List<ComprobanteSalida> getDatos() {
        return datos;
    }

    public void setDatos(List<ComprobanteSalida> datos) {
        this.datos = datos;
    }

    public ComprobanteSalida getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(ComprobanteSalida seleccionado) {
        this.seleccionado = seleccionado;
    } 
    
}
