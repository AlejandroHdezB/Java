import java.util.Scanner;
public class Prueba {
    private Scanner teclado;
    private String [] Arreglo= {"h", "o", "l", "a", "a", "l", "m", "u", "n", "d", "o", "c", "o", "m", "o", "e", "s", "t", "a", "n"};
    private String a;
    private int t;

    public void Pedir() {
        teclado=new Scanner(System.in);
        System.out.println("Hola al mundo como estan");
        System.out.println("Dame una letra y te digo cuantas veces aparecece en la frase");
        a=teclado.next();
            }
	public void Buscador() {
        t=0;
        for(int i=0;i<Arreglo.length;i++) {
            if(a.equals(Arreglo[i])){
                t=t+1;
            }
        } 
        System.out.println("La cantidad de veces que parece '" + a + "' son: " + t);
    }
    public static void main(String[] ar) {
        Prueba maquina=new Prueba();
        maquina.Pedir();
        maquina.Buscador();

    }
    
}
