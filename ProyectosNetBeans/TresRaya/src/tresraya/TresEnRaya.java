/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresraya;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class TresEnRaya extends JFrame implements ActionListener{
    JButton iniciar;
    JButton tablero [][];
    String jugador1,jugador2;
    int turno=-1;
    JLabel mensaje;
    Color colorB;
    
    public TresEnRaya(){
        this.setLayout(null);
        mensaje= new JLabel("Bienvenido");
        mensaje.setBounds(120,40,200,30);
        this.add(mensaje);
        iniciar= new JButton("Iniciar Juego");
        iniciar.setBounds(175,350,150,30);
        iniciar.addActionListener(this);
        this.add(iniciar);
        tablero= new JButton [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=new JButton();
                tablero [i][j].setBounds((i+1)*80+40,(j+1)*80,80,80);
                this.add(tablero[i][j]);
                tablero[i][j].addActionListener(this);
                
            }
        }
        colorB= tablero[0][0].getBackground();
                
    }
    
    public static void main (String [] args){
    TresEnRaya ventana= new TresEnRaya();
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(500,500);
    ventana.setLocationRelativeTo(null);
    ventana.setResizable(false);
    ventana.setTitle("Tres en Raya");
    ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==iniciar){
        turno=0;
            
            jugador1=JOptionPane.showInputDialog(this,"Ingrese el nombre del jugador 1");
            jugador2=JOptionPane.showInputDialog(this,"Ingrese el nombre del jugador 2");
            mensaje.setText("Turno del jugador "+jugador1);
            reiniciar();
        }
        else{
            JButton boton=(JButton) e.getSource();
            if(turno==0){
            if(boton.getText().equals("")){
                boton.setBackground(Color.CYAN);
                boton.setText("X");
                boton.setEnabled(false);
                turno=1;
                mensaje.setText("Turno del jugador "+jugador2);
            }
            }
            else{
            if(turno==1){
                if(boton.getText().equals("")){
                boton.setBackground(Color.ORANGE);
                boton.setText("O");
                boton.setEnabled(false);
                turno=0;
                mensaje.setText("Turno del jugador "+jugador1);
            }
            }
            }
            verificar();
        }
        
    }
    public void verificar(){
        int ganador=0;
        for (int i = 0; i <3; i++) {
            if(tablero[0][i].getText().equals("X")&& tablero[1][i].getText().equals("X")&& tablero[2][i].getText().equals("X")){
            ganador=1;
            }
            if(tablero[i][0].getText().equals("X")&& tablero[i][1].getText().equals("X")&& tablero[i][2].getText().equals("X")){
            ganador=1;
            }
        }
            if(tablero[0][0].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[2][2].getText().equals("X")){
            ganador=1;
            }
            if(tablero[0][2].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[2][0].getText().equals("X")){
            ganador=1;
            }
            for (int i = 0; i <3; i++) {
            if(tablero[0][i].getText().equals("O")&& tablero[1][i].getText().equals("O")&& tablero[2][i].getText().equals("O")){
            ganador=2;
            }
            if(tablero[i][0].getText().equals("O")&& tablero[i][1].getText().equals("O")&& tablero[i][2].getText().equals("O")){
            ganador=2;
            }
        }
            if(tablero[0][0].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[2][2].getText().equals("O")){
            ganador=2;
            }
            if(tablero[0][2].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[2][0].getText().equals("O")){
            ganador=2;
            }
       
        if(ganador==1){
        JOptionPane.showMessageDialog(this,"Ha ganado el jugador "+jugador1);
        bloquear();
        
        }
        if(ganador==2){
        JOptionPane.showMessageDialog(this,"Ha ganado el jugador "+jugador2);
        bloquear();
        }
    }
    
    public void bloquear(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                tablero[i][j].setEnabled(false);
            }
        }
    }
    
    public void reiniciar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                tablero[i][j].setEnabled(true);
                tablero[i][j].setText("");
                tablero[i][j].setBackground(colorB);
            }
        }
    }
}
