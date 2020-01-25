package aula03;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia = 15; 
		int mes = 2; 
		int ano = 2020; 
		
		if(mes == 2) { // teste do mes de fevereiro
			if(dia > 0 && dia <= 28)
				System.out.println("A Data: " + dia + "/" + mes + "/" + ano);
			else
				System.out.println("data de fevereiro furada");
		}else { // todos os outros meses
			if(dia > 0 && dia <= 31)
				System.out.println("A Data: " + dia + "/" + mes + "/" + ano);
			else
				System.out.println("data do mes " +  mes + "furada");
		}

	}

}
