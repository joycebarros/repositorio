package aula03;

public class Exercicios {

	public static void main(String[] args) {
		
		
		
	
		// exerc�cio 03
		//fatorial? quer me foder? Me beija primeiro!
		
		//exerc�cio 04
		//Fibonacci, pqp!
		
		int j = 1;
		
		for(int y = 0, cont = 0; cont < 15; cont++) {
			System.out.println(y + " ");
			y = y + j;
			j = y - j;
		}
		
		System.out.println("\n");
		//exerc�cio 05
		
		int z = 10;
		
		while( z< 1000) {
			if( z % 2 == 0) {
				z = z + 5;
			} else {
				z = z * 2;
			}
			System.out.println(z + ", ");
		}
		
		while ( z < 1000) {
		switch(z % 2) {
		case 0:
			z = z + 5;
			break;
		 default:
			z = z * 2;
		
		}
			System.out.println(z);
		
	}
		
}
}
