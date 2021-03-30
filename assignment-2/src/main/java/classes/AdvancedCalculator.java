package classes;

import interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double raisedToThePowerOf(double base, double exponent) {
		if(base == 0 && exponent < 0) {
			System.out.println("Aja baja");
			return -0.123456789;
		} else {
		double result = Math.pow(base, exponent);
		return result;
		}
	}

	public double max(double firstNumber, double secondNumber) {
		double result = Math.max(firstNumber, secondNumber);
		return result;
	}

	public double min(double firstNumber, double secondNumber) {
		double result = Math.min(firstNumber, secondNumber);
		return result;
	}

	public double absoluteValue(double number) {
		double result = Math.abs(number);	
		return result;
	}

	public double squareRoot(double number) {
		double result = Math.sqrt(number);
		return result;
	}

}
