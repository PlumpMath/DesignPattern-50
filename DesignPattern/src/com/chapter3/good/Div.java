package com.chapter3.good;

public class Div extends Operation {
	public Div(double firstNumber,double secondNumber){
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}
	public double getResult(){
		return this.getFirstNumber()/this.getSecondNumber();
	}
}
