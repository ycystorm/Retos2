import java.util.Scanner;
public class reto3{
    public static void main(String[] args) {
        int fila,columna,opera,i,j,total=0,totalr=0,totald=0,totalm=0,repetir;
        Scanner lectura=new Scanner(System.in);
        System.out.println("calculadora");
        String[][] calculadora=new String[][] {{"10","9","8","7"},{"6","5","4","3"},{"2","1","0","+"},{"-","/","*","="}};
        for(fila=0;fila<4;fila++){
            for(columna=0;columna<4;columna++){
                System.out.print(calculadora[fila][columna]+"\t");
            }
            System.out.println();
        }
    }
}