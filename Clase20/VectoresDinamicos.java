import java.util.Scanner;

public class VectoresDinamicos{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int longitud = 0;

        System.out.print("Cuantos numeros deseas ingresar: ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Porfavor dame el valor #" + (i + 1));
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
            
        }

    }
}