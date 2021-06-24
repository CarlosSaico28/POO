/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LineaControlador;
import Controlador.PoligonosControlador;
import Modelo.Linea;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class LineaVista {
    private LineaControlador lineaControlador;
    private PoligonosControlador poligonosControlador;
    private Scanner teclado;
    
public LineaVista(PoligonosControlador poligonosControlador){
    this.poligonosControlador= poligonosControlador;
    lineaControlador= new LineaControlador();
    teclado= new Scanner(System.in);
}
public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Linea ");
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
    System.out.println("INGRESE LOS DATOS");
    System.out.println("Id");
    long id= teclado.nextLong();
    System.out.println("Identificador");
    String identificador= teclado.next();
    System.out.println("Punto de origen");
    int puntoOrigen= teclado.nextInt();
    System.out.println("Punto Final");
    int puntoFinal= teclado.nextInt();
    System.out.println("Longitud");
    int longitud= teclado.nextInt();
    boolean resultado= lineaControlador.crear(id, identificador, puntoOrigen, puntoFinal, longitud, poligonosControlador.getSeleccionado());
    System.out.println("Creado: "+resultado);
}
public Linea buscar(){
    System.out.println("Ingrese el Identificador");
    String identificador= teclado.next();
    Linea linea= lineaControlador.buscar(identificador);
    System.out.println(linea);
    return linea;
}
public void actualizar(){
    System.out.println("INGRESE LOS DATOS");
    System.out.println("Ingrese el identidicador");
    String identificador= teclado.next();
    System.out.println("Punto Origen");
    int puntoOrigen= teclado.nextInt();
    System.out.println("Punto Final");
    int puntoFinal= teclado.nextInt();
    boolean resultado= lineaControlador.actualizar(identificador, puntoOrigen, puntoFinal);
    System.out.println("Actualizado: "+resultado);
}
public void eliminar(){
    System.out.println("Ingrese el identidicador");
    String identificador= teclado.next();
    boolean resultado=lineaControlador.eliminar(identificador);
}
public void imprimir(){
for(Linea dato: lineaControlador.getDatos()){
    System.out.println(dato);
}
}
    
}
