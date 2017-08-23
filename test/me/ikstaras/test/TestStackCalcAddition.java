package me.ikstaras.test;

import me.ikstaras.operators.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcAddition {

	
	
	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testAddition() {
		
		StackCalc.processElements("2");
		StackCalc.processElements("2");
		StackCalc.processElements("+");
		
		assertEquals(Double.valueOf(4),(Double)StackCalc.returnResult());
		
	}


}
