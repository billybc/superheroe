
import java.util.*;
public class heroe {

	public static void main(String[] args) {
		

		Scanner uni=new Scanner(System.in);
		
		boolean salir = false; 
		
		int opcion;
		
		
		
			
			System.out.println("1. marvel");
			System.out.println("2. dc comics");
			System.out.println("3. nintendo");
			
			
			try {
				System.out.println("introduce un numero: ");
				opcion = uni.nextInt();
			
			 	switch(opcion) {
			 
			 		case 1:
				 		Scanner nombre= new Scanner(System.in);
				 		int cantidad;
				 		String nom[];
				 			System.out.println("ingrese la cantidad de nombres de super heroes que decee crear");
				 			cantidad=nombre.nextInt();
				 			nom=new String[cantidad];
				 			for (int fila = 0; fila <cantidad; fila++) {
				 				
				 				
				 				System.out.println("lleva "+(fila+1)+"  de "+cantidad );
				 				nom[fila]=nombre.next();
				 					
				 			
				 			}
				 			for (int fila = 0; fila <cantidad; fila++)	{
				 				
				 				
				 					
				 				System.out.print("tu heroe "+nom[fila]+ "   ha sido creado ");
				 				
				 		
				 				System.out.println("");
				 			}
				 		break;
				 
			 		case 2:
				 		Scanner nombre1= new Scanner(System.in);
				 		int cantidad1;
				 		String nom1[];
				 			System.out.println("ingrese la cantidad de nombres de super heroes que decee crear");
				 			cantidad=nombre1.nextInt();
				 			nom=new String[cantidad];
				 			for (int fila = 0; fila <cantidad; fila++) {
				 				
				 				
				 				System.out.println("lleva "+(fila+1)+"  de "+cantidad );
				 				nom[fila]=nombre1.next();
				 					
				 			
				 			}
				 			for (int fila = 0; fila <cantidad; fila++)	{
				 				
				 				
				 					
				 				System.out.print("tu heroe "+nom[fila]+ "   ha sido creado ");
				 				
				 		
				 				System.out.println("");
				 			}
			 			break;
				 
		 			case 3:
				 		Scanner nombre2= new Scanner(System.in);
				 		int cantidad2;
				 		String nom2[];
				 			System.out.println("ingrese la cantidad de nombres de super heroes que decee crear");
				 			cantidad=nombre2.nextInt();
				 			nom=new String[cantidad];
				 			for (int fila = 0; fila <cantidad; fila++) {
				 				
				 				
				 				System.out.println("lleva "+(fila+1)+"  de "+cantidad );
				 				nom[fila]=nombre2.next();
				 					
				 			
				 			}
				 			for (int fila = 0; fila <cantidad; fila++)	{
				 				
				 				
				 					
				 				System.out.print("tu heroe "+nom[fila]+ "   ha sido creado ");
				 				
				 		
				 				System.out.println("");
				 			}
			 			break;
			 
		 		
				 
			 			default:
			 			System.out.println("elije una de las 3 opciones");

			 	}
			
			 }catch (InputMismatchException e) { 
			 		System.out.println("debes ingresar un numero");
			 		uni.next();
			 }
			
		
		
		System.out.println("");
	}

}
