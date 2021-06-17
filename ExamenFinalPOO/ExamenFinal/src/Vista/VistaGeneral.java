/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FacturaControlador;
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
        FacturaControlador facturaControlador = null;
    clienteVista= new ClienteVista(facturaControlador);
    facturaVista= new FacturaVista(clienteVista.getClienteControlador());
    productoVista= new ProductoVista(facturaVista.getFacturaControlador());
    teclado=new Scanner(System.in); 
    }
    public void menu(){
    int opcion=0;
    do{
        System.out.println("Seleccione una opción");
        System.out.println("1. Cliente");
        System.out.println("2. Factura");
        System.out.println("3. Producto");
        System.out.println("4. Salir");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1: 
                clienteVista.menu();
                break;
            case 2:
                this.factura();
                break;
            case 3:
                productoVista.menu();
                break;     
        }
    }while(opcion<4);
    }

    
        public void factura(){
        System.out.println("Seleccione un cliente para gestionar los clientes");
        Cliente cliente= clienteVista.buscar();
        if(cliente !=null){
        clienteVista.asignarSeleccionado(cliente);
        facturaVista.menu();
        }
        else{
            System.out.println("No existe la factura");
            this.factura();
        }
    }

}
