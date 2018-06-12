import java.util.Scanner;

public class Matriz{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int filas = 0, columnas = 0, contador = 1;
        

        System.out.println("Cuantas columnas desea: ");
        columnas = entrada.nextInt();
        System.out.println("");
        System.out.println("Cuantas filas desea: ");
        filas = entrada.nextInt();
        System.out.println("");

        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                
                System.out.print("[" + numeros[j][i] + "]");
                                
            }
            System.out.println("");            
        }

    }
}