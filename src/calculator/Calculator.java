package calculator;

import java.util.LinkedList;
import java.util.Queue;

import input.Input;
import output.Output;
import calculating.Calculating;

public class Calculator {
	public int result;
	
	public Queue<Integer> number = new LinkedList<>();
	public Queue<String> operator = new LinkedList<>();
	
	public void run() {
		new Input().inputData(this);
		new Calculating().doCalculating(this);
		new Output().outputData(this);
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public int getResult() {
		return result;
	}
}