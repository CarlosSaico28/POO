/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ClienteControlador {
    private List<Cliente> datos;
    private Cliente seleccionado;
    
    public ClienteControlador() {
        datos = new ArrayList<Cliente>();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
   
    public boolean crear(String nombre, String apellido, String cedula) {
        Cliente cliente = new Cliente(this.generarId(), nombre, apellido, cedula); 
        return datos.add(cliente); 
    }

    public Cliente buscar(String cedula){
        for (Cliente cliente : datos) { 
            if(cliente.getCedula().equals(cedula) == true){
                return cliente; 
            }
        }
        return null; // Si no encuentra retorna null
    }
    public boolean actualizar(String nombre, String apellido, String cedula) {
        Cliente cliente = this.buscar(cedula); // busco al cliente con la cedula
        if(cliente != null) { // Comprobar que el cliente exista
            int posicion = datos.indexOf(cliente); // obtengo la posición del cliente actual
            cliente.setNombre(nombre); // Actualizo el nomnbre
            cliente.setApellido(apellido); // Actualizo el apellido
            datos.set(posicion, cliente); // actualizo en base a la posicion del cliente.
            return true;
        }
        return false;
    }
    public boolean actualizar(int posicion,String Nombre) {
        Cliente cliente = datos.get(posicion); // busco al cliente con la cedula
        cliente.setNombre(Nombre);
        datos.set(posicion, cliente);
        return true;
    }
    public boolean eliminar(String cedula) {
        Cliente cliente = this.buscar(cedula);
        if(cliente != null){
            return datos.remove(cliente);
        }
        return false;
    }
    
    public List<Cliente> getDatos() {
        return datos;
    }

    public void setDatos(List<Cliente> datos) {
        this.datos = datos;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
    
}
