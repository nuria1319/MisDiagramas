package ejercicio6;

import java.util.Scanner;

public class almacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        int existencias;
		        int entregadas;
		        existencias = 3200;
		        
		        
		        while(existencias>=100){

		            Scanner sc = new Scanner(System.in);
		            System.out.println("Seleccione el numero de existencias a pedir: ");
		            entregadas = sc.nextInt();

		            existencias = existencias - entregadas;

		            System.out.println("Existencias disponibles: "+existencias);
		            
		        }

		        

		            System.out.println("No existen existencias disponibles");
		            
		        

		    }



	}
