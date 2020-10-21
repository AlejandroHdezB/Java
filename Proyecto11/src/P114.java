import java.util.Scanner;

public class P114 {
    public static void main(String[] ar) {
    	  Scanner teclado=new Scanner(System.in);
    	  int f,n,m;
    	  m=0;
    	  System.out.print("dame un numero que sea entre el 1 y 10");
          n=teclado.nextInt();
  			if(n<=10) {
  			for(f=1; f<=11; f++) {
  				System.out.print(m);
  				System.out.print("-");
  	        	m=m+n;
  				
  			}
  			}else {
  				System.out.print("se sale de lo que puedo calcular");
  			}
    }
}