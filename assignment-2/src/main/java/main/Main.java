package main;

import classes.AdvancedCalculator;
import classes.BasicCalculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator baseCalc = new BasicCalculator();
		System.out.println(baseCalc.addition(1, 2));
		System.out.println(baseCalc.subtraction(1, 2));
		System.out.println(baseCalc.multiplication(1, 2));
		System.out.println(baseCalc.division(1, 2));

		AdvancedCalculator advCalc = new AdvancedCalculator();
		System.out.println(advCalc.addition(1, 2));
		System.out.println(advCalc.subtraction(1, 2));
		System.out.println(advCalc.multiplication(1, 2));
		System.out.println(advCalc.division(1, 2));
		System.out.println(advCalc.raisedToThePowerOf(1, 2));
		System.out.println(advCalc.max(1, 2));
		System.out.println(advCalc.min(1, 2));
		System.out.println(advCalc.absoluteValue(1));
		System.out.println(advCalc.squareRoot(1));

	}
}
