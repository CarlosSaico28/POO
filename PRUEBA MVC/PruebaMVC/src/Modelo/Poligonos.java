/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Poligonos {
    private long id;
    private int numeroLineas;
    private String lineasConforman;
    private Figura figura;
    private List<Linea> listaLinea;

    public Poligonos(long id, int numeroLineas, String lineasConforman) {
        this.id = id;
        this.numeroLineas = numeroLineas;
        this.lineasConforman = lineasConforman;
        this.listaLinea=new ArrayList();
    }
    public Poligonos(long id, int numeroLineas, String lineasConforman,Figura figura, List<Linea> listaLinea) {
        this.id = id;
        this.numeroLineas = numeroLineas;
        this.lineasConforman = lineasConforman;
        this.figura=figura;
        this.listaLinea=listaLinea;
    }
    public Poligonos(long id, int numeroLineas, String lineasConforman,Figura figura) {
        this.id = id;
        this.numeroLineas = numeroLineas;
        this.lineasConforman = lineasConforman;
        this.figura=figura;
        this.listaLinea=new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    public String getLineasConforman() {
        return lineasConforman;
    }

    public void setLineasConforman(String lineasConforman) {
        this.lineasConforman = lineasConforman;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public List<Linea> getListaLinea() {
        return listaLinea;
    }

    public void setListaLinea(List<Linea> listaLinea) {
        this.listaLinea = listaLinea;
    }

    @Override
    public String toString() {
        return "Poligonos{" + "id=" + id + ", numeroLineas=" + numeroLineas + ", lineasConforman=" + lineasConforman + ", figura=" + figura + '}';
    }
   
    
}
