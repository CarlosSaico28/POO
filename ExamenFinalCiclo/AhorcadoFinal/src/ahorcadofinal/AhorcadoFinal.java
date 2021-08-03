/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadofinal;

import Modelo.Palabras;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class AhorcadoFinal {
    public static void main(String[] args) throws IOException{
    ArrayList<Palabras> palabras= new ArrayList();
    palabras.add(new Palabras("Programacion"));
    palabras.add(new Palabras("Secreto"));
    palabras.add(new Palabras("Ecuador"));
    palabras.add(new Palabras("Amazonas"));
    
try {    
    FileWriter fw= new FileWriter("Palabras.txt",true);
    BufferedWriter bw= new BufferedWriter(fw);
    PrintWriter pw= new PrintWriter(bw);
    pw.print(palabras.get(0));
    pw.print(palabras.get(1));
    pw.print(palabras.get(2));
    pw.print(palabras.get(3));
    pw.close();
    }
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    
}
