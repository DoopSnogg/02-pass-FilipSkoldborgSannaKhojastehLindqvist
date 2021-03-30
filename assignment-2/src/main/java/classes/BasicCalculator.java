package classes;

import interfaces.BasicOperations;

public class BasicCalculator implements BasicOperations {

	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0.0) {
			System.out.println("Aja baja");
			return -0.123456789;
		} else {
			double result = firstNumber / secondNumber;
			return result;
		}
	}
}
