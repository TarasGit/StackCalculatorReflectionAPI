package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcDivision {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testDivision() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("8");
		StackCalc.processElements("/");
		
		assertEquals(Double.valueOf(2),(Double)StackCalc.returnResult());
		
	}

}
