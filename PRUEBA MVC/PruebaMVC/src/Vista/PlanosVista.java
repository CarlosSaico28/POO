/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PlanosControlador;
import Controlador.ProyectosControlador;
import Modelo.Planos;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class PlanosVista {
    private PlanosControlador planosControlador;
    private ProyectosControlador proyectosControlador;
    private Scanner teclado;
    
    public PlanosVista(ProyectosControlador proyectosControlador){
    this.proyectosControlador= proyectosControlador;
    planosControlador= new PlanosControlador();
    teclado= new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Planos ");
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
    System.out.println("INGRESE LOS SIGUIENTES DATOS");
    System.out.println("Id");
    long id=teclado.nextLong();
    System.out.println("Numero de Identificación");
    String numeroIdentificacion= teclado.next();
    System.out.println("Fecha de Entrega");
    String fechaEntrega= teclado.next();
    System.out.println("Grafico del plano");
    String graficoPlano= teclado.next();
    boolean resultado= planosControlador.crear(id, numeroIdentificacion, fechaEntrega, graficoPlano,proyectosControlador.getSeleccionado());
    System.out.println("Creado: "+resultado);
}
public Planos buscar(){
    System.out.println("Ingresar el numero de Identificación");
    String numeroIdentificacion= teclado.next();
    Planos planos= planosControlador.buscar(numeroIdentificacion);
    System.out.println(planos);
    return planos;
}
public void actualizar(){
    System.out.println("Actualizar-Ingrese los datos");
    System.out.println("Ingrese el numero de Identificación");
    String numeroIdentificacion= teclado.next();
    System.out.println("Fecha Entrega");
    String fechaEntrega= teclado.next();
    boolean resultado= planosControlador.actualizar(numeroIdentificacion, fechaEntrega);
    System.out.println("Actualizado: "+resultado);
}
public void eliminar(){
    System.out.println("Ingrese el numero de Identificación");
    String numeroIdentificación= teclado.next();
    boolean resultado= planosControlador.eliminar(numeroIdentificación);
}
public void imprimir(){
for(Planos planos: planosControlador.getListaPlanos()){
    System.out.println(planos);
}
}
public void asignarSeleccionado(Planos planos){
planosControlador.setSeleccionado(planos);
}
public PlanosControlador getPlanosControlador(){
return planosControlador;
}
public void setPlanosControlador(PlanosControlador planosControlador){
this.planosControlador= planosControlador;
} 
public ProyectosControlador getProyectosControlador(){
return proyectosControlador;
}
public void setProyectosControlador(ProyectosControlador proyectosControlador){
this.proyectosControlador= proyectosControlador;
}
}
