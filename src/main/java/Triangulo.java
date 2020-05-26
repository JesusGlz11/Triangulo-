
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Triangulo {
     public static void main (String []args) { 
     Scanner sc = new Scanner (System.in) ; 
    int num ;
    
     System.out.println( "Caul es la altura?" ); 
     num = sc.nextInt() ; 
     
     for(int i = 1 ; i<=num ;i=i+1 )
        {
            
            for(int j = 0; j<i ;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


           
       
   
     
     
     
     
    

