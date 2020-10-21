import java.util.Scanner;

public class P122 {
	public static void main(String[] ar) {
		  Scanner teclado=new Scanner(System.in);	
		  int no, sumado,d,a,n;
		  float saldo;
		  d=0;
		  a=0;
		  n=0;
		  sumado=0;		  
		  System.out.print("Ingresar Numero de Cuenta por favor: (Si coloca un numero negativo. el proceso termina)");
	            no=teclado.nextInt();
	            System.out.print("Ingresar el saldo con el que tiene por favor: ");
	            saldo=teclado.nextInt();
		  do {
	            System.out.print("Su numero de cuenta es:");
	            System.out.println(no);
	            System.out.print("Su saldo es de: ");
	            System.out.println(saldo);
	            if(saldo<0) {
	            	System.out.print("Su cuenta esta en estado DEUDOR");
	            	d++;
	            }else {
	            	if(saldo>0) {
	            		System.out.print("Su cuenta esta en estado ACREDOR");
	            		a++;
	            	}else {
	            		if(saldo==0) {
	            			System.out.print("Su cuenta esta en estado NULO");
	            			n++;
	            			
	            		}
	            	}
	            }
	            
	            		 } while(no>=0);
		  System.out.print("el total de acredores fue de: ");
		  System.out.print(a);
	}
}
