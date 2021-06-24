/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FiguraControlador;
import Controlador.PlanosControlador;
import Modelo.Figura;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class FiguraVista {
    private FiguraControlador figuraControlador;
    private PlanosControlador planosControlador;
    private Scanner teclado;
    
    public FiguraVista(PlanosControlador planosControlador){
    this.planosControlador= planosControlador;
    figuraControlador= new FiguraControlador();
    teclado= new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestionar Figuras ");
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
    System.out.println("Identificador");
    String identificador= teclado.next();
    System.out.println("Nombre");
    String nombre= teclado.next();
    System.out.println("Color");
    String color= teclado.next();
    System.out.println("Area");
    int area= teclado.nextInt();
    System.out.println("Perimetro");
    int perimitero= teclado.nextInt();
    System.out.println("Numero de Figuras");
    String numeroFiguras=teclado.next();
    boolean resultado= figuraControlador.crear(id, identificador, nombre, color, area, perimitero, numeroFiguras, planosControlador.getSeleccionado());
    System.out.println("Creado: "+resultado);
}   
public Figura buscar(){
    System.out.println("Ingrese el identificador");
    String identificador= teclado.next();
    Figura figura= figuraControlador.buscar(identificador);
    System.out.println(figura);
    return figura;

}
public void actualizar(){
    System.out.println("INGRESE LOS DATOS");
    System.out.println("Identificador");
    String identificador= teclado.next();
    System.out.println("Nombre");
    String nombre= teclado.next();
    System.out.println("Color");
    String color=teclado.next();
    boolean resultado=figuraControlador.actualizar(identificador, nombre, color);
    System.out.println("Actualizado: "+resultado);  
}
public void eliminar(){
    System.out.println("Ingrese el identificador");
    String identificador= teclado.next();
    boolean resultado=figuraControlador.eliminar(identificador);
}
public void imprimir(){
for(Figura figura: figuraControlador.getListaFigura()){
    System.out.println(figura);
}
}
public void asignarSeleccionado(Figura figura){
figuraControlador.setSeleccionado(figura);
}
public FiguraControlador getFiguraControlador(){
return figuraControlador;
}
public void setFiguraControlador(FiguraControlador figuraControlador){
this.figuraControlador=figuraControlador;
}
public PlanosControlador getPlanosControlador(){
return planosControlador;
}
public void setPlanosControlador (PlanosControlador planosControlador){
this.planosControlador= planosControlador;
}
}
