package practicaentornos;
import java.util.Scanner;

public class Navidad07 {
    static int a = (int) ((Math.random() * 100)+1); 
    static int b; 
    static int i; 
   static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {
 

 System.out.print("Intenta averiguar en que numero estoy pensando. Escribe un número entre 1 y 100: ");
 b = teclado.nextInt();

do{     
    if (a > b){ 
      System.out.println("El número es MAYOR");
      i++;
    }else if (a < b){
      System.out.println("El número es MENOR");
      i++;
    }if(a!=b){
        System.out.print("Vuelve a Intentarlo: ");
        b=teclado.nextInt();
    }
} while (a!=b);
System.out.println("Correcto, ¡Has Acertado!");  
System.out.println("Has hecho "+i+" intentos");
}
}
/* Lo que hace este programa es generar un número aleatorio entre 1 y 100 
 * e intenta que tu lo averigues diciendote cuando lo aciertas, la cantidad de intentos que has hecho */
