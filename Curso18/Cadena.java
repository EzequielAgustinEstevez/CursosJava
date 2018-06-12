import java.util.Scanner;

public class Cadena{
    public static void main(String args[]){

        String cadena_original = "", cadena_substraccion = "";
        int num_caracter = 0, desde = 0, hasta = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracter = cadena_original.length();

        System.out.println("La cadena de caracteres " + cadena_original + "   posee " + num_caracter + " caracteres.");

        System.out.println("Desde que caracter deseas obtener la nueva cadena: ");
        desde = in.nextInt();
        System.out.println("Hasta que caracter deseas obtener la nueva cadena?: ");
        hasta = in.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);

        System.out.println("La nueva cadena es: " + cadena_substraccion);
    }
}