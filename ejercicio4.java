package u1ent;
import java.util.Scanner;
public class ejercicio4 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce la longitud del triangulo: ");
        int longi = sc.nextInt();

       
        for (int i = longi; i >= 1; i--) {
        		
            for (int j = 1; j <= i; j++) {
                System.out.print("-"); 
            }
            
            System.out.println();
        }
    }
}