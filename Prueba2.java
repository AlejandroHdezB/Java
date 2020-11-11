import java.util.Scanner;
public class Prueba2 {
    private Scanner teclado;
    private String [] Arreglo= {"h", "o", "l", "a"};
    private String A;
    private int t;

    public void Pedir(){
        teclado=new Scanner(System.in);
        System.out.println("'Hola'");
        System.out.println("Dime una letra y te digo cuantas veces aparece en la frase");
        A=teclado.next();
    }

    public void Buscador() {
        t=0;
        for(int i=0;i<Arreglo.length;i++){
            if(A.equals(Arreglo[i])){
                t=t+1;
            }
        }
        System.out.println("La cantidad de veces que aparece '" + A + "' es: " + t + " veces");
    }
    public static void main(String[] ar){
        Prueba2 maquina=new Prueba2();
        maquina.Pedir();
        maquina.Buscador();
    }
}
