package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcPower {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testPower() {

		StackCalc.processElements("2");
		StackCalc.processElements("3");
		StackCalc.processElements("3");
		StackCalc.processElements("^");
		
		assertEquals(Double.valueOf(27),(Double)StackCalc.returnResult());
		
	}

}
