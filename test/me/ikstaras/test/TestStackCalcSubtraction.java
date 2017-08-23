package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcSubtraction {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testSub() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("9");
		StackCalc.processElements("-");
		
		assertEquals((Double)5.0, (Double)StackCalc.returnResult());
		
	}
}
