/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.transpuesta;

/**
 *
 * @author Carlos Saico
 */
public class MATRIZTRANSPUESTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
    
    for (int i=0;i<3;i++){
        for(int j=0; j<3;j++){
            System.out.print(matriz [i][j]);
        }
    System.out.println("");
    
        }
            System.out.println("Matriz Transpuesta");
    for (int i=0;i<3;i++){
        for(int j=0; j<3;j++){
            System.out.print(matriz [j][i]);
    }
        System.out.println("");
    }   
    }
    
    }
    
