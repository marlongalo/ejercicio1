package ejercicios1;
//Definir un arreglo unidemensional para listar 10 nombres de personas de la clase
public class ArregloBidimencional {
 public static void main(String[] args){ 
     String [][] arreglo= new String [4][5];
     arreglo [0][0]="Luis";
     arreglo [0][1]="Perez";
     arreglo [0][2]="Ingeniero";
     arreglo [0][3]="Enee";
     
     arreglo [1][0]="Javier";
     arreglo [1][1]="Zelaya";
     arreglo [1][2]="Doctor";
     arreglo [1][3]="Hospital Escuela";
     
     arreglo [2][0]="Tony";
     arreglo [2][1]="Motola";
     arreglo [2][2]="Abogado";
     arreglo [2][3]="Instituto de la Propiedad";
     
     arreglo [2][0]="Fernando";
     arreglo [2][1]="Anduray";
     arreglo [2][2]="Artista";
     arreglo [2][3]="SONY Music";
     
     arreglo [2][0]="Armando";
     arreglo [2][1]="Hoyos";
     arreglo [2][2]="Arquitecto";
     arreglo [2][3]="Constructora El Porvernir";
     
     arreglo [2][0]="Gabriel";
     arreglo [2][1]="Marquez";
     arreglo [2][2]="Bombero";
     arreglo [2][3]="BCIE";
     
     for (int x=0; x<arreglo.length; x++){
         for (int y=0; y<arreglo.length; y++)
         {
            System.out.println("Valor de x=" +x +" " +"y=" +y +" :" +arreglo[x][y]);
            } 
 }
}
}
