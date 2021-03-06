package me.ikstaras.operators;

import java.util.Stack;

public class Power implements OperatorInterface {

	
	public static final String name = "^";
	
	@Override
	public Stack<Double> compute(Stack<Double> stack) {
		if(stack.size()<=1)
			return stack;
		
		stack.push(Math.pow(stack.pop(),stack.pop()));
		return stack;
	}

	@Override
	public String getOpName() {
		// TODO Auto-generated method stub
		return name;
	}

}
