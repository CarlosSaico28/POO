/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class FacturaControlador {
    private List<Factura> listaFactura;
    private Factura seleccionado;
    
public FacturaControlador(){
    listaFactura=new ArrayList();
    seleccionado=null;
}
//CRUD
public boolean crear(long id,String  fecha, String producto, int cantidad, double valor){
Factura factura= new Factura(id,fecha,producto,cantidad,valor);
return listaFactura.add(factura);
}

public Factura buscar(String fecha){
for(Factura factura:listaFactura){
if(factura.getFecha().equals(fecha))
    return factura;
}
return null;
}

public boolean actualizar(String productoAnterior, String productoNuevo){
Factura factura=this.buscar(productoAnterior);
if(factura !=null){
int posicion=listaFactura.indexOf(factura);
factura.setProducto(productoNuevo);
listaFactura.set(posicion,factura);
return true;
}
return false;
}
public boolean eliminar(String fecha){
Factura factura = this.buscar(fecha);
if(factura !=null){
return listaFactura.remove(factura);
}
return false;
}
public List<Factura> getListaFactura(){
return listaFactura;
}
public void setListaFactura(List<Factura>listaFactura){
this.listaFactura=listaFactura;
}
public Factura getSeleccionado(){
return seleccionado;
}
public void setSeleccionado(Factura seleccionado){
this.seleccionado=seleccionado;
}
}
