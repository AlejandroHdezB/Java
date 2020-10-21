import java.util.Scanner;

public class P121 {
	public static void main(String[] ar) {
		  Scanner teclado=new Scanner(System.in);	
		  int ind, sumado;
		  sumado=0;
		  do {
	            System.out.print("Ingresa valor entero (9999 pera finalizar):");
	            ind=teclado.nextInt();
	            if(ind<9999) {
	            	sumado=sumado+ind;
	            }
	            
	            		 } while(ind!=9999);
		  System.out.print("la suma de tus valores es: ");
		  System.out.print(sumado);
		  if(sumado==0) {
			  System.out.print(" El valor es igual a cero");
		  }else {
			  if(sumado<0) {
				  System.out.print(" El valor es menor a cero");
			  }else {
				  if(sumado>0) {
					  System.out.print(" El valor es mayor a cero");
				  }
			  }
		  }
	 }
}
