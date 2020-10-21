import java.util.Scanner;

public class P103 {
	 public static void main(String[] ar) {
	    	Scanner teclado= new Scanner(System.in);
	    	float x,n;
	    	int ma,me;
	    	System.out.println("Digame sus 10 notas y le diré cuantas son mayores y cuantas menores ");
	    	n = 1;
	    	ma = 0;
	    	me = 0;
	    	while (n <= 10) {
	    	System.out.println("Ingresa nota porfavor ");
	        x = teclado.nextFloat();	        	        
	        	if(x >= 7) {
	        		ma++;
	        	}else {
	        		if(x < 7) {
	        			me++;
	        		}
	        	}
	        	n++;
	        }
	        System.out.print("De las 10 notas ");
	        System.out.print(ma);
	        System.out.print(" son mayores y ");
	        System.out.print(me);
	        System.out.print(" son menores");
	 }
}
