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
public class Figura {
    private long id;
    private String identificador;
    private String nombre;
    private String color;
    private int area;
    private int perimetro;
    private String numeroFiguras;
    private Planos propietario;
    private List<Poligonos> listaPoligonos;

    public Figura(long id, String identificador, String nombre, String color, int area, int perimetro, String numeroFiguras) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.numeroFiguras = numeroFiguras;
        this.listaPoligonos= new ArrayList();
    }
    
        public Figura(long id, String identificador, String nombre, String color, int area, int perimetro, String numeroFiguras, Planos propietario, List<Poligonos> listaPoligonos) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.numeroFiguras = numeroFiguras;
        this.propietario= propietario;
        this.listaPoligonos= listaPoligonos;
    }
        
        public Figura(long id, String identificador, String nombre,String color,int area,int  perimetro,String  numeroFiguras,Planos propietario) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.numeroFiguras = numeroFiguras;
        this.propietario= this.propietario;
        this.listaPoligonos=  new ArrayList();
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public String getNumeroFiguras() {
        return numeroFiguras;
    }

    public void setNumeroFiguras(String numeroFiguras) {
        this.numeroFiguras = numeroFiguras;
    }

    public Planos getPropietario() {
        return propietario;
    }

    public void setPropietario(Planos propietario) {
        this.propietario = propietario;
    }

    public List<Poligonos> getListaPoligonos() {
        return listaPoligonos;
    }

    public void setListaPoligonos(List<Poligonos> listaPoligonos) {
        this.listaPoligonos = listaPoligonos;
    }

    @Override
    public String toString() {
        return "Figura{" + "id=" + id + ", identificador=" + identificador + ", nombre=" + nombre + ", color=" + color + ", area=" + area + ", perimetro=" + perimetro + ", numeroFiguras=" + numeroFiguras + ", propietario=" + propietario + '}';
    }



}
