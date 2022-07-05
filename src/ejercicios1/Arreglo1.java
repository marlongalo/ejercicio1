package ejercicios1;
//Definir un arreglo unidemensional para listar 10 nombres de personas de la clase
public class Arreglo1 {
 public static void main(String[] args){ 
     String arreglo[] = new String[10];
     arreglo[0]="Luis";
     arreglo[1]="Jorge";
     arreglo[2]="Sofia";
     arreglo[3]="Jose";
     arreglo[4]="Gabriel";
     arreglo[5]="Maria";
     arreglo[6]="Celeste";
     arreglo[7]="Marlon";
     arreglo[8]="Javier";
     arreglo[9]="Dulce";
     for (int x=0; x<10; x++){
            System.out.println("Nombre del companero" +x +":" +arreglo [x]);
            } 
 }
}
