package u1ent;

import java.util.Scanner;

public class Ej1_javapackageu1_entregable1 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce numeros naturales y pares hasta que la suma de estos sea 100");
		
		final int total= 100;
		int suma = 0;

			System.out.println("Introduce un numero natural par");
			int num = sc.nextInt();
			
			if(num>=100) {
				System.out.println("Limite superado");
			}
	
			while((num%2==0)&&(num<total)){
					System.out.println("Introduce otro numero natural par");
					num = sc.nextInt();
					num=suma;
					suma++;
					if(num<=total) {
						suma++;
					}
					
					else if (suma>=total){
						System.out.println("Limite superado");
					}
				}
				
				while(!((num%2==0)) | (num<1)) {
					System.out.println("Numero incorrecto, introduce un numero natural par");
					num = sc.nextInt();
				}
		}
}
	
