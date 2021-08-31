package calculator;

import java.util.LinkedList;
import java.util.Queue;

import calculatorIO.*;
import calculating.Calculating;

public class Calculator {
	public int result;
	
	public Queue<Number> number = new LinkedList<>();
	public Queue<Operator> operator = new LinkedList<>();
	
	public void run() {
		new Input(this);
		new Calculating().doCalculating(this);
		new Output(this);
	}
		
	public Number pollNumber() {
		return number.poll();
	}
	
	public void setNumber(Number number) {
		this.number.add(number);
	}
	
	public Operator pollOperator() {
		return operator.poll();
	}
	
	public void setOperator(Operator operator) {
		this.operator.add(operator);
	}
	
	public void setResult(int number) {
		this.result = number;
	}
	
	public int getResult() {
		return result;
	}
}