/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ClienteControlador {
    private List<Cliente> listaCliente;
    private Cliente seleccionado;

    public ClienteControlador(){
    listaCliente=new ArrayList<Cliente>();
    seleccionado= null;
    }
// CRUD -> Create, Read , Update, Delete -- Crear Leer/Buscar Actualizar Eliminar    
public boolean crear(long id, String nombre, String cedula, String fiabilidadPago){
Cliente cliente= new Cliente(id, nombre, cedula, fiabilidadPago);
return listaCliente.add(cliente);
}

public boolean crear(long id, String nombre, String cedula,String fiabilidadPago, Factura factura) {
        Cliente cliente = new Cliente(id, nombre, cedula, fiabilidadPago,factura); // Creo un nuevo cliente
        factura.getListaCliente().add(cliente);
        return listaCliente.add(cliente); 
    }


public Cliente buscar(String cedula){
    for (Cliente cliente : listaCliente){
        if (cliente.getCedula().equals(cedula)==true){
            return cliente;
}
}
return null;
}
public boolean acutalizar(String nombreAnterior, String nombreNuevo){
    Cliente cliente = this.buscar(nombreAnterior);
    if(cliente !=null){
        int posicion=listaCliente.indexOf(cliente);
        cliente.setNombre(nombreNuevo);
        listaCliente.set(posicion,cliente);
    return true;
}
return false;
}
public boolean eliminar(String cedula){
    Cliente cliente = this.buscar(cedula);
    if(cliente !=null){
        cliente.getFactura().getListaCliente().remove(cliente);
return listaCliente.remove(cliente);
}
return false;
}
public void imprimir(){
for(Cliente cliente:listaCliente){
    System.out.println(cliente);
}
}
public List<Cliente>getListaCliente(){
return listaCliente;
}
public void setListaCliente(List<Cliente>listaCliente){
this.listaCliente=listaCliente;
}
public Cliente getSeleccionado(){
return seleccionado;
}
public void setSeleccionado(Cliente seleccionado){
this.seleccionado=seleccionado;
}
}
