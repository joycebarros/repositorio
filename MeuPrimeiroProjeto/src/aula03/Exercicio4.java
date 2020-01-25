package aula03;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 1;
		int y = 0;
		for (int cont = 0; cont < 15; cont++) {
			System.out.println(y + " ");
			y = y + j;
			j = y - j;
		}

	}

}
