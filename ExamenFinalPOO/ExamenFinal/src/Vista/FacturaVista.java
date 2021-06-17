/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.FacturaControlador;
import Modelo.Cliente;
import Modelo.Factura;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class FacturaVista {
    private FacturaControlador facturaControlador;
    private Scanner teclado;
    private ClienteControlador clienteControlador;
    
    public FacturaVista(ClienteControlador clienteControlador){
    this.teclado=new Scanner(System.in);
    this.facturaControlador=new FacturaControlador();
    this.clienteControlador= clienteControlador;
    }
    public void menu(){
    int opcion=0;
    do{
        System.out.println("\nAdministar la Factura");
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
        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("Id: ");
        long id=teclado.nextLong();
        System.out.println("Fecha: dia/mes/año ");
        String fecha=teclado.next();
        System.out.println("Producto: ");
        String producto=teclado.next();
        System.out.println("Cantidad: ");
        int cantidad=teclado.nextInt();
        System.out.println("Valor: ");
        double valor=teclado.nextDouble();
        boolean resultado= facturaControlador.crear(id,fecha, producto, cantidad, valor,clienteControlador.getSeleccionado());
        System.out.println("Creado= "+resultado);
    }
    public void actualizar(){
        System.out.println("Fecha");
        String fechaAnterior=teclado.next();
        System.out.println("Fecha Nueva");
        String fecha=teclado.next();
        boolean resultado= facturaControlador.actualizar(fechaAnterior, fecha);
        System.out.println("Actualizado= "+resultado);
    }
    public Factura buscar(){
        System.out.println("Fecha");
        String producto=teclado.next();
        Factura factura=facturaControlador.buscar(producto);
        System.out.println(factura);
        return factura;
    }
    public void asignarSeleccionado(Factura factura){
    facturaControlador.setSeleccionado(factura);
    }
    public void eliminar(){
        System.out.println("Fecha");
        String fecha= teclado.next();
        boolean resultado=facturaControlador.eliminar(fecha);
        System.out.println("Eliminado= "+resultado);
    }
    public void imprimir(){
    for(Factura factura: facturaControlador.getListaFactura()){
        System.out.println(factura);
        this.imprimirClientes(factura);
    }
    }
    public void imprimirClientes(Factura factura){
    for(Cliente cliente: factura.getListaCliente()){
        System.out.println(cliente);
    }
    }
    public FacturaControlador getFacturaControlador(){
    return facturaControlador;
    }
    public void setFacturaControlador(FacturaControlador facturaControlador){
    this.facturaControlador=facturaControlador;
    }
}
