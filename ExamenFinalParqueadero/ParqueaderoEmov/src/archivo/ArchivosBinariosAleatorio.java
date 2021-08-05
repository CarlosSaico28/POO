/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Controlador.EntradaControlador;
import Controlador.VehiculoControlador;
import Modelo.ComprobanteEntrada;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ArchivosBinariosAleatorio {
    private String ruta;
    public ArchivosBinariosAleatorio(String ruta){
        this.ruta = ruta;
    }
    public void escribir(List<ComprobanteEntrada> comprobanteEntradas) throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            for (ComprobanteEntrada comprobanteEntrada : comprobanteEntradas) {
                archivo.writeLong(comprobanteEntrada.getId());
                archivo.writeLong(comprobanteEntrada.getHoraEntrada().getTime());
                archivo.writeUTF(comprobanteEntrada.getVehiculo().getPlaca());
            }
            archivo.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
        }
    }
    public List<ComprobanteEntrada> leer(VehiculoControlador vehiculoControlador){
        List<ComprobanteEntrada> comprobanteEntradas = new ArrayList<>();
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            while (true) {                
                ComprobanteEntrada comprobanteEntrada = new ComprobanteEntrada(archivo.readLong(),new Date(archivo.readLong()));
                comprobanteEntrada.setVehiculo(vehiculoControlador.buscar(archivo.readUTF()));
                comprobanteEntradas.add(comprobanteEntrada);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
        }
        return comprobanteEntradas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
