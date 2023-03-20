import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {
        String palabra;
        char [] vector;
         int izq=0, der;
         Scanner lectura = new Scanner(System.in);
         System.out.println("ingrese la palabra");
         palabra = lectura.next();
         palabra = palabra.toLowerCase();
         vector=palabra.toCharArray();
         der=vector.length -1;
         while(izq< der){
            if(vector[izq] == vector[der]){
                der --;
                izq ++;
            } else{
                System.out.println("la palabra no es un palindromo");
                break;
            }
         }
         if(izq ==der){
            System.out.println("la palabra "+palabra+" es un palindromo ");
         }
         lectura.close();
    }
}