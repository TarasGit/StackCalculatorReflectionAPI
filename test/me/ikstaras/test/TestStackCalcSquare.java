package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCalcSquare {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testSquare() {

		StackCalc.processElements("2");
		StackCalc.processElements("4");
		StackCalc.processElements("3");
		StackCalc.processElements("^2");
		
		assertEquals((Double)9.0,StackCalc.returnResult());
		
	}


}
