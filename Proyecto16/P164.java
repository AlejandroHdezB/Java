import java.util.Scanner;
public class P164 {
    private Scanner teclado;
    private float[] Arreglo;

    public void Lista(){
        teclado=new Scanner(System.in);
        Arreglo=new float [11];
        for (int f=0; f<10; f++){
            int suma = f + 1;
            System.out.println("Ingresar el valor numero" + suma);
            Arreglo[f]=teclado.nextFloat();
        }
    }
    public void Ordenar() {
        int o=1;
        for(int f=0;f<9;f++) {
            if (Arreglo[f+1]>Arreglo[f]) {
                o=0;
            }
        }
        if (o==1) {
            System.out.println("La lista si está ordenada de mayor a menor");
        } else {
            System.out.println("La lista no está ordenada");
        }
    }
    public static void main (String[] args){
        P164 maquinola=new P164();
        maquinola.Lista();
        maquinola.Ordenar();
    }
}
