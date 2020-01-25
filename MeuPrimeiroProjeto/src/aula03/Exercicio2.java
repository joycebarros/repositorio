package aula03;

public class Exercicio2 {

	public static void main(String[] args) {
		// exercício 02
		// ponto 1

		for (int numeros = 10; numeros <= 25; numeros++) {

			System.out.println(numeros);
		}
		System.out.println("\n");
		// ponto 2
		int soma = 0;
		for (int i = 1; i <= 100; i = i + 2) {
			soma = soma + 1;
		}
		System.out.println(soma);
		System.out.println("\n");

		// ponto 3

		int acumulador = 0;
		for (int contador = 0; contador <= 100; contador++) {
			if (acumulador <= 100) {
				System.out.println("### ACUMULADOR: " + acumulador + " #### " + "VALOR DE CONTADOR: " + contador);
				acumulador = acumulador + contador;
			}
		}

		for (int x = 0; x < 100; x++) {
			System.out.println(x);
		}
		System.out.println("\n");
		// ponto 3 resposta do curso
		int r = 0;
		int i = 0;
		while (r + i < 100) {
			System.out.println(i);
			r += i;
			i++;
		}
		System.out.println("\n");

		// ponto 4
		int x = 1;
		while (x <= 10) {
			System.out.println(9 * x);
			x++;
		}
		System.out.println("\n");
		
		
		//variável para controlar quantos números já foram impressos
		int cont = 0;
		
		System.out.println(" SOLUCAO DO CURSO ");
		
		//inicia o for com o i valendo 1
		for(int kct = 1; cont < 10; kct++) {
			
			//o código if verifica se o resto da divisão entre i e 9 é 0.
			//caso seja, o número é múltiplo de 9 e deve ser impresso
			if(kct % 9 == 0) {
				System.out.println(kct);
				
				//incrementa a quantidade de números impressos
				cont++;
			}
		}

	}

}
