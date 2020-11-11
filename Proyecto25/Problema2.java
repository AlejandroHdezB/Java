import java.util.Scanner;
public class Problema2 {
    private Scanner entrada;
    private String[] nombre;
    private int[][] falta;
    private int[][] suma;

    public void nombres() {
        entrada=new Scanner(System.in);
        nombre=new String[3];
        for(int f=0;f<nombre.length;f++) {      
            System.out.println("Ingrese su nombre");      
                nombre[f]=entrada.next();
                System.out.println("ok " + nombre[f]);   
            }
        }

    public void Cargar(){
        suma=new int[3][];
        falta=new int[3][];
        for(int f=0;f<nombre.length;f++){
            System.out.println("Introduzca la cantidad de dias que falto el empleado " + nombre[f]);
            int e = entrada.nextInt();
            falta[f]=new int[e];
            suma[f]=new int[e];
            for(int c=0;c<falta[f].length;c++){
                System.out.println("Introduzca el dia en que falto");
                falta[f][c]=entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        for(int f=0;f<falta.length;f++){
            System.out.print(nombre[f]+" falto " +falta[f].length+ " dias ");
            System.out.println();
         }
        }

    public void calcular() {
        int a,b,c;
        a=falta[0].length;
        b=falta[1].length;
        c=falta[2].length;
        aux=0;
        if(a>b){
            if(b<c){
                System.out.println("Quien menos faltó fue: " + nombre[1]);
            }else{
                if(b>c){
                    System.out.println("Quien menos faltó fue: " + nombre[2]);
                }
            }
        }else{
            System.out.println("Quien menos faltó fue: " + nombre[0]);
        }
    }
    public static void main(String[]ar){
        Problema2 imp=new Problema2();
        imp.nombres();
        imp.Cargar();
        imp.imprimir();
        imp.calcular();
    }
}