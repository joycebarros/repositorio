package exerciciosAula04;

public class AplicacaoTrapezio {

	public static void main(String[] args) {
		Trapezio primeiroTrapezio = new Trapezio();
		
		primeiroTrapezio.baseMaior = 15;
		primeiroTrapezio.baseMenor = 10;
		primeiroTrapezio.altura = 12;
		
		primeiroTrapezio.calculaArea();
		
		System.out.println("A area do trapézio é " + primeiroTrapezio.calculaArea());

	}

}
