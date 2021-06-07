/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import Modelo.Factura;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class VistaGeneral {
    private ClienteVista clienteVista;
    private FacturaVista facturaVista;
    private ProductoVista productoVista;
    private Scanner teclado;
    
    public VistaGeneral(){
    facturaVista= new FacturaVista();
    clienteVista= new ClienteVista(facturaVista.getFacturaControlador());
    productoVista= new ProductoVista(clienteVista.getClienteControlador());
    teclado=new Scanner(System.in); 
    }
    public void menu(){
    int opcion=0;
    do{
        System.out.println("Seleccione una opción");
        System.out.println("1. Factura");
        System.out.println("2. Cliente");
        System.out.println("3. Producto");
        System.out.println("4. Salir");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1: 
                facturaVista.menu();
                break;
            case 2:
                this.cliente();
                break;
            case 3:
                this.producto();
                break;     
        }
    }while(opcion<4);
    }
    public void cliente(){
        System.out.println("Seleccione una factura para gestionar los clientes");
        Factura factura= facturaVista.buscar();
        if(factura !=null){
        facturaVista.asignarSeleccionado(factura);
        clienteVista.menu();
        }
        else{
            System.out.println("No existe la factura");
            this.cliente();
        }
    }
    public void producto(){
        System.out.println("Seleccione un comprador para gestionar los productos");
        Cliente cliente=clienteVista.buscar();
        if(cliente !=null){
        clienteVista.asignarSeleccionado(cliente);
        productoVista.menu();
        }
        else{
            System.out.println("No existe la factura");
            this.producto();
        }
        
}
}
