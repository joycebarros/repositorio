package aula03;

public class Exercicio1 {

	public static void main(String[] args) {
		// exercício 01
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;

		nota1 = nota1 * 3;
		nota2 = nota2 * 2;
		nota3 = nota3 * 5;

		System.out.println("Nota peso 3 = " + nota1);
		System.out.println("Nota peso 2 = " + nota2);
		System.out.println("Nota peso 5 = " + nota3);

		double totalNotas = nota1 + nota2 + nota3;
		System.out.println("A média do aluno é " + totalNotas / 10);
		System.out.println("\n");

	}

}
