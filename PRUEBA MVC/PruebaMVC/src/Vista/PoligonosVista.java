/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FiguraControlador;
import Controlador.PoligonosControlador;
import Modelo.Poligonos;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class PoligonosVista {
    
    private PoligonosControlador poligonosControlador;
    private FiguraControlador figuraControlador;
    private Scanner teclado;
    
    public PoligonosVista(FiguraControlador figuraControlador){
        this.figuraControlador= figuraControlador;
        poligonosControlador= new PoligonosControlador();
        teclado= new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Polígonos ");
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
    long id =teclado.nextLong();
    System.out.println("Numero de Lineas");
    int numeroLineas= teclado.nextInt();
    System.out.println("Lineas que los Conforman");
    String lienasConforman= teclado.next();
    boolean resultado= poligonosControlador.crear(id, numeroLineas, lienasConforman,figuraControlador.getSeleccionado());
    System.out.println("Creado: "+resultado);
}
public Poligonos buscar(){
    System.out.println("Ingrese las lineas que lo Conforman");
    String lineasConforman= teclado.next();
    Poligonos poligonos= poligonosControlador.buscar(lineasConforman);
    System.out.println(poligonos);
    return poligonos;
}
public void actualizar(){
    System.out.println("INGRESE LOS DATOS");
    System.out.println("Lineas que lo Conforman");
    String lineasConforman= teclado.next();
    System.out.println("NumeroLineas");
    int numeroLineas= teclado.nextInt();
    boolean resultado= poligonosControlador.actualizar(lineasConforman, numeroLineas);
    System.out.println("Actualiado: "+resultado);
}
public void eliminar(){
    System.out.println("Ingrese las lineas que lo Conforman");
    String lineasConforman= teclado.next();
    boolean resultadp= poligonosControlador.eliminar(lineasConforman);
}
public void imprimir(){
    for(Poligonos poligonos: poligonosControlador.getListaPoligonos()){
        System.out.println(poligonos);
    }
}
public void asignarSeleccionado(Poligonos poligonos){
poligonosControlador.setSeleccionado(poligonos);
}
public PoligonosControlador getPoligonosControlador(){
return poligonosControlador;
}    
public void setPoligonosControlador(PoligonosControlador poligonosControlador){
    this.poligonosControlador=poligonosControlador;
}
public FiguraControlador getFiguraControlador(){
    return figuraControlador;
}
public void setFiguraControlador(FiguraControlador figuraControlador){
    this.figuraControlador= figuraControlador;
}
}
