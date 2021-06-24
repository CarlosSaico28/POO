/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Linea;
import Modelo.Poligonos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class LineaControlador {
    private List<Linea>datos;
    private Linea seleccionado;
    
    public LineaControlador(){
    datos= new ArrayList();
    seleccionado=null;
    }
    
    public boolean crear(long id, String identificador, int puntoOrigen, int puntoFinal, int longitud, Poligonos poligonos){
    Linea linea= new Linea(id, identificador, puntoOrigen, puntoFinal, longitud, poligonos);
    poligonos.getListaLinea().add(linea);
    return datos.add(linea);
    }
    public Linea buscar(String identificador){
    for(Linea dato: datos){
    if(dato.getIdentificador().equals(identificador))
        return dato;
    }
    return null;
    }
    public boolean actualizar(String identificador,int puntoOrigen, int puntoFinal){
    Linea linea=this.buscar(identificador);
    if(linea !=null){
    int posicion= datos.indexOf(linea);
    linea.setPuntoOrigen(puntoOrigen);
    linea.setPuntoFinal( puntoFinal);
    datos.set(posicion, linea);
    return true;
    }
    return false;
    }
    
    public boolean eliminar(String identificador){
    Linea linea = this.buscar(identificador);
    if(linea !=null){
    linea.getPoligonos().getListaLinea().remove(linea);
    return datos.remove(linea);
    }
    return false;
    }
    public List <Linea>getDatos(){
    return datos;
    }
    public void setDatos(List<Linea> datos){
    this.datos=datos;
    }
    public Linea getSeleccionado(){
    return seleccionado;
    }
    public void setSleccionado(Linea seleccionado){
    this.seleccionado=seleccionado;
    }
}
