/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ClienteVista {
    
    private Scanner teclado;
    private ClienteControlador clienteControlador;

    
    public ClienteVista(){
        clienteControlador = new ClienteControlador();
        teclado = new Scanner(System.in);
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Clientes");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar/Leer");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar/Imprimir");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
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
                    System.out.println("Listado de clientes: "); 
                break;
            }
        }while(opcion<6);
    }
    public void crear() {
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Id: ");
        long id = teclado.nextLong();
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        boolean resultado = clienteControlador.crear(nombre, apellido, cedula);
        System.out.println("Cliente creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        boolean resultado = clienteControlador.actualizar(cedula, nombre, apellido);
        System.out.println("Cliente actualizado: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Cliente");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        boolean resultado = clienteControlador.eliminar(cedula);
        System.out.println("Cliente eliminado: " + resultado);
    }
    public Cliente buscar(){
        System.out.println("Buscar Cliente");
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        Cliente cliente = clienteControlador.buscar(cedula);
        System.out.println(cliente);
        return cliente;
    }
    public void asignarSeleccionado(Cliente cliente) {
        clienteControlador.setSeleccionado(cliente);
    }


    public ClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
   
}