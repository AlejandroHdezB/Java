import java.util.Scanner;

public class P111 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        float b,h,n,t,a;
        int f;
        b=0;
        a=0;
        h=0;
        t=0;
        System.out.print("Hola,¿cuantos triangulos vamos a calcular hoy?");
        n=teclado.nextFloat();
        for(f=1;f<=n;f++) {
        	System.out.print("Inserte base");
        	b=teclado.nextFloat();
        	System.out.print("Inserte altura");
        	h=teclado.nextFloat();
        	a= b*h/2;
        	System.out.println("Del triangulo ");
        	System.out.print(f);
        	System.out.print("Su base es: ");
        	System.out.println(b);
        	System.out.println("Su altura es: ");
        	System.out.println(h);
        	System.out.println("Con una superficie de: ");
        	System.out.println(a);
        	
        	if(a > 12) {
        		t++;
        	}
        	
        }
        System.out.print("La cantidad de triangulos que son mayores a 12 son: ");
        System.out.println(t);
 }
}