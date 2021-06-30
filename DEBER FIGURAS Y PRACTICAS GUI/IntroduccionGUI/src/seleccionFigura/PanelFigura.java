/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionFigura;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class PanelFigura extends JPanel {
    
    public FiguraSeleccion figuraseleccion;
    public int tipoFigura;
    public PanelFigura(){
        setBounds(100,100,500,500);
        figuraseleccion= new FiguraSeleccion(100, 100, 200, 200);
        tipoFigura=0;
    }
    
    @Override
    public void paint(Graphics lienzo){
        //lienzo.clipRect(0, 0, 500, 500);
        lienzo.setColor(Color.blue);
        lienzo.drawString("Paint", 50, 50);
        switch(tipoFigura){
            case 1: lienzo.drawLine(figuraseleccion.getX(),figuraseleccion.getY(),figuraseleccion.getAncho(),figuraseleccion.getAlto());
            break;
            case 2: lienzo.drawRect(figuraseleccion.getX(),figuraseleccion.getY(),figuraseleccion.getAncho(),figuraseleccion.getAlto());
            break;
            case 3: lienzo.drawOval(figuraseleccion.getX(),figuraseleccion.getY(),figuraseleccion.getAncho(),figuraseleccion.getAlto());
            break;
            case 4: lienzo.drawRoundRect(figuraseleccion.getX(),figuraseleccion.getY(),figuraseleccion.getAncho(),figuraseleccion.getAlto(),20,20);
            break;
        }
    }

    public FiguraSeleccion getFiguraseleccion() {
        return figuraseleccion;
    }

    public void setFiguraseleccion(FiguraSeleccion figuraseleccion) {
        this.figuraseleccion = figuraseleccion;
    }

    public int getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(int tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    
}
