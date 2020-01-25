package exerciciosAula04;

public class AplicacaoCircunferencia {

	public static void main(String[] args) {
		Circunferencia primeiraCircunferencia = new Circunferencia();
		primeiraCircunferencia.raio = 15;
		
		primeiraCircunferencia.calculaArea();
		
		System.out.println("A Area do circulo é " + primeiraCircunferencia.calculaArea());
		

	}

}
