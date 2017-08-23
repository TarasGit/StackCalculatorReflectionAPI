package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcSquareRoot {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testSquareRoot() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("3");
		StackCalc.processElements("sqrt");
		
		assertEquals(1.7320, StackCalc.returnResult() , 0.0001);
		
	}
}
