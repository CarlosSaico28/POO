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
public class Jefe {
    private long id;
    private String codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private List<Proyectos>listaProyectos;
    
    public Jefe(){
    id=0;
    codigo="";
    nombre="";
    apellido="";
    direccion="";
    telefono="";
    listaProyectos=new ArrayList();
    
    }

    public Jefe(long id, String codigo, String nombre, String apellido, String direccion, String telefono) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        listaProyectos= new ArrayList();
        
    }

    public Jefe(long id, String codigo, String nombre, String apellido, String direccion, String telefono, List<Proyectos> listaProyectos) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaProyectos = listaProyectos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Proyectos> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyectos> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    @Override
    public String toString() {
        return "Jefe{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }


    
    
}
