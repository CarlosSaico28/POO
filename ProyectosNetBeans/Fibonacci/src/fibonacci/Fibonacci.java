/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author JOSE
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
            {
 
        int serie = 10;
        int num1 = 0;
        int num2 = 1; 
        int suma = 1;
        System.out.println(num1);
        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;   
        }
        {
        System.out.println("La suma de la serie de Fibonacci es : "+(num1+suma-1));
        }
    }
    }
    
}
