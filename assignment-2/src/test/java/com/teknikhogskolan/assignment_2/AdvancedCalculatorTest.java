package com.teknikhogskolan.assignment_2;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import classes.AdvancedCalculator;

public class AdvancedCalculatorTest {
	AdvancedCalculator advCalc = new AdvancedCalculator();
	Random random = new Random();
															//Vad betyder detta?
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	@Test
	public void testAdvancedRaisedToThePowerOf() {
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
			tempResult = Math.pow(tempRandomValue1, tempRandomValue2);
			tempResultSub1 = Math.pow(tempRandomValueSub1, tempRandomValue2);
			tempResultSub2 = Math.pow(tempRandomValue1, tempRandomValueSub2);
			tempResultSub3 = Math.pow(tempRandomValueSub1, tempRandomValueSub2);
			
			LOG.info("Testing the method advCalc.raisedToThePowerOf");
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValue1, tempRandomValue2),tempResult,0);
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
			}
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValue1, 0),1,0);
			assertEquals(advCalc.raisedToThePowerOf(0, tempRandomValue2),0,0);
			assertEquals(advCalc.raisedToThePowerOf(0, 0),1,0);
			assertEquals(advCalc.raisedToThePowerOf(tempRandomValueSub1, 0),1,0);
			assertEquals(advCalc.raisedToThePowerOf(0, tempRandomValueSub2),-0.123456789,0);
	}
	
	
	@Test
	public void testAdvancedMax() {
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
			tempResult = Math.max(tempRandomValue1, tempRandomValue2);
			tempResultSub1 = Math.max(tempRandomValueSub1, tempRandomValue2);
			tempResultSub2 = Math.max(tempRandomValue1, tempRandomValueSub2);
			tempResultSub3 = Math.max(tempRandomValueSub1, tempRandomValueSub2);
			
			LOG.info("Testing the method advCalc.max");
			assertEquals(advCalc.max(tempRandomValue1, tempRandomValue2),tempResult,0);
			assertEquals(advCalc.max(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
			assertEquals(advCalc.max(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
			assertEquals(advCalc.max(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
			}
			assertEquals(advCalc.max(tempRandomValue1, 0),tempRandomValue1,0);
			assertEquals(advCalc.max(0, tempRandomValue2),tempRandomValue2,0);
			assertEquals(advCalc.max(0, 0),0,0);
			assertEquals(advCalc.max(tempRandomValueSub1, 0),0,0);
			assertEquals(advCalc.max(0, tempRandomValueSub2),0,0);
	}
	
	
	@Test
	public void testAdvancedMin() {
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
			tempResult = Math.min(tempRandomValue1, tempRandomValue2);
			tempResultSub1 = Math.min(tempRandomValueSub1, tempRandomValue2);
			tempResultSub2 = Math.min(tempRandomValue1, tempRandomValueSub2);
			tempResultSub3 = Math.min(tempRandomValueSub1, tempRandomValueSub2);
			
			LOG.info("Testing the method advCalc.min");
			assertEquals(advCalc.min(tempRandomValue1, tempRandomValue2),tempResult,0);
			assertEquals(advCalc.min(tempRandomValueSub1, tempRandomValue2),tempResultSub1,0);
			assertEquals(advCalc.min(tempRandomValue1, tempRandomValueSub2),tempResultSub2,0);
			assertEquals(advCalc.min(tempRandomValueSub1, tempRandomValueSub2),tempResultSub3,0);
			}
			assertEquals(advCalc.min(tempRandomValue1, 0),0,0);
			assertEquals(advCalc.min(0, tempRandomValue2),0,0);
			assertEquals(advCalc.min(0, 0),0,0);
			assertEquals(advCalc.min(tempRandomValueSub1, 0),tempRandomValueSub1,0);
			assertEquals(advCalc.min(0, tempRandomValueSub2),tempRandomValueSub2,0);
	}
	
	
	@Test
	public void testAdvancedAbsoluteValue() {
		double tempRandomValue1 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		
		for(int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * 9999;
			tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
			tempResult = Math.abs(tempRandomValue1);
			tempResultSub1 = Math.abs(tempRandomValueSub1);
			
			LOG.info("Testing the method advCalc.absoluteValue");
			assertEquals(advCalc.absoluteValue(tempRandomValue1),tempResult,0);
			assertEquals(advCalc.absoluteValue(tempRandomValueSub1),tempResultSub1,0);
			}
			assertEquals(advCalc.absoluteValue(0),0,0);
	}
	
	
	@Test
	public void testAdvancedSquareRoot() {
		double tempRandomValue1 = 0.0;
		double tempRandomValueSub1 = 0.0;
		double tempResult = 0.0;
		double tempResultSub1 = 0.0;
		
		for(int i = 0; i < 5; i++) {
			tempRandomValue1 = random.nextDouble() * 9999;
			tempRandomValueSub1 = tempRandomValue1 - (tempRandomValue1 * 2);
			tempResult = Math.sqrt(tempRandomValue1);
			tempResultSub1 = Math.sqrt(tempRandomValueSub1);
			
			LOG.info("Testing the method advCalc.squareRoot");
			assertEquals(advCalc.squareRoot(tempRandomValue1),tempResult,0);
			assertEquals(advCalc.squareRoot(tempRandomValueSub1),tempResultSub1,0);
			}
			assertEquals(advCalc.squareRoot(0),0,0);
	}

}
