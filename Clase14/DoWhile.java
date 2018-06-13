import java.util.Scanner;

public class DoWhile{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int i = 1000;

        do {
            System.out.print(i + ", ");
            i -= 200;
        } while (i >= 0);
    }
}   