package teste;

public class Teste {

	public static void main(String[] args) {
		Exemplo e1 = new Exemplo();
	    Exemplo e2 = new Exemplo();
	    e1.mudar(e2);
	    System.out.println(e1.y);
	    System.out.println(e2.y);
	}

}
