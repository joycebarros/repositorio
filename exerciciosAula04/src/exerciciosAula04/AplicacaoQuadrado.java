package exerciciosAula04;

public class AplicacaoQuadrado {

	public static void main(String[] args) {
		Quadrado primeiroQuadrado = new Quadrado();
		
		primeiroQuadrado.lado = 10;
		primeiroQuadrado.calculaArea();
		System.out.println("A area do quadrado é " + primeiroQuadrado.calculaArea());
		

	}

}
