/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Modelo.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ArchivoTexto {

    private String ruta;

    public ArchivoTexto(String ruta) {
        this.ruta = ruta;
    }

    public void escribir(List<Cliente> clientes) {
        try {
            FileWriter archivo = new FileWriter(this.ruta);
            BufferedWriter escritura = new BufferedWriter(archivo);
            for (Cliente cliente : clientes) {
                escritura.append(cliente.getId() + "\n");
                escritura.append(cliente.getNombre() + "\n");
                escritura.append(cliente.getApellido()+"\n");
                escritura.append(cliente.getCedula()+"\n");
            }
            escritura.close();
            archivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<Cliente> leer() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            FileReader archivo = new FileReader(this.ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            String lineaId = "";
            String lineaNombre = "";
            String lineaApellido = "";
            String lineaCedula = "";
            while(lineaId != null && lineaNombre != null){
                lineaId = lectura.readLine();
                lineaNombre = lectura.readLine();
                lineaApellido= lectura.readLine();
                lineaCedula= lectura.readLine();
                if (lineaId != null && lineaNombre != null&&lineaApellido!=null && lineaCedula!=null){
                    Cliente e = new Cliente(Integer.parseInt(lineaId), lineaNombre,lineaApellido, lineaCedula);
                    clientes.add(e);
                }
            }
            lectura.close();
            archivo.close();
            return clientes;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return clientes;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
