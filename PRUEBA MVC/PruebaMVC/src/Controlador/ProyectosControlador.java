/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jefe;
import Modelo.Proyectos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ProyectosControlador {
    private List<Proyectos> datos;
    private Proyectos seleccionado;
    
    
    public ProyectosControlador() {
        datos = new ArrayList<Proyectos>();
        seleccionado = null;
    }    
    //CRUD
    
public boolean crear(long id, String coodigo, String nombre){
Proyectos proyectos=new Proyectos(id, coodigo, nombre);
return datos.add(proyectos);
}  

public boolean crear(long id, String coodigo, String nombre, Jefe jefe){
Proyectos proyectos= new Proyectos(id,coodigo,nombre,jefe);
jefe.getListaProyectos().add(proyectos);
return datos.add(proyectos);
}

public Proyectos buscar(String coodigo){
for (Proyectos proyectos : datos) {
    if(proyectos.getCoodigo().equals(coodigo) == true){
    return proyectos;
    }
}
return null;
}

public boolean actualizar(String coodigo, String nombre ){
Proyectos proyectos=this.buscar(coodigo);
if(proyectos !=null){
int posicion = datos.indexOf(proyectos);
proyectos.setNombre(nombre);
datos.set(posicion, proyectos);
return true;
}
return false;
}
public boolean eliminar(String coodigo){
Proyectos proyectos= this.buscar(coodigo);
if(proyectos !=null){
proyectos.getJefe().getListaProyectos().remove(proyectos);
return datos.remove(proyectos);
}
return false;
}
public void imprimir(){
for(Proyectos proyectos: datos){
    System.out.println(proyectos);
}
}
public List<Proyectos>getDattos(){
return datos;
}
public void setDatos(List<Proyectos> datos){
this.datos= datos;
}
public Proyectos getSeleccionado(){
return seleccionado;
}
public void setSeleccionado(Proyectos seleccionado){
this.seleccionado= seleccionado;
}
}
