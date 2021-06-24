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
public class Planos {
    private long id;
    private String numeroIdentificacion;
    private String fechaEntrega;
    private String graficoPlano;
    private Proyectos propietario;
    private List<Figura> listaFigura;

    public Planos(long id, String numeroIdentificacion, String fechaEntrega, String graficoPlano) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaEntrega = fechaEntrega;
        this.graficoPlano = graficoPlano;
        this.listaFigura= new ArrayList();
    }

    public Planos(long id, String numeroIdentificacion, String fechaEntrega, String graficoPlano, Proyectos propietario,List<Figura> listaFigura ) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaEntrega = fechaEntrega;
        this.graficoPlano = graficoPlano;
        this.propietario= propietario;
        this.listaFigura= listaFigura;
    }
        public Planos(long id, String numeroIdentificacion, String fechaEntrega,String graficoPlano, Proyectos propietario) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaEntrega = fechaEntrega;
        this.graficoPlano = graficoPlano;
        this.propietario=propietario;
        this.listaFigura= new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getGraficoPlano() {
        return graficoPlano;
    }

    public void setGraficoPlano(String graficoPlano) {
        this.graficoPlano = graficoPlano;
    }

    public Proyectos getPropietario() {
        return propietario;
    }

    public void setPropietario(Proyectos propietario) {
        this.propietario = propietario;
    }

    public List<Figura> getListaFigura() {
        return listaFigura;
    }

    public void setListaFigura(List<Figura> listaFigura) {
        this.listaFigura = listaFigura;
    }

    @Override
    public String toString() {
        return "Planos{" + "id=" + id + ", numeroIdentificacion=" + numeroIdentificacion + ", fechaEntrega=" + fechaEntrega + ", graficoPlano=" + graficoPlano + ", propietario=" + propietario + '}';
    }

  
        
}
