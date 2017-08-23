package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcMultiplication {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testMult() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("4");
		StackCalc.processElements("*");
		
		assertEquals(Double.valueOf(16),(Double)StackCalc.returnResult());
		
	}


}
