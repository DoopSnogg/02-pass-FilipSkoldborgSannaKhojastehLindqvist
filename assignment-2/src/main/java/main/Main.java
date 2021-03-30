package main;

import classes.AdvancedCalculator;
import classes.BasicCalculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator baseCalc = new BasicCalculator();
		System.out.println(baseCalc.addition(8, 8));

		AdvancedCalculator advCalc = new AdvancedCalculator();
		System.out.println(advCalc.max(15, 14));

	}
}
