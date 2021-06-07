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
public class Cliente {
   private long id;
   private String nombre;
   private String cedula;
   private String fiabilidadPago;
   private Factura factura;
   private List<Producto>listaProducto;
   
   public Cliente(){
   this.id=-1;
   }

    public Cliente(long id, String nombre, String cedula, String fiabilidadPago) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
        this.listaProducto=new ArrayList();
    }
    public Cliente(long id, String nombre, String cedula, String fiabilidadPago,Factura factura,List<Producto> listaProducto) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
        this.factura=factura;
        this.listaProducto = listaProducto;
    }

    public Cliente(long id, String nombre, String cedula, String fiabilidadPago, Factura factura) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
        this.factura=factura;
        this.listaProducto=new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFiabilidadPago() {
        return fiabilidadPago;
    }

    public void setFiabilidadPago(String fiabilidadPago) {
        this.fiabilidadPago = fiabilidadPago;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fiabilidadPago=" + fiabilidadPago + ", factura=" + factura  + '}';
    }

    
   
}
