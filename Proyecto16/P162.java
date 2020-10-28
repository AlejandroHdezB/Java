import java.util.Scanner;
public class P162 {
    private Scanner teclado;
    private float[] numerouno;
    private float[] numerodos;
    private float[] numerotres;

    public void Primerarreglo(){
        teclado=new Scanner(System.in);
        numerouno=new float[5];
        numerotres=new float[5];
        for(int f=0; f<4; f++){
            System.out.println("Ingresar numero para el arreglo uno");
            numerouno[f]=teclado.nextFloat();
        }
    }
    public void Segundoarreglo(){
        teclado=new Scanner(System.in);
        numerodos=new float[5];
        for(int f=0; f<4; f++){
            System.out.println("Ingresar numero para el arreglo dos");
            numerodos[f]=teclado.nextFloat();
    }
} 
    public void Tercerarreglo(){
        teclado=new Scanner(System.in);
        numerotres=new float[5];
        for(int f=0; f<4; f++){
            int suma=f+1;
            numerotres[f]=numerouno[f] + numerodos[f];
            System.out.println("La suma de los numeros " + suma + " son: " + numerotres[f]);
        }
    }    
    public static void main (String[] ar){
        P162 maquinola=new P162();
        maquinola.Primerarreglo();
        maquinola.Segundoarreglo();
        maquinola.Tercerarreglo();
    }
}

