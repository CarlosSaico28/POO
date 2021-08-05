/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.EntradaControlador;
import Controlador.VehiculoControlador;
import Modelo.ComprobanteEntrada;
import Modelo.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
//private final String nombreColumnas[]={"Id","Vehiculo","Hora Entrada",}
public class TablaEntradaModelo extends AbstractTableModel{  
    private final EntradaControlador entradaControlador;
    private final SimpleDateFormat simpleDateFormat;
    private final VehiculoControlador vehiculoControlador;
    private final Class tipoColumnas[]= new Class[] {Integer.class,String.class,Integer.class,};
    private final String nombreColumnas[]= {"Id","Hora Entrada","Vehiculo"};
    
    
    public TablaEntradaModelo(EntradaControlador entradaControlador, VehiculoControlador vehiculoControlador){
    this.entradaControlador= entradaControlador;
    this.vehiculoControlador= vehiculoControlador;
    simpleDateFormat= new SimpleDateFormat("dd-mm-yyyy HH:mm");
    }
    @Override
    public Class<?>getColumnClass(int columnIndex){
    return tipoColumnas[columnIndex];
    }
    @Override
    public String getColumnName(int columnIndex){
        return nombreColumnas[columnIndex];
    }
            
    @Override
    public int getRowCount() {
        return entradaControlador.getDatos().size();
    }

    @Override
    public int getColumnCount() {
       return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        ComprobanteEntrada  comprobanteEntrada= entradaControlador.getDatos().get(row);
        switch(column){
            case 0:
                return comprobanteEntrada.getId();
            case 1:
                if(comprobanteEntrada.getVehiculo() != null)
                    return comprobanteEntrada.getVehiculo().getPlaca();
                return"";
            case 2:
                return  simpleDateFormat.format(comprobanteEntrada.getHoraEntrada());

        }
        return null;
        
    }
    public void setValueAt(Object value,int row, int colum){
        ComprobanteEntrada comprobanteEntrada= entradaControlador.getDatos().get(row);
        try {
        switch(colum){
            case 1:
            Vehiculo vehiculo= vehiculoControlador.buscar((String)value);
                if(vehiculo !=null)
                    comprobanteEntrada.setVehiculo(vehiculo);
                break;
                
            case 2:
            Date date;
                date = simpleDateFormat.parse((String)value);
                comprobanteEntrada.setHoraEntrada(date);
                break;
                
        }
        entradaControlador.actualizar(comprobanteEntrada.getHoraEntrada());
        } catch (ParseException ex) {
                System.out.println(ex.getMessage());
    }
    }
    @Override
    public boolean isCellEditable(int row, int column){
    if(column !=0)
            return true;
            return false;
    }
}

