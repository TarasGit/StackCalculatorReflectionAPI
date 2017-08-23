package me.ikstaras.operators;

import java.util.Stack;


//Returns avg of n elements
public class AVG implements OperatorInterface {

	public final static String name = "avg";
	
	@Override
	public Stack<Double> compute(Stack<Double> stack) {
		int numElem = stack.pop().intValue();
		Double tempSum = 0.0;
		Double avg = 0.0;
		
		if(numElem > stack.size()){
			return stack;
		}
		
		for(int i=0;i<numElem;i++){
			tempSum += stack.pop();
		}
		
		avg = tempSum / numElem;
		stack.push(avg);
		
		return stack;
	}

	@Override
	public String getOpName() {
		// TODO Auto-generated method stub
		return name;
	}

}
