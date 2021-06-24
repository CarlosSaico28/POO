/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.JefeControlador;
import Controlador.ProyectosControlador;
import Modelo.Proyectos;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ProyectosVista {
    private Scanner teclado;
    private ProyectosControlador proyectosControlador;
    private JefeControlador jefeControlador;
    
    public ProyectosVista(JefeControlador jefeControlador){
    this.teclado= new Scanner(System.in);
    this.proyectosControlador= new ProyectosControlador();
    this.jefeControlador= jefeControlador;
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Proyectos ");
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Actualiza");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.buscar();break;
                case 3: this.actualizar();break;
                case 4: this.eliminar();break;
                case 5: 
                    System.out.println("Listado de Proyectos");
                    proyectosControlador.imprimir();
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("INGRESE LOS SIGUIENTES DATOS: ");
        System.out.println("Id");
        long id= teclado.nextLong();
        System.out.println("Codigo");
        String coodigo=teclado.next();
        System.out.println("Nombre");
        String nombre=teclado.next();
        boolean resultado=proyectosControlador.crear(id, coodigo, nombre, jefeControlador.getSeleccionado());
        System.out.println("Proyecto creado: "+resultado);
    }
    public Proyectos buscar(){
        System.out.println("Buscar Proyecto");
        System.out.println("Codigo");
        String coodigo=teclado.next();
        Proyectos proyectos=proyectosControlador.buscar(coodigo);
        System.out.println(proyectos);
        return proyectos;
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Codigo");
        String coodigo=teclado.next();
        System.out.println("Nombre");
        String nombre=teclado.next();
        boolean resultado=proyectosControlador.actualizar(coodigo, nombre);
        System.out.println("Proyecto actualizado: "+resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Proyecto");
        System.out.println("Codigo: ");
        String coodigo= teclado.next();
        boolean resultado= proyectosControlador.eliminar(coodigo);
        System.out.println("Proyecto eliminado: "+resultado);
    }

    public void asignarSeleccionado(Proyectos proyectos){
        proyectosControlador.setSeleccionado(proyectos);
    }
    public ProyectosControlador getProyectosControlador(){
        return proyectosControlador;
    }
    public void setProyectosControlador(ProyectosControlador proyectosControlador){
        this.proyectosControlador=proyectosControlador;
    }
    public JefeControlador getJefeControlador(){
        return jefeControlador;
    }
    public void setJefeControlador(JefeControlador jefeControlador){
    this.jefeControlador=jefeControlador;
    }
}
