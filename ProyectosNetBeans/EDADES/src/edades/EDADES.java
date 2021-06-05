/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;

/**
 *
 * @author JOSE
 */
public class EDADES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
          static{
    int edad=67;
    if(edad>=65 ){System.out.println("Es un adulto mayor");}
    else if(edad<65 && edad >=18){System.out.println("Es un adulto");}
    else if(edad<18 && edad >= 12){System.out.println("Es un joven");}
    else if(edad<12 && edad >= 2){System.out.println("Es un nino");}
    else if (edad<2){System.out.println("Es un bebe");}
    } 
}
