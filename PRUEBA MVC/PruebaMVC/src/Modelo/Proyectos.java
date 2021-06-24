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
public class Proyectos {
   private long id;
   private String coodigo;
   private String nombre;
   private Jefe jefe;
   private List<Planos>listaPlanos;
   
   
   public Proyectos(){
       this.id=-1;
   }

    public Proyectos(long id, String coodigo, String nombre) {
        this.id = id;
        this.coodigo = coodigo;
        this.nombre = nombre;
        this.listaPlanos= new ArrayList();
    }

    public Proyectos(long id, String coodigo, String nombre, Jefe jefe, List<Planos> listaPlanos) {
        this.id = id;
        this.coodigo = coodigo;
        this.nombre = nombre;
        this.jefe = jefe;
        this.listaPlanos = listaPlanos;
    }

     public Proyectos(long id, String coodigo, String nombre, Jefe jefe) {
        this.id = id;
        this.coodigo = coodigo;
        this.nombre = nombre;
        this.jefe = jefe;
        this.listaPlanos = new ArrayList();
    }   

    public Proyectos(long id, String identificador, String nombre, String color, int area, int perimetro, int numeroFiguras, Planos propietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoodigo() {
        return coodigo;
    }

    public void setCoodigo(String coodigo) {
        this.coodigo = coodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public List<Planos> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(List<Planos> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }

    @Override
    public String toString() {
        return "Proyectos{" + "id=" + id + ", coodigo=" + coodigo + ", nombre=" + nombre + ", jefe=" + jefe + '}';
    }


   
}
