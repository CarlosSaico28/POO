/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ProductoControlador {
    private List<Producto>listaProducto;
    private Producto seleccionado;
    
    public ProductoControlador(){
    listaProducto= new ArrayList();
    seleccionado= null;
    }
        public long generarId(){
        if(listaProducto.size() > 0) { 
            return listaProducto.get(listaProducto.size() -1 ).getId() + 1; 
        }else {
            return 1;
}
}
public boolean crear (long id, String descripcion, double precioUnitario, int stock, double iva){
Producto producto = new Producto(this.generarId(),descripcion,precioUnitario, stock, iva);
return this.listaProducto.add(producto);
}
public boolean crear (long id, String descripcion, double precioUnitario, int stock, double iva,Cliente comprador){
Producto producto = new Producto(this.generarId(),descripcion,precioUnitario, stock, iva,comprador);
return this.listaProducto.add(producto);
}

public Producto buscar(String descripcion){
for(Producto producto: listaProducto){
if(producto.getDescripcion().equals(descripcion)==true){
return producto;
}
}
return null;
}
public boolean actualizar ( String descripcionAnterior, String descripcionNuevo ){
Producto producto = this.buscar(descripcionAnterior);
if(producto !=null){
int posicion= listaProducto.indexOf(producto);
producto.setDescripcion(descripcionNuevo);
listaProducto.set(posicion,producto);
return true;
}
return false;
}
public boolean eliminar(String descripcion){
Producto producto= this.buscar(descripcion);
if(producto !=null){
return listaProducto.remove(producto);
}
return false;
}
public List<Producto>getListaProducto(){
return listaProducto;
}
public void setListaVehiculo(List<Producto>listaProducto){
this.listaProducto=listaProducto;
}
public Producto getSeleccionado(){
return seleccionado;
}
public void setSeleccionado(Producto seleccionado){
this.seleccionado=seleccionado;
}
}
