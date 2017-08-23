package me.ikstaras.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.ikstaras.calculator.StackCalc;

public class TestStackCaclAllOps {

	@Before
	public void initialize(){
		StackCalc.initOperators();
	}
	
	@Test
	public void testAll() {

		StackCalc.processElements("2");
		StackCalc.processElements("3");
		StackCalc.processElements("6");
		StackCalc.processElements("+");//2,9
		StackCalc.processElements("-");//7
		StackCalc.processElements("5");//7,5
		StackCalc.processElements("^2");//7,25
		StackCalc.processElements("sqrt");//7,5
		StackCalc.processElements("2");
		StackCalc.processElements("3");
		StackCalc.processElements("^");//7,5,9
		StackCalc.processElements("3");
		StackCalc.processElements("sum");//21
		StackCalc.processElements("2");
		StackCalc.processElements("*");//42
		StackCalc.processElements("84");
		StackCalc.processElements("/");//2
		StackCalc.processElements("2");
		StackCalc.processElements("3");//2,2,3
		StackCalc.processElements("3");
		StackCalc.processElements("avg");//2,3333
		
		
		assertEquals(Double.valueOf(2.3333),(Double)StackCalc.returnResult(),0.0001);
		
	}
}
