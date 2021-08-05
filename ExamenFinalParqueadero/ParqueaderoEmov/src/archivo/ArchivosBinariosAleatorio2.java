/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Controlador.EntradaControlador;
import Modelo.ComprobanteSalida;
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
public class ArchivosBinariosAleatorio2 {
    private String ruta;
    public ArchivosBinariosAleatorio2(String ruta){
        this.ruta = ruta;
    }
    public void escribir(List<ComprobanteSalida> comprobanteSalidas) throws IOException{
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            for (ComprobanteSalida comprobanteSalida : comprobanteSalidas) {
                archivo.writeLong(comprobanteSalida.getId());
                archivo.writeLong(comprobanteSalida.getHoraEntrada().getTime());
                archivo.writeLong(comprobanteSalida.getHoraSalida().getTime());
                archivo.writeDouble(comprobanteSalida.getValorPagar());

            }
            archivo.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
        }
    }
    public List<ComprobanteSalida> leer(EntradaControlador entradaControlador){
        List<ComprobanteSalida> comprobanteSalidas = new ArrayList<>();
        try {
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");
            while (true) {                
                ComprobanteSalida comprobanteSalida = new ComprobanteSalida(archivo.readLong(), new Date(archivo.readLong()), new Date(archivo.readLong()), archivo.readDouble());
                
                comprobanteSalidas.add(comprobanteSalida);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
        }
        return comprobanteSalidas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}

