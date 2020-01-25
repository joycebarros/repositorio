package aula03;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota = 0.0;
		double notaAcumulada = 0.0;
		int contador = 0;
		while (nota != -1) {
			nota = Console.readDouble();
			if (nota == -1)
				break;
			notaAcumulada = notaAcumulada + nota;
			contador = contador + 1;
		}

		System.out.println("Nota Acumulada = " + notaAcumulada / contador);

	}

}
