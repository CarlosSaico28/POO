/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Linea {
    
   private long id;
   private String identificador;
   private int puntoOrigen;
   private int puntoFinal;
   private int longitud;
   private Poligonos poligonos;

    public Linea(long id, String identificador, int puntoOrigen, int puntoFinal, int longitud) {
        this.id = id;
        this.identificador = identificador;
        this.puntoOrigen = puntoOrigen;
        this.puntoFinal = puntoFinal;
        this.longitud = longitud;
        
    }
    public Linea(long id, String identificador, int puntoOrigen, int puntoFinal, int longitud, Poligonos poligonos) {
        this.id = id;
        this.identificador = identificador;
        this.puntoOrigen = puntoOrigen;
        this.puntoFinal = puntoFinal;
        this.longitud = longitud;
        this.poligonos= poligonos;
        
    }    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(int puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public int getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(int puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Poligonos getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(Poligonos poligonos) {
        this.poligonos = poligonos;
    }

    @Override
    public String toString() {
        return "Linea{" + "id=" + id + ", identificador=" + identificador + ", puntoOrigen=" + puntoOrigen + ", puntoFinal=" + puntoFinal + ", longitud=" + longitud + ", poligonos=" + poligonos + '}';
    }
    


}
