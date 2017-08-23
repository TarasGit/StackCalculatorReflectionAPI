package me.ikstaras.calculator;

import java.awt.List;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

import org.reflections.Reflections;

import me.ikstaras.operators.OperatorInterface;

public class StackCalc {
	
	private static final boolean D = false;//DEBUG

	private static Reflections reflections = new Reflections("me.ikstaras.operators");
	private static Set<Class<? extends OperatorInterface>> subTypes = 
	           reflections.getSubTypesOf(OperatorInterface.class);
	
	private static Stack<Double> stack = new Stack<Double>();
	private static Map<String, OperatorInterface> operators = new HashMap<String, OperatorInterface>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		initOperators();
		
		showOperators();
		
		printStack();
		
		while(true){
			
			System.out.print("Input ");
			input = sc.nextLine();
			
			if(Pattern.matches("^(q).*", input)){
				System.out.println("Quit the App");
				break;
			}
			
			processElements(input);
			printStack();
		}
		
		sc.close();
	}
	
	public static void processElements(String input){
		
		if(Pattern.matches("\\d+(\\.\\d+)?", input)){
			stack.push(Double.parseDouble(input));
			if(D)System.out.println("parsed to Double: " + input);
		}else{
			
			if(operators.keySet().contains(input)){
				OperatorInterface op = operators.get(input);
				if( op!= null){
					op.compute(stack);
				}
			}else{
				System.out.println("Operator is not supported");
			}
		}
	}
	
	public static void showOperators(){
		System.out.println("List of supported operators: " + operators.keySet());
	}
	
	/*
	 * 
	 * The second part 2.2 of the task requires a dynamic scan of operators with
	 * Java Reflection API, so the decision was made to relinquish the static implementation.
	 * 
	 * */
	public static void initOperators(){
		
		if(D){
			Iterator<Class<? extends OperatorInterface>> it = subTypes.iterator();
			System.out.println("Show all scanned operators:");
			while(it.hasNext()){
				System.out.println(it.next().getName());
			}
		}
		
		for(Class<? extends OperatorInterface> c: subTypes){
			OperatorInterface op;
			try {
				op = (OperatorInterface)c.newInstance();
				if(D)System.out.println("Put operator to list of operators:" + op.getOpName());
				operators.put(op.getOpName(), op);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * 
	 */
	public static void printStack(){
		
		
		System.out.print("Stack[");
		for(Double elem : stack){
			if(elem % 1 == 0){//no decimal value
				System.out.print(elem.intValue() + ";");
			}else{
				printFormatedDouble(elem);
				System.out.print(";");
			}
		}
		System.out.print("]");
		System.out.println();
	}

	public static void printFormatedDouble(Double d){
		DecimalFormat f = new DecimalFormat("#0.0000");
		System.out.print(f.format(d));
	}
	
	public static Double returnResult(){
		return stack.peek();
	}
}
