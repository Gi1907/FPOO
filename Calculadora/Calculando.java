package Calculadora;

public class Calculando implements Calculos{


		@Override
		public double somar (double g1, double g2) {
			return g1 + g2;
		}
		
		@Override
		public double sub (double g1, double g2) {
			return g1-g2;
		}
		
		@Override
		public double mult(double g1, double g2) {
		return g1*g2;
		}
		
		@Override
		public int div(int g1, int g2) {
		return g1/g2;
		}
		
		@Override
		public int exp(int g1, int g2) {
			return g1 ^ g2;

		}
		
	}