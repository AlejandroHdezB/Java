import java.util.Scanner;

public class P118 {
	public static void main(String[] ar) {
		  Scanner teclado=new Scanner(System.in);	
		  float f,m,t,n,p,s,r;
		  p=0;
		  s=0;
		  r=0;
		  for(f=1;f<=50;f++) {
			  System.out.print("Inserte edades de la manana");
			  m=teclado.nextFloat();
			  p=p+m;
			  		  }
		  System.out.print("el promedio matutino es ");
			  System.out.print(p/50);
		  for(f=1;f<=60;f++) {
			  System.out.print("Inserte edades de la tarde");
			  t=teclado.nextFloat();
			  s=s+t;		  
		  }
		  System.out.print("el promedio vespertino es ");
			  System.out.print(s/60);
		  for(f=1;f<=110;f++) {
			  System.out.print("Inserte edades de la noche");
			  n=teclado.nextFloat();
			  r=r+n;		
		  }
	  System.out.print("el promedio nocturno es ");
			  System.out.print(r/110);

		if(p>s || p>r) {
				if(s>r) {
					System.out.print("el menor promedio es ");
					System.out.print(r/110);
					System.out.print(" ,El de noche");
				}else {
					System.out.print("el menor promedio es ");
					System.out.print(s/60);
					System.out.print(" ,El de tarde");
				}
			}else {
				System.out.print("el menor promedio es ");
				System.out.print(p/50);
				System.out.print(" ,El de la manana");
			}
	}
}