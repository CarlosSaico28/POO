/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Figura;
import Modelo.Jefe;
import Modelo.Planos;
import Modelo.Proyectos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class FiguraControlador {
    private List<Figura> listaFigura;
    private Figura seleccionado;
    
    public FiguraControlador(){
    listaFigura= new ArrayList();
    seleccionado= null;
    }
    
public boolean crear(long id, String identificador, String nombre, String color, int area, int perimetro, String numeroFiguras,Planos propietario){
    Figura figura= new Figura(id, identificador, nombre,color,area, perimetro, numeroFiguras,propietario);
    return listaFigura.add(figura);
}


public Figura buscar(String identificador){
for(Figura figura: listaFigura){
if(figura.getIdentificador().equals(identificador)==true){
return figura;
}
}
return null;
}
public boolean actualizar(String identificador, String nombre, String color){
Figura figura= this.buscar(identificador);
if(figura !=null){
int posicion=listaFigura.indexOf(figura);
figura.setNombre(nombre);
figura.setColor(color);
listaFigura.set(posicion, figura);
return true;
}
return false;
}
public boolean eliminar(String identificador){
Figura figura= this.buscar(identificador);
if(figura !=null){
figura.getPropietario().getListaFigura().remove(figura);
return listaFigura.remove(figura);
}
return false;
}
public void imprimir(){
for(Figura figura: listaFigura){
    System.out.println(figura);
}
}

public List<Figura> getListaFigura(){
return listaFigura;
}
public void setListaFigura(List<Figura> listaFigura) {
this.listaFigura = listaFigura;
}
public Figura getSeleccionado(){
return seleccionado;
}   
public void setSeleccionado(Figura figura){
this.seleccionado= seleccionado;
}
}
