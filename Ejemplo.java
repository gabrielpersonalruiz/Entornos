package practicaentornos;
import java.util.Scanner;

public class Navidad07 {
    static int a = (int) ((Math.random() * 100)+1); 
    static int b; 
    static int i; 
   static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {
 

 System.out.print("Try to get the number that im thinking of. Write a number between 1 and 100: ");
 b = teclado.nextInt();

do{     
    if (a > b){ 
      System.out.println("The number is BIGGER");
      i++;
    }else if (a < b){
      System.out.println("The number is SMALLER");
      i++;
    }if(a!=b){
        System.out.print("Try again: ");
        b=teclado.nextInt();
    }
} while (a!=b);
System.out.println("Correct, You got it right!");  
System.out.println("You've made "+i+" tries");
}
}

