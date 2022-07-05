/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

/**
 *
 * @author Marlon Galo
 */
public class expresiones {
    public static void main(String[] args) {
        // TODO code application logic here
     //Declaracion de variables tipo INT
     int M=6;
     int T=1;
     int K=-10;
     
     //Verdadero o falso M > T
     if (M>T)
     {
         System.out.println("M=" +M +" es mayor que T=" +T +" esto es verdadero"); 
     }
     else
     {
         System.out.println("M=6 > T=1 esto es falso");
     }
     
     //Verdadero o falso T / K == -5
     if (T / K == -5)
     {
         System.out.println("T/K" +" la division " +T +"/" +K +"== -5" +" el resultado es verdadero");
     }
     else
     {
         System.out.println("T/K" +" la division " +T +"/" +K +"== -5" +" el resultado es falso");
     }
    
     //Verdadero o falso (M+T == 7) || (M-T == 5)
     if ((M+T == 7) || (M-T == 5))
     {
         System.out.println("Si la suma M+T==7 || M-T==5" +" AMBAS RESPUESTAS SON VERDADERAS" );
     }
     else
     {
         System.out.println("Si la suma M+T==7 || M-T==5 RESPUESTAS NO SON LAS ESPERADAS" +" AMBAS RESPUESTAS SON FALSAS" );
     }
        
    }
}
