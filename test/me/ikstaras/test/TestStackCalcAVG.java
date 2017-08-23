package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcAVG {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testAVG() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("2");
		StackCalc.processElements("avg");
		
		assertEquals(Double.valueOf(3),(Double)StackCalc.returnResult());
		
	}

}


