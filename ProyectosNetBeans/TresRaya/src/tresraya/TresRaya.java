/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresraya;

import javax.swing.JFrame;

public class TresRaya {

    public static void main (String [] args){
    TresEnRaya ventana= new TresEnRaya();
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(500,500);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setTitle("Tres en Raya");
    ventana.setVisible(true);
    }
    
}
