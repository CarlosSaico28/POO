/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Factura {
    private long id;
    private String fecha;
    private String producto;
    private int cantidad;
    private double valor;
    private Cliente cliente;
    private List<Cliente> listaCliente;
    
    public Factura(){
        id=0;
        listaCliente=new ArrayList();
        
    }
    
    public Factura(long id,String  fecha, String producto, int cantidad, double valor) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.listaCliente= new ArrayList(); 
    }
        public Factura(long id, String  fecha, String producto, int cantidad,Cliente cliente, double valor,List<Cliente> listaCliente) {
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.cliente=cliente;
        this.listaCliente= listaCliente;
       
    }

    public Factura(long id, String fecha, String producto, int cantidad, Cliente cliente, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Factura(long id, String fecha, String producto, int cantidad, double valor, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fecha=" + fecha + ", producto=" + producto + ", cantidad=" + cantidad + ", valor=" + valor + ", cliente=" + cliente + ", listaCliente=" + listaCliente + '}';
    }





    
}
