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
public class Producto {
    private long id;
    private String descripcion;
    private double precioUnitario;
    private int stock;
    private double iva;
    private Cliente comprador;
    private List<Factura> listaFactura;

    public Producto(long id, String descripcion, double precioUnitario, int stock, double iva) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.iva = iva;
        this.listaFactura=new ArrayList();
    }
    

    public Producto(long id, String descripcion, double precioUnitario, int stock, double iva,Cliente comprador, List<Factura> listaFactura) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.iva = iva;
        this.comprador = comprador;
        this.listaFactura = listaFactura;
    }
        public Producto(long id, String descripcion, double precioUnitario, int stock, double iva,Cliente comprador) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.iva = iva;
        this.comprador = comprador;
        this.listaFactura=new ArrayList();
    }

    public Producto(long generarId, String descripcion, double precioUnitario, int stock, double iva, Cliente comprador, Cliente cliente, Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", stock=" + stock + ", iva=" + iva + ", comprador=" + comprador + '}';
    }
    

   
}
