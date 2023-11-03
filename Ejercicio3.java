package u1ent;

import java.util.Scanner;

public class Ejercicio3 {
	
	public class Ej3 {
		public static void main (String[]args) {
			Scanner sc = new Scanner (System.in);
			
			int precio = 0;
			double desc = (12*100)/precio;
			
		
			System.out.println("Pedidos burbur");
			
			System.out.println("Numero hamburguesas basicas: ");
			int basica = sc.nextInt();
			
			if (basica<0) {
				int totbasica= basica + 3;
				precio=totbasica;
			}
			
			System.out.println("Numero hamburguesas gourmet: ");
			int gourmet = sc.nextInt();
			
			if(gourmet<0) {
				int totgourmet= gourmet +5;
				precio+=totgourmet;
			}
			
			
			System.out.println("Dia de la semana: ");
			int dia = sc.nextInt();
			
			System.out.println("Pertenece al club Fanegas? (s/n)");
			String sino = sc.next();
			
			System.out.println("Aqui tienes su pedido, gracias por su compra");
			
			System.out.println("Hamburguesas basicas: "+basica);
			
			System.out.println("Hamburguesas gourmet: "+gourmet);
			
			System.out.println("Total: "+precio);
		
		}
	}
}
