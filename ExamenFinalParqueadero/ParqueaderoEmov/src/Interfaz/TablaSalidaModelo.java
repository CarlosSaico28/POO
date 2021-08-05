/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.EntradaControlador;
import Controlador.SalidaControlador;
import Controlador.VehiculoControlador;
import Modelo.ComprobanteEntrada;
import Modelo.ComprobanteSalida;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class TablaSalidaModelo extends AbstractTableModel {
    private final SimpleDateFormat simpleDateFormat;
    private final SalidaControlador salidaControlador;
    private final EntradaControlador entradaControlador;
    private final Class tipoColumnas[] = new Class[]{Integer.class, String.class, String.class, String.class, Double.class};
    private final String nombreColumnas[] = {"Id", "Vehiculo", "Hora Entrada", "Hora Salida", "Valor"};

    public TablaSalidaModelo(SalidaControlador salidaControlador, EntradaControlador entradaControlador) {
        this.salidaControlador = salidaControlador;
        this.entradaControlador = entradaControlador;   
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }
    @Override
    public String getColumnName(int columnIndex)
    {
        return nombreColumnas[columnIndex];
    }
    @Override
    public int getRowCount() {
        return salidaControlador.getDatos().size();
    }
    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }
    @Override
    public Object getValueAt(int row, int column) {
        ComprobanteSalida comprobanteSalida = salidaControlador.getDatos().get(row);
        switch (column) {
            case 0:
                return comprobanteSalida.getId();
            case 1:
                if(comprobanteSalida.getComprobanteEntrada() != null)
                    return comprobanteSalida.getComprobanteEntrada().getHoraEntrada();
                return "";
            case 2:
                return simpleDateFormat.format(comprobanteSalida.getHoraEntrada());
            case 3:
                if(comprobanteSalida.getHoraSalida() != null)
                    return simpleDateFormat.format(comprobanteSalida.getHoraSalida());
            case 4:
                return comprobanteSalida.getValorPagar();
        }
        return null;
    }
    @Override
    public void setValueAt(Object value, int row, int column) {
        ComprobanteSalida comprobanteSalida = salidaControlador.getDatos().get(row);
        try {
            switch (column) {
                case 1:
                    ComprobanteEntrada comprobanteEntrada = entradaControlador.buscar((Date)value);
                    if(comprobanteEntrada != null)
                        comprobanteSalida.setComprobanteEntrada(comprobanteEntrada);
                    break;
                case 2:
                    Date date = simpleDateFormat.parse((String) value);
                    comprobanteSalida.setHoraEntrada(date);
                    break;
                case 3:
                    Date dateSalida = simpleDateFormat.parse((String) value);
                    comprobanteSalida.setHoraSalida(dateSalida);
                    salidaControlador.actualizar(comprobanteSalida.getHoraEntrada(), comprobanteSalida.getHoraSalida());
                    break;
                case 4:
//                    servicio.setValorPagar((Double) value);
                    break;
            }
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if(column != 0)
            return true;
        return false;
    }
    

}
