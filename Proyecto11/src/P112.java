import java.util.Scanner;

public class P112 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        float f, n, s;
        n=0;
        s=0;
        for(f=1; f<=10; f++) {
        	System.out.print("dame un numero");
            n=teclado.nextFloat();
            if(f>5) {
            	s=s+n;
            }
        }
        System.out.print("La suma de los ultimos 5 numeros es: ");
        System.out.print(s);
 }
}    