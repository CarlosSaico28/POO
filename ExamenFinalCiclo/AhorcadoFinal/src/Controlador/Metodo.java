/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Metodo {
    Vector vPrincipal= new Vector();
    
    public void guardar(Jugador jugador){
        vPrincipal.addElement(jugador);
    }
    //guardar txt 
    
    public void guardarArchivo(Jugador jugador){
        try {
            FileWriter fw= new FileWriter("Jugador.txt",true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.print(jugador.getNombre());
            pw.print("|"+ jugador.getEdad());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public DefaultTableModel listaJugadores(){
    Vector cabeceras= new Vector();
    cabeceras.addElement("Nombre");
    cabeceras.addElement("Edad");
    //creacion de la tabla
     DefaultTableModel  mdlTabla= new DefaultTableModel(cabeceras,0);
     
        try {
            FileReader fr= new FileReader("Jugador.txt");
            BufferedReader br= new BufferedReader(fr);
            String d;
            while((d= br.readLine())!=null){
            StringTokenizer dato= new StringTokenizer(d,"|");
            Vector x= new Vector();
            while(dato.hasMoreTokens()){
            x.addElement(dato.nextToken());
            }
            mdlTabla.addRow(x);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    
    public void cboEdad(JComboBox edades){
        edades.removeAllItems();
        for (int x = 18; x < 60; x++) {
            edades.addItem(x);
        }
    
    }
    
}