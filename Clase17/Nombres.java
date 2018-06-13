import java.util.Scanner;

public class Nombres{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String nombre_uno = "", nombre_dos = "";
        
        System.out.print("Porfavor ingresa el primer nombre: ");
        nombre_uno = entrada.nextLine();

        System.out.print("Porvafor dame el segundo nombre: ");
        nombre_dos = entrada.nextLine();

        if (nombre_uno.equalsIgnoreCase(nombre_dos)){
            System.out.println("Los nombres son iguales.");
            System.out.println("");
        } else {
            System.out.println("Los nombres son diferentes.");
        }

    }
}