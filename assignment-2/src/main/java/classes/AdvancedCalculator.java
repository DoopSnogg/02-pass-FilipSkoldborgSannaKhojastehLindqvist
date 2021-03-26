package classes;

import interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double raisedToThePowerOf(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
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
