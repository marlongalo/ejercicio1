/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

/**
 *
 * @author Marlon Galo
 */
public class aritmetica {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        //double suma, resta, multiplicacion, division = 0;
        
        //Declaracion larga
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        double res = 0;
        
        double numero1 = 100;
        double numero2 = 15;
        
        //Operaciones
        //SUMA
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        res = numero1 % numero2;
        
        //No dividir entre denominador 0
        if (numero2 != 0){
            division = numero1 / numero2;
        }
        
        //Impresion en pantalla de los valores
        System.out.println("La suma es:" +suma);
        System.out.println("La resta es:" +resta);
        System.out.println("La multiplicacion es:" +multiplicacion);
        System.out.println("La division es:" +division);
        System.out.println("El residuo es:" +res);    
    }
}
