/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.ProductoControlador;
import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ProductoVista {
    private ProductoControlador productoControlador;
    private ClienteControlador clienteControlador;
    private Scanner teclado;
    
    public ProductoVista(ClienteControlador clienteControlador){
    this.clienteControlador=clienteControlador;
    productoControlador= new ProductoControlador();
    teclado= new Scanner(System.in);
    }
    public void menu(){
    int opcion=0;
    do{
        System.out.println("\nAdministar los Productos");
        System.out.println("1. Crear");
        System.out.println("2. Actualizar");
        System.out.println("3. Buscar/Leer");
        System.out.println("4. Eliminar");
        System.out.println("5. Listar/Imprimir");
        System.out.println("6. Salir");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1:
                this.crear();
                break;
            case 2:
                this.actualizar();
                break;
            case 3:
                this.buscar();
                break;
            case 4:
                this.eliminar();
                break;
            case 5:
                this.imprimir();
                break;
        }
    }while(opcion<6);
    }
public void crear(){
    System.out.println("Crear-Ingresar datos: ");
    System.out.println("Id");
    Long id=teclado.nextLong();
    System.out.println("Descripcion");
    String descripcion=teclado.next();
    System.out.println("Precio Unitario");
    double precioUnitario=teclado.nextDouble();
    System.out.println("Stock");
    int stock=teclado.nextInt();
    System.out.println("Iva");
    double iva=teclado.nextDouble();
    boolean resultado=productoControlador.crear(id, descripcion, precioUnitario, stock, iva);
    System.out.println("Creado= "+resultado);
}
public void actualizar(){
    System.out.println("Actualoizar-Ingrese losn siguientes datos: ");
    System.out.println("Id");
    Long id=teclado.nextLong();
    System.out.println("Descripcion");
    String descripcion=teclado.next();
    System.out.println("Precio Unitario");
    double precioUnitario=teclado.nextDouble();
    System.out.println("Stock");
    int stock=teclado.nextInt();
    System.out.println("Iva");
    double iva=teclado.nextDouble();
    boolean resultado= productoControlador.actualizar(id, descripcion, precioUnitario, stock, iva);
    System.out.println("Actualizado: "+resultado);
}
public Producto buscar(){
    System.out.println("Ingrese Descripcion");
    String descripcion=teclado.next();
    Producto producto= productoControlador.buscar(descripcion); 
    return producto;
}
public void eliminar(){
    System.out.println("Ingrese la descripción");
    String descripcion=teclado.next();
    boolean resultado=productoControlador.eliminar(descripcion);
}
public void imprimir(){
for(Producto producto: productoControlador.getListaProducto()){
    System.out.println(producto);
}
}
public void asignarSeleccionado(Producto producto){
productoControlador.setSeleccionado(producto);
}
public ProductoControlador getProductoControlador(){
return productoControlador;
}
public void setProductoControlador(ProductoControlador productoControlador){
this.productoControlador=productoControlador;
}
public ClienteControlador getClienteControlador(){
return clienteControlador;
}
public void setClienteControlador(ClienteControlador clienteControlador){
this.clienteControlador=clienteControlador;
}
}
