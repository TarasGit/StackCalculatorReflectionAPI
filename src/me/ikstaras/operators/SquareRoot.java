package me.ikstaras.operators;

import java.util.Stack;

public class SquareRoot implements OperatorInterface {

	
	public final static String name = "sqrt";
	
	@Override
	public Stack<Double> compute(Stack<Double> stack) {
		if(stack.size()==0)
			return stack;
		
		stack.push(Math.sqrt(stack.pop()));
		return stack;
	}

	@Override
	public String getOpName() {
		// TODO Auto-generated method stub
		return name;
	}

}
