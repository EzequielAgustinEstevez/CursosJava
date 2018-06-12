import java.util.Scanner;

public class Login{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String usuario = "", password = "";

        System.out.print("Ingresa tu nombre de usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Ingresa tu contrasenia " + usuario + " : ");
        password = entrada.nextLine();

        if (usuario.equals("Mari") && password.equals("123456")) {
            System.out.println("Inicio de secion correcto.");
            
        } else {
            System.out.println("Usuario o contrasenia incorrectos.");
        }

    }
}