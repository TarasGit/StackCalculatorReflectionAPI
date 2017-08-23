package me.ikstaras.operators;

import java.util.Stack;

public interface OperatorInterface {
	
	public Stack<Double> compute(Stack<Double> stack); 
	public String getOpName();

}
