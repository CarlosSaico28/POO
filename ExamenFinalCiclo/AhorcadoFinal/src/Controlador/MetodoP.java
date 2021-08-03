/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Palabras;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class MetodoP {
    Vector vPrincipal= new Vector();
    
    public void guardar(Palabras palabras){
        vPrincipal.addElement(palabras);
    }
    //guardar txt 
    
    public void guardarArchivo(Palabras palabras){
        try {
            FileWriter fw= new FileWriter("Palabras.txt",true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.print(palabras.getPalabras());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    public DefaultTableModel listaJugadores(){
    Vector cabeceras= new Vector();
    cabeceras.addElement("Palabras");
    //creacion de la tabla
     DefaultTableModel  mdlTabla= new DefaultTableModel(cabeceras,0);
     
        try {
            FileReader fr= new FileReader("Palabras.txt");
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
 
}
