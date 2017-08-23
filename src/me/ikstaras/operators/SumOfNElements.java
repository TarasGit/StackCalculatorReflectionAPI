package me.ikstaras.operators;

import java.util.Stack;

//returns sum of n last elements
public class SumOfNElements implements OperatorInterface {

	private final static String name = "sum";
	
	@Override
	public Stack<Double> compute(Stack<Double> stack) {
		int numElem = stack.pop().intValue();
		Double tempSum = 0.0;
		
		if(numElem > stack.size()){
			return stack;
		}
		
		for(int i=0;i<numElem;i++){
			tempSum += stack.pop();
		}
		stack.push(tempSum);
		
		return stack;
	}

	@Override
	public String getOpName() {
		// TODO Auto-generated method stub
		return name;
	}

}
