package SeriesNumericas;

import java.util.Scanner;
public class S1Num {
          public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de términos a imprimir:");
            int c = scanner.nextInt();
            int a = 0, b = 1; 
            System.out.println("Resultado: ");
            for(int i = 0 ; i < c ; i++){
                System.out.print(a + " ");
                int s = a + b; //s: valor siguiente 
                a = b; 
                b = s; 
            }
            scanner.close();
          }
}
