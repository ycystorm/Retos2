import java.util.Scanner;

public class reto4{
    public static void main(String[] args) {
        int fila,columna,p=0;
        Scanner lectura=new Scanner(System.in);
        String[][] producto=new String[4][4];
        String[][] precio=new String[4][4];
        
        System.out.println("digite el el producto y su precio");
        for(fila=0;fila<4;fila++){
            for(columna=0;columna<4;columna++){
                System.out.println("ingrese el nombre del producto");
                producto[fila][columna]=lectura.next();
                System.out.println("ingrese el valor del precio");
                precio[fila][columna]=lectura.next();
            }
        }
       
        System.out.println("impreision");
        for(int i=0;i<4;i++){
         
            for( int j=0;j<4;j++){
                System.out.print( (p++)+producto[i][j]+precio[i][j]+"\t");
            }
            System.out.println();
        }
    }
}