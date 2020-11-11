import java.util.Scanner;
public class P252 {
    private Scanner teclado;
    private String[] nombres;
    private int[][] dias;
    
    public void nombre() {
        teclado=new Scanner(System.in);
        nombres=new String[3];
        for(int f=0;f<nombres.length;f++) {      
            int s=f+1;
            System.out.println("Ingrese su primer nombre empleado " + s);      
                nombres[f]=teclado.next();
            }
        }

    public void dia(){
        dias=new int[3][];
        for(int f=0;f<nombres.length;f++){
            System.out.println("Introduzca cuantos dias fue que faltó empleado " + nombres[f]);
            int e = teclado.nextInt();
            dias[f]=new int[e];
            for(int c=0;c<dias[f].length;c++){
                System.out.println("Introduzca el numero de día que falto de los 365 días del año");
                dias[f][c]=teclado.nextInt();
            }
        }
    }


    public void imprimir() {
        System.out.println("Entonces..." );
        for(int f=0;f<nombres.length;f++) {
            System.out.println("El empleado " + nombres[f] + " falto los dias: ");
            for(int c=0;c<dias[f].length;c++) {
                System.out.println(dias[f][c]);
            }
        }
    }
        public void calcular() {
        int a,b,c;
        a=dias[0].length;
        b=dias[1].length;
        c=dias[2].length;
        if(a>b){
            if(b<c){
                System.out.println("Quien menos faltó fue: " + nombres[1]);
            }else{
                if(b>c){
                    System.out.println("Quien menos faltó fue: " + nombres[2]);
                }
            }
        }else{
            System.out.println("Quien menos faltó fue: " + nombres[0]);
        }
    }
    public static void main(String[] args) {
        P252 maquina=new P252();
        maquina.nombre();
        maquina.dia();
        maquina.imprimir();
        maquina.calcular();
    }   
}