package me.ikstaras.operators;

import java.util.Stack;

public class Square implements OperatorInterface {

	private final static String name = "^2";
	
	@Override
	public Stack<Double> compute(Stack<Double> stack) {
		if(stack.size()==0)
			return stack;
		
		stack.push(Math.pow(stack.pop(),2));
		return stack;
	}

	@Override
	public String getOpName() {
		// TODO Auto-generated method stub
		return name;
	}

}
