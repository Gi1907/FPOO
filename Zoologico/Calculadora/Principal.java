package Calculadora;

public class Principal {

	public static void main (String [] args) {
		Calculando cal = new Calculando();

		System.out.println(cal.somar(19, 7));
		System.out.println(cal.sub(19, 7));
		System.out.println(cal.mult(19, 7));
		System.out.println(cal.div(19, 7));
		System.out.println(cal.exp(19, 7));

	}
	
	
}
