/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import Modelo.ComprobanteEntrada;
import Modelo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class VistaGeneral {

    private ClienteVista clienteVista;
    private VehiculoVista vehiculoVista;
    private EntradaVista entradaVista;
    private SalidaVista salidaVista;
    private Scanner teclado;

    public VistaGeneral() {
        clienteVista = new ClienteVista();
        vehiculoVista = new VehiculoVista(clienteVista.getClienteControlador());
        entradaVista = new EntradaVista(vehiculoVista.getVehiculoControlador());
        salidaVista = new SalidaVista(entradaVista.getEntradaControlador());
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Cliente");
            System.out.println("2. Vehiculo");
            System.out.println("3. Entrada");
            System.out.println("4. Salida");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: clienteVista.menu(); break;
                case 2: this.vehiculo(); break;
                case 3: this.comprobanteEntrada(); break;
                case 4: this.comprobanteSalida();break;
            }
        } while (opcion < 5);
    }

    public void vehiculo(){
        System.out.println("Seleccione una propietario para gestionar los vechiculos");
        Cliente cliente = clienteVista.buscar();
        if(cliente != null){ 
            clienteVista.asignarSeleccionado(cliente);
            vehiculoVista.menu();
        }else {
            System.out.println("No exite el Cliente");
            this.vehiculo();
        }
        
    }
    
    public void comprobanteEntrada() {
        System.out.println("Seleccione una empresa para gestionar los clientes");
        Vehiculo vehiculo= vehiculoVista.buscar();
        if(vehiculo != null){ 
            vehiculoVista.asignarSeleccionado(vehiculo);
            entradaVista.menu();
        }else {
            System.out.println("No exite la empresa");
            this.comprobanteEntrada();
        }
    }
    public void comprobanteSalida(){
        System.out.println("Selecione un comprobante");
        ComprobanteEntrada comprobanteEntrada = entradaVista.buscar();
        if(comprobanteEntrada != null){
            entradaVista.asignarSeleccionado(comprobanteEntrada);
            salidaVista.menu();
        }else {
            System.out.println("No existe vehiculo");
            this.menu();
        }
    }

}