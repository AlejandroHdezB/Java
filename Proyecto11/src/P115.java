import java.util.Scanner;

public class P115 {
    public static void main(String[] ar) {
      	  Scanner teclado=new Scanner(System.in);
      	   float x,y,z,n,t,equi,iso,esca;
           int f;
           x=0;
           equi=0;
           iso=0;
           esca=0;
           y=0;
           z=0;
           System.out.print("Hola,¿cuantos triangulos vamos a calcular hoy?");
           n=teclado.nextFloat();
           for(f=1;f<=n;f++) {
           	System.out.print("Inserte primer lado");
           	x=teclado.nextFloat();
           	System.out.print("Inserte segundo lado");
           	y=teclado.nextFloat();
           	System.out.print("Inserte tercer lado");
           	z=teclado.nextFloat();
           	if(y==x||y==z||x==z) {
           		if(x==z && y==x) {
           			System.out.println("Este triangulo es equilatero");
           			equi++;
           		}else {
           			System.out.println("Este triangulo es isoceles");
           			iso++;
           		}
           	}else {
           		System.out.println("Este triangulo es escaleno");
           		esca++;
           	}
         

           	}
           if(equi > iso || equi > esca) {
        	   if(iso > esca) {
        		   System.out.println("El tipo de triangulo con menores apariciones fue ESCALENO");
        	   }else {
        		   System.out.println("El tipo de triangulo con menores apariciones fue ISOCELES");
        	   }
           }else {
        	   System.out.println("El tipo de triangulo con menores apariciones fue EQUILATERO");
           }
           System.out.println("El triangulo EQUILATERO tuvo: ");
           System.out.print(equi);
           System.out.println(" apariciones");
           System.out.println("El triangulo ISOCELES tuvo: ");
           System.out.print(iso);
           System.out.println(" apariciones");
           System.out.print("El triangulo ESCALENO tuvo: ");
           System.out.println(esca);
           System.out.println(" apariciones");
         }
    }
    
