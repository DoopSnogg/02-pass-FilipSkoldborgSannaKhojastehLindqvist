package com.teknikhogskolan.assignment_2;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import classes.AdvancedCalculator;
import classes.BasicCalculator;

public class CalculatorTest {
	BasicCalculator baseCalc = new BasicCalculator();
	AdvancedCalculator advCalc = new AdvancedCalculator();
	Random random = new Random();
															//Vad betyder detta?
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());


	@Test	
	public void testAdditionBasic() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 + tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 + tempRandomValue2;
		tempResultSub2 = tempRandomValue1 + tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 + tempRandomValueSub2;
		
		LOG.info("Testing the method baseCalc.addition");
		assertEquals(baseCalc.addition(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(baseCalc.addition(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(baseCalc.addition(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(baseCalc.addition(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(baseCalc.addition(tempRandomValue1, 0),tempRandomValue1,0);
		assertEquals(baseCalc.addition(0, tempRandomValue2),tempRandomValue2,0);
		assertEquals(baseCalc.addition(0, 0),0,0);
		assertEquals(baseCalc.addition(tempRandomValueSub1, 0),tempRandomValueSub1,0);
		assertEquals(baseCalc.addition(0, tempRandomValueSub2),tempRandomValueSub2,0);
	}
	
	
	@Test
	public void testAdditionAdvanced() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 + tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 + tempRandomValue2;
		tempResultSub2 = tempRandomValue1 + tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 + tempRandomValueSub2;
		
		LOG.info("Testing the method advCalc.addition");
		assertEquals(advCalc.addition(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(advCalc.addition(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(advCalc.addition(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(advCalc.addition(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(advCalc.addition(tempRandomValue1, 0),tempRandomValue1,0);
		assertEquals(advCalc.addition(0, tempRandomValue2),tempRandomValue2,0);
		assertEquals(advCalc.addition(0, 0),0,0);
		assertEquals(advCalc.addition(tempRandomValueSub1, 0),tempRandomValueSub1,0);
		assertEquals(advCalc.addition(0, tempRandomValueSub2),tempRandomValueSub2,0);
	}
	
	
	@Test
	public void testSubtractionBasic() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 - tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 - tempRandomValue2;
		tempResultSub2 = tempRandomValue1 - tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 - tempRandomValueSub2;
		
		LOG.info("Testing the method baseCalc.subtraction");
		assertEquals(baseCalc.subtraction(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(baseCalc.subtraction(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(baseCalc.subtraction(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(baseCalc.subtraction(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(baseCalc.subtraction(tempRandomValue1, 0),tempRandomValue1,0);
		assertEquals(baseCalc.subtraction(0, tempRandomValue2),tempRandomValueSub2,0);
		assertEquals(baseCalc.subtraction(0, 0),0,0);
		assertEquals(baseCalc.subtraction(tempRandomValueSub1, 0),tempRandomValueSub1,0);
		assertEquals(baseCalc.subtraction(0, tempRandomValueSub2),tempRandomValue2,0);
	}
	
	
	@Test
	public void testSubtractionAdvanced() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 - tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 - tempRandomValue2;
		tempResultSub2 = tempRandomValue1 - tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 - tempRandomValueSub2;
		
		LOG.info("Testing the method advCalc.subtraction");
		assertEquals(advCalc.subtraction(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(advCalc.subtraction(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(advCalc.subtraction(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(advCalc.subtraction(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(advCalc.subtraction(tempRandomValue1, 0),tempRandomValue1,0);
		assertEquals(advCalc.subtraction(0, tempRandomValue2),tempRandomValueSub2,0);
		assertEquals(advCalc.subtraction(0, 0),0,0);
		assertEquals(advCalc.subtraction(tempRandomValueSub1, 0),tempRandomValueSub1,0);
		assertEquals(advCalc.subtraction(0, tempRandomValueSub2),tempRandomValue2,0);
	}
	
	
	@Test
	public void testMultiplicationBasic() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 * tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 * tempRandomValue2;
		tempResultSub2 = tempRandomValue1 * tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 * tempRandomValueSub2;
		
		LOG.info("Testing the method baseCalc.multiplication");
		assertEquals(baseCalc.multiplication(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(baseCalc.multiplication(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(baseCalc.multiplication(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(baseCalc.multiplication(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(baseCalc.multiplication(tempRandomValue1, 0),0,0);
		assertEquals(baseCalc.multiplication(0, tempRandomValue2),0,0);
		assertEquals(baseCalc.multiplication(0, 0),0,0);
		assertEquals(baseCalc.multiplication(tempRandomValueSub1, 0),0,0);
		assertEquals(baseCalc.multiplication(0, tempRandomValueSub2),0,0);
	}
	
	
	@Test
	public void testMultiplicationAdvanced() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 * tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 * tempRandomValue2;
		tempResultSub2 = tempRandomValue1 * tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 * tempRandomValueSub2;
		
		LOG.info("Testing the method advCalc.multiplication");
		assertEquals(advCalc.multiplication(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(advCalc.multiplication(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(advCalc.multiplication(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(advCalc.multiplication(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(advCalc.multiplication(tempRandomValue1, 0),0,0);
		assertEquals(advCalc.multiplication(0, tempRandomValue2),0,0);
		assertEquals(advCalc.multiplication(0, 0),0,0);
		assertEquals(advCalc.multiplication(tempRandomValueSub1, 0),0,0);
		assertEquals(advCalc.multiplication(0, tempRandomValueSub2),0,0);
	}
	
	
	@Test
	public void testDivisionBasic() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 / tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 / tempRandomValue2;
		tempResultSub2 = tempRandomValue1 / tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 / tempRandomValueSub2;
		
		LOG.info("Testing the method baseCalc.division");
		assertEquals(baseCalc.division(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(baseCalc.division(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(baseCalc.division(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(baseCalc.division(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(baseCalc.division(tempRandomValue1, 0),-0.123456789,0);
		assertEquals(baseCalc.division(0, tempRandomValue2),0,0);
		assertEquals(baseCalc.division(0, 0),-0.123456789,0);
		assertEquals(baseCalc.division(tempRandomValueSub1, 0),-0.123456789,0);
		assertEquals(baseCalc.division(0, tempRandomValueSub2),0,0);
	}
	
	
	@Test
	public void testDivisionAdvanced() {
		double tempRandomValue1 = 0.0;
		double tempRandomValue2 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempRandomValueSub2 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		double tempResultSub2 = 0.0;
		double tempResultSub3 = 0.0;
		
		for(int i = 0; i < 5; i++) {
		tempRandomValue1 = random.nextDouble() * 9999;
		tempRandomValue2 = random.nextDouble() * 9999;
		tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
		tempRandomValueSub2 = tempRandomValue2 - (tempRandomValue2 * 2);
		tempResult = tempRandomValue1 / tempRandomValue2;
		tempResultSub1 = tempRandomValueSub1 / tempRandomValue2;
		tempResultSub2 = tempRandomValue1 / tempRandomValueSub2;
		tempResultSub3 = tempRandomValueSub1 / tempRandomValueSub2;
		
		LOG.info("Testing the method advCalc.division");
		assertEquals(advCalc.division(tempRandomValue1, tempRandomValue2),tempResult,0);
		assertEquals(advCalc.division(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
		assertEquals(advCalc.division(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
		assertEquals(advCalc.division(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
		}
		assertEquals(advCalc.division(tempRandomValue1, 0),-0.123456789,0);
		assertEquals(advCalc.division(0, tempRandomValue2),0,0);
		assertEquals(advCalc.division(0, 0),-0.123456789,0);
		assertEquals(advCalc.division(tempRandomValueSub1, 0),-0.123456789,0);
		assertEquals(advCalc.division(0, tempRandomValueSub2),0,0);
	}
		

}
