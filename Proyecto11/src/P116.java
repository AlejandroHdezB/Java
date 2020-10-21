import java.util.Scanner;

public class P116 {
	 public static void main(String[] ar) {
     	  Scanner teclado=new Scanner(System.in);
     	  float x,y,n,f,c1,c2,c3,c4;
     	  c1=0;
     	  c2=0;
     	  c3=0;
     	  c4=0;
     	 System.out.print("Hola, /¿cuantas coordendas tienes?");
         n=teclado.nextFloat();
         for(f=1;f<=n;f++) {
        	 System.out.print("Inserte X por favor");
        	 x=teclado.nextFloat();
        	 System.out.print("Inserte Y por favor");
        	 y=teclado.nextFloat();
        	 if(x==0 && y==0) {
        		 System.out.print("No se encuentran en ningun cuadrante, ya que está en 0,0");
        	 }else {
        		 if(x==0 && y>0) {
        			 System.out.print("Se ecuentran entre el cuadrante 1(-+) y 2(++)");
        		 }else {
        			 if(x==0 && y<0) {
        				 System.out.print("Se encuentran entre el cuadrante 3(--) y 4(+-)");
        			 }else {
        				 if(x>0 && y==0) {
        					 System.out.print("Se encuentran entre el cuadrante 2(++) y 4(+-)");
        				 }else {
        					 if(x<0 && y==0) {
        						 System.out.print("Se encuentran entre el cuadrante 1(-+) y 3(--)");
        					 }
        				 }
        			 }
        		 }
        	 }
        	 if(x>0 && y>0) {
        		 c2++;
        	 }else {
        		 if(x<0 && y<0) {
        			 c3++;
        		 }else {
        			 if(x<0 && y>0) {
        				 c1++;
        			 }else {
        				 c4++;
        			 }
        		 }
        	 }
         }
         System.out.print("Al final, el primer cuadrante tuvo: ");
         System.out.print(c1);
         System.out.println("apariciones");
         System.out.print("el segundo cuadrante tuvo: ");
         System.out.print(c2);
         System.out.println("apariciones");
         System.out.print("el tercer cuadrante: ");
         System.out.print(c3);
         System.out.println("apariciones");
         System.out.print("y el cuarto cuadrante: ");
         System.out.print(c4);
         System.out.println("apariciones");
	 }
}