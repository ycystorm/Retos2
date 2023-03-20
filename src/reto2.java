import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        int n = 5, i, vidas=4;
        String oculta="casa";
        Scanner lectura = new Scanner(System.in);
        String[] palabra = new String[] { "c","a","s","a" };
        String[] letras = new String[3];
        System.out.println(
                "reglas: 1 toda letra ingresada debe estar en minuscula 2:solo tendra 4 intentos 3:si tiene alguna sospecha de la letra puede ingresarla para comparar 4:debe tener presente cada hacierto para adivinar la palabra le descontara una vida ");
        for (i = 0; i < n; i++) {
            System.out.println("vidas actuales "+vidas);
            System.out.println("por favor digite la letra ");
            letras[i]=lectura.next();
            if(letras[i].equals(palabra[0])){
                System.out.println(" has adivinado la letra "+palabra[0]);
            }
            else if(letras[i].equals(palabra[1])){
                System.out.println(" has adivinado la letra "+palabra[1]);
            }
            else if(letras[i].equals(palabra[2])){
                System.out.println(" has adivinado la letra "+palabra[2]);
            }
            else if(letras[i].equals(palabra[3])){
                System.out.println(" has adivinado la letra "+palabra[3]);
            }
            else if(letras[i].equals(oculta)){
                System.out.println("excelente descubriste la palabra oculta que es "+oculta);
                break;
            }
            else if(vidas==0){
                break;
            }
            else if(letras[i]!=palabra[i]){
                System.out.println("no has asertado pierdes un vida "+ (vidas --));
            }
        }
        lectura.close();
        System.out.println("gracias por jugar");
    }
}
