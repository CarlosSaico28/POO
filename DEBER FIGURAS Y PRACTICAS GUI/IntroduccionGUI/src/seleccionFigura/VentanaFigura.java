/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionFigura;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class VentanaFigura extends JFrame{
    public PanelFigura panelFigura;
    public JPanel panelBotones;
    public JButton btnLinea;
    public JButton btnCuadrado;
    public JButton btnCirculo;
    public JButton btnCirculoCuadrado;
    
    
    public VentanaFigura(){
        setTitle("Ventana de Figuras");
        setBounds(0,0,600,600);
        setLayout(new BorderLayout());  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }
    
    public void initComponents(){
        panelBotones= new JPanel();
        panelFigura= new PanelFigura();
        btnLinea= new JButton("Linea");
        btnLinea.setBounds(0,0,50,50);
        panelBotones.add(btnLinea);
        btnCuadrado= new JButton("Cuadrado");
        btnCuadrado.setBounds(0,0,50,50);
        panelBotones.add(btnCuadrado);
        btnCirculo= new JButton("Circulo");
        btnCirculo.setBounds(0,0,50,50);
        panelBotones.add(btnCirculo);
        btnCirculoCuadrado= new JButton("CirculoCuadrado");
        btnCirculoCuadrado.setBounds(0,0,50,50);
        panelBotones.add(btnCirculoCuadrado);
        add(panelBotones, BorderLayout.NORTH);
        add(panelFigura, BorderLayout.CENTER);
        
       btnLinea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Ingreso");
                panelFigura.setTipoFigura(1);
                panelFigura.getFiguraseleccion().setX(500);
                panelFigura.getFiguraseleccion().setY(400);
                panelFigura.getFiguraseleccion().setAncho(200);
                panelFigura.getFiguraseleccion().setAlto(300);
                panelFigura.repaint();
                
                
            }
       });
       btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Ingreso");
                panelFigura.setTipoFigura(2);
                panelFigura.getFiguraseleccion().setX(100);
                panelFigura.getFiguraseleccion().setY(100);
                panelFigura.getFiguraseleccion().setAncho(100);
                panelFigura.getFiguraseleccion().setAlto(100);
                panelFigura.repaint();
                
                
            }
       });
       btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Ingreso");
                panelFigura.setTipoFigura(3);
                panelFigura.getFiguraseleccion().setX(200);
                panelFigura.getFiguraseleccion().setY(200);
                panelFigura.getFiguraseleccion().setAncho(100);
                panelFigura.getFiguraseleccion().setAlto(100);
                panelFigura.repaint();
                
                
            }
       });
              btnCirculoCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Ingreso");
                panelFigura.setTipoFigura(4);
                panelFigura.getFiguraseleccion().setX(350);
                panelFigura.getFiguraseleccion().setY(200);
                panelFigura.getFiguraseleccion().setAncho(100);
                panelFigura.getFiguraseleccion().setAlto(100);
                panelFigura.repaint();
                
                
            }
       });
       {
    
    }
        
        
    }
}
