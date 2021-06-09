/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacioncedula;

import java.util.Scanner;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class ValidacionCedula {

    public static void main(String[] args) {
        Scanner validacion= new Scanner(System.in);
        int pdigito;
        int sdigito;
        int tdigito;
        int cdigito;
        int qdigito;
        int stdigito;
        int spdigito;
        int odigito;
        int ndigito;
        int vdigito;
        
        
        System.out.println("Ingrese el primer dígito de su cedula: ");
        pdigito= validacion.nextInt();
        
        System.out.println("Ingrese el segundo dígito de su cedula: ");
        sdigito= validacion.nextInt();
        
        System.out.println("Ingrese el tercer dígito de su cedula: ");
        tdigito= validacion.nextInt();
        
        System.out.println("Ingrese el cuarto dígito de su cedula: ");
        cdigito= validacion.nextInt();
        
        System.out.println("Ingrese el quinto dígito de su cedula: ");
        qdigito= validacion.nextInt();
        
        System.out.println("Ingrese el sexto dígito de su cedula: ");
        stdigito= validacion.nextInt();
        
        System.out.println("Ingrese el septimo dígito de su cedula: ");
        spdigito= validacion.nextInt();
        
        System.out.println("Ingrese el octavo dígito de su cedula: ");
        odigito= validacion.nextInt();
        
        System.out.println("Ingrese el noveno dígito de su cedula: ");
        ndigito= validacion.nextInt();
        
        System.out.println("Ingrese el último dígito de su cedula: ");
        vdigito= validacion.nextInt();
        
        
        System.out.println("\n");
        
        
        int r1=(pdigito*2);
        if(r1>9){
            r1=r1-9;
        }
        else{
        r1=r1;
        }
        
        int r2=(sdigito*1);
        if(r2>9){
            r2=r2-9;
        }
        else{
        r2=r2;
        }
        
        int r3=(tdigito*2);
        if(r3>9){
            r3=r3-9;
        }
        else{
        r3=r3;
        }
        
        int r4=(cdigito*1);
        if(r4>9){
            r4=r4-9;
        }
        else{
        r4=r4;
        }
        
        int r5=(qdigito*2);
        if(r5>9){
            r5=r5-9;
        }
        else{
        r5=r5;
        }
        
        int r6=(stdigito*1);
        if(r6>9){
            r6=r6-9;
        }
        else{
        r6=r6;
        }
        
        
        int r7=(spdigito*2);
        if(r7>9){
            r7=r7-9;
        }
        else{
        r7=r7;
        }
        
        
        int r8=(odigito*1);
        if(r8>9){
            r8=r8-9;
        }
        else{
        r8=r8;
        }
        
        int r9=(ndigito*1);
        if(r9>9){
            r9=r9-9;
        }
        else{
        r9=r9;
        }

        
        System.out.println("\nPROCESO DE VALIDACION");
        int suma=r1+r2+r3+r4+r5+r6+r7+r8+r9;
        System.out.println("SUMA: "+suma);
        
        
        int verificacion= (suma*10)/100;
        int verificaciontotal=(verificacion+1)*10;
        System.out.println("INMEDIATO SUPERIOR: "+verificaciontotal);
        
        int verificacionfinal= (verificaciontotal-suma);
        System.out.println("El último dígito de su cedula es: "+vdigito+" y el valor calculado es: "+verificacionfinal);
        
        if(verificacionfinal==vdigito){
            System.out.println("Su cédula es válida");
        }
        else{
            System.out.println("Su cédula no es válida"); 
       }
        
    }   
    
}
