/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Game {

    private JTextField jTextField;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private boolean play = false;

    private final String[] DICCIONARIO = {"PROGRAMACION","ECUADOR","AMAZONAS","EXAMEN","SECRETO","CONGRESO","FINAL","MUNDIAL","TELEFONO","RADIO"};
    
    private char[] palabra_secreta;
    private char[] palabra;

    private int intentos = 0;
    private boolean cambios = false;

    /**
     * Constructor de clase
     * @param jTextField Control donde va la palabra
     * @param jLabel1 Para mostrar la cantidad de fallos
     * @param jLabel2 Para mostrar la imagen del colgado
     */
    public Game(JTextField jTextField, JLabel jLabel1, JLabel jLabel2) {        
        this.jTextField = jTextField;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        

        palabra_secreta = DICCIONARIO[(int) (Math.random() * (DICCIONARIO.length))].toCharArray();
        System.out.println(Arrays.toString(palabra_secreta)); //no haga trampa
        String s = "";
       
        for (int i = 0; i <= palabra_secreta.length - 1; i++) {
            s = s + "_";            
        }

        this.palabra = s.toCharArray();
        

        jTextField.setText(s);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/net/jc_mouse/ahorcado/resources/emo0.jpg")));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/net/jc_mouse/ahorcado/resources/ahorcado_0.jpg")));
        this.play = true;
    }
    
    /**
     * evalua el juego de acuerdo a los caracteres que se le pase
     * @param letra
     */
    public void evaluar(char letra) {
        if (play) {
            String p = "";

            if (intentos == 4) {
                JOptionPane.showMessageDialog(null, "HA PERDIDO");
            } else {
            
                for (int j = 0; j <= this.palabra_secreta.length - 1; j++) {
           
                    if (this.palabra_secreta[j] == letra) {
                        this.palabra[j] = letra;
                        cambios = true;
                    }
                    p = p + this.palabra[j];
                }
                
                
                if (cambios == false) {
                    intentos += 1;   
                    jLabel1.setIcon(new ImageIcon(getClass().getResource("/net/jc_mouse/ahorcado/resources/emo" + this.intentos + ".jpg")));
                    jLabel2.setIcon(new ImageIcon(getClass().getResource("/net/jc_mouse/ahorcado/resources/ahorcado_" + this.intentos + ".jpg")));
                    if (this.intentos < 4) {
                        JOptionPane.showMessageDialog(null, "Te quedan " + (4 - intentos) + " intentos más");
                    }
                } else {
                    this.cambios = false;
                }
                this.jTextField.setText(p);

                gano();
            }
        }
    }

    /**
     * Si usuario completo "palabra oculta" el juego termina sino continua jugando
     */
    private void gano() {
        boolean win = false;
        for (int i = 0; i <= this.palabra_secreta.length - 1; i++) {
            if (this.palabra[i] == this.palabra_secreta[i]) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if (win) {
            JOptionPane.showMessageDialog(null, "HAS GANADO");
           
        }
    }

}
