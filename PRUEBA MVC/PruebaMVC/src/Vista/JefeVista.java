/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.JefeControlador;
import Modelo.Jefe;
import Modelo.Proyectos;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class JefeVista {
    private JefeControlador jefeControlador;
    private Scanner teclado;
    
   public JefeVista(){
       jefeControlador=new JefeControlador();
       teclado= new Scanner(System.in);
   }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Jefe ");
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
                case 5: this.imprimir(); break;  
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("INGRESE LOS SIGUIENTES DATOS: ");
        System.out.println("Id");
        long id=teclado.nextLong();
        System.out.println("Codigo");
        String codigo=teclado.next();
        System.out.println("Nombre");
        String nombre=teclado.next();
        System.out.println("Apellido");
        String apellido=teclado.next();
        System.out.println("Dirección");
        String direccion=teclado.next();
        System.out.println("Teléfono");
        String telefono=teclado.next();
        boolean resultado= jefeControlador.crear(id, codigo, nombre, apellido, direccion, telefono);
        System.out.println("Creado: "+resultado);
    }
    public Jefe buscar(){
        System.out.println("Codigo");
        String codigo=teclado.next();
        Jefe jefe=jefeControlador.buscar(codigo);
        System.out.println(jefe);
        return jefe;
    }
    public void actualizar(){
        System.out.println("Codigo");
        String codigoAnterior=teclado.next();
        System.out.println("Codigo Nuevo");
        String codigo=teclado.next();
        boolean resultado=jefeControlador.actualizar(codigoAnterior, codigo);
        System.out.println("Actualizado: "+resultado);
    }
    public void asignarSeleccionado(Jefe jefe){
    jefeControlador.setSeleccionado(jefe);
    }
    public void eliminar(){
        System.out.println("Codigo");
        String codigo=teclado.next();
        boolean resultado= jefeControlador.eliminar(codigo);
        System.out.println("Eliminado: "+resultado);
    }
    public void imprimir(){
    for(Jefe jefe: jefeControlador.getListaJefe()){
        System.out.println(jefe);
        this.impimirProyectos(jefe);
    }
    }
    public void impimirProyectos(Jefe jefe){
    for(Proyectos proyectos:jefe.getListaProyectos()){
        System.out.println(proyectos);
    }
    }
    public JefeControlador getJefeControlador(){
    return jefeControlador;
    }
    public void setJefeControlador(JefeControlador jefeControlador){
    this.jefeControlador=jefeControlador;
    }
}
