import java.util.Scanner;

public class Operaciones{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String nombre = "", accion = "sumar";
        int num_uno = 0, num_dos = 0, resultado = 0, sumar = 1, restar = 2, multiplicar = 3, dividir = 4;
        int opcion = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("*****************************************");
        System.out.println("* Hola Bienvenid@ al sistema CALCULATOR *");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();
        System.out.println("");
        System.out.println("Hola " + nombre + ", que operacion te gustaria realizar?.(sumar, restar, dividir, multiplicar).");
        accion = in.nextLine();
        System.out.println("");
        System.out.println("Escribe el primer numero para " + accion );
        num_uno = in.nextInt();
        System.out.println("");
        System.out.println("Escribe el segundo numero para " + accion );
        num_dos = in.nextInt();
        System.out.println("");

        if (accion = sumar) {
                opcion = 1;
        }else if(accion == restar){
                opcion = 2;
        }else if(accion == multiplicar){
                opcion = 3;
        }else if(accion == dividir){
                opcion = 4;
        }else{
                System.out.println(nombre + ", lamentablemente no comprendo que operacion desea realizar.");
             }
        
        switch (opcion) {
            case 1: resultado = num_uno + num_dos;
                    System.out.println("El resultado de la suma es: " + resultado);
            break;
            case 2: resultado = num_uno - num_dos;
                    System.out.println("El resultado de la resta es: " + resultado);
            break;  
            case 3: resultado = num_uno * num_dos;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
            case 4: resultado = num_uno / num_dos;
                    System.out.println("El resultado de la divicion es: " + resultado);
            break;                  
            default: System.out.println("Error, la opcion no existe.");
                break;
        }
    }
}