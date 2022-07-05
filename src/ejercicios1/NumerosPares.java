/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

/**
 *
 * @author Marlon Galo
 */

public class NumerosPares {
 //Se define la clase principal
    public static void main(String[] args) {
        //Se utiliza FOR para repetir el ciclo de los numeros desde el 0 al 100      
        for(int i=0;i<=100;i++){           
            //Se pone condicion si la variable de rotacion i es %2 y es igual a cero
            if (i%2==0)
            {
                System.out.print(i +" ");
            }
        }
         
    }
     
}


