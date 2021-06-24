/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Figura;
import Modelo.Jefe;
import Modelo.Planos;
import Modelo.Poligonos;
import Modelo.Proyectos;
import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class VistaGeneral {
    
    private ProyectosVista proyectosVista;
    private JefeVista jefeVista;
    private FiguraVista figuraVista;
    private PlanosVista planosVista;
    private PoligonosVista poligonosVista;
    private LineaVista lineaVista;
    private Scanner teclado;
    
    public VistaGeneral(){
    jefeVista= new JefeVista();
    proyectosVista= new ProyectosVista(jefeVista.getJefeControlador());
    planosVista= new PlanosVista(proyectosVista.getProyectosControlador());
    figuraVista= new FiguraVista(planosVista.getPlanosControlador());
    poligonosVista= new PoligonosVista(figuraVista.getFiguraControlador());
    lineaVista= new LineaVista(poligonosVista.getPoligonosControlador());
    teclado= new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Jefe");
            System.out.println("2. Proyecto");
            System.out.println("3. Planos");
            System.out.println("4. Figura");
            System.out.println("5. Polígonos");
            System.out.println("6. Linea");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: jefeVista.menu(); break;
                case 2: this.proyectos(); break;
                case 3: this.planos(); break;
                case 4: this.figura();break;
                case 5: this.poligonos(); break;
                case 6: this.linea(); break;
            }
        } while (opcion < 7);
    } 
    
    public void proyectos(){
        System.out.println("Sleccione un jefe para gestionar los proyectos");
        Jefe jefe = jefeVista.buscar();
        if(jefe !=null){
        jefeVista.asignarSeleccionado(jefe);
        proyectosVista.menu();
        }
        else{
            System.out.println("No existe el jefe");
            this.proyectos();
        }
    }
    public void planos(){
        System.out.println("Sleeccione un propietario para asignar los proyectos");
        Proyectos proyectos = proyectosVista.buscar();
        if(proyectos !=null){
            proyectosVista.asignarSeleccionado(proyectos);
            planosVista.menu();
        }
        else{
            System.out.println("No existe el jefe");
            this.planos();
        }
    }
    public void figura(){
        System.out.println("Seleccione un plano para propietario para gestionar los planos");
        Planos planos = planosVista.buscar();
        if(planos !=null){
        planosVista.asignarSeleccionado(planos);
        figuraVista.menu();
        }
        else{
            System.out.println("No existe");
            this.figura();
        }
    }
    public void poligonos(){
        System.out.println("Seleccione una figura para gestionar");
        Figura figura = figuraVista.buscar();
        if(figura !=null){
            figuraVista.asignarSeleccionado(figura);
            poligonosVista.menu();
        }
        else{
            System.out.println("No existe");
            this.poligonos();
        }
    }
    public void linea(){
        System.out.println("Sleccione un poligono para gestionar");
        Poligonos poligonos= poligonosVista.buscar();
        if(poligonos !=null){
            poligonosVista.asignarSeleccionado(poligonos);
            lineaVista.menu();
        }
        else{
            System.out.println("No existe");
            this.menu();
        }
    }
    
}
