package com.chapter2.good;

public class Add extends Operation {
	public Add(double firstNumber,double secondNumber){
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}
	public double getResult(){
		return this.getFirstNumber()+this.getSecondNumber();
	}
}