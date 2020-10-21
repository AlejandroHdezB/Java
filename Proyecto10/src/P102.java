import java.util.Scanner;

public class P102{
    public static void main(String[] ar) {
    	Scanner teclado= new Scanner(System.in);
        int x;
        int s;
        System.out.print("Ingrese numero");
        x = teclado.nextInt();
        s=1;
        while (s<= x) {
            System.out.print(s);
            System.out.print(" - ");
            s++;
        }
    }
}