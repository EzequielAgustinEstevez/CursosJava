import java.util.Scanner;

public class Cocacola{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int antiguedad = 0, clave = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("*************************************************************");
        System.out.println("* Hola Bienvenid@ al sistema vacacional de Cocacola Company *");
        System.out.println("*************************************************************");
        System.out.println("");
        System.out.println("");

        System.out.println("Cual es tu nombre de trabajador?");
        nombre = in.nextLine();
        System.out.println("");

        System.out.println("Hola " + nombre + ", cuantos anios llevas trabajando para Cocacola?");
        antiguedad = in.nextInt();
        System.out.println("");

        System.out.println("Cual es la clave de tu departamento? 1-Atencion al cliente, 2-Logistica, 3-Gerencia");
        clave = in.nextInt();
        System.out.println("");

        if (clave == 1){
            if (antiguedad == 1){
                System.out.println(nombre + ", tenes derecho a 6 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + ", tenes derecho a 14 dias de vacaciones");
            }else if(antiguedad >=7){
                System.out.println(nombre + ", tenes derecho a 20 dias de vacaciones");
            }else{
                System.out.println(nombre + ", lamentablemente aun no dispones de vacaciones");
            }
        }else if(clave == 2){
            if (antiguedad == 1){
                System.out.println(nombre + ", tenes derecho a 7 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + ", tenes derecho a 15 dias de vacaciones");
            }else if(antiguedad >=7){
                System.out.println(nombre + ", tenes derecho a 22 dias de vacaciones");
            }else{
                System.out.println(nombre + ", lamentablemente aun no dispones de vacaciones");
            }
        }else if(clave == 3){
            if (antiguedad == 1){
                System.out.println(nombre + ", tenes derecho a 10 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <=6){
                System.out.println(nombre + ", tenes derecho a 20 dias de vacaciones");
            }else if(antiguedad >=7){
                System.out.println(nombre + ", tenes derecho a 30 dias de vacaciones");
            }else{
                System.out.println(nombre + ", lamentablemente aun no dispones de vacaciones");
            }
        }else{
            System.out.println("El departamento que elegiste no existe");
        }
    }    
}