import java.util.Scanner;
public class Prueba3 {
    private Scanner teclado;
    private String [] Palabras = {"h","o","l","a"};
    private String A;
    private int t;

    public void Pedir(){
        teclado=new Scanner(System.in);
        System.out.println("'hola'");
        System.out.println("Dime una letra y te digo cuantas veces aparece en la frase");
        A=teclado.next();    
    }
    public void Buscador() {
        t=0;
        for(int i=0;i<Palabras.length;i++){
            if(A.equals(Palabras[i])){
                t=t+1;
            }
        }
        System.out.println("la cantidad de veces que aparece '" + A + "' es: " + t + " veces");
    }
    public static void main(String[] args){
        Prueba3 maq= new Prueba3();
        maq.Pedir();
        maq.Buscador();

    }
}
