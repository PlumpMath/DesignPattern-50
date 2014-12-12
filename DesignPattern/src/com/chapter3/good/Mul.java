package com.chapter3.good;

public class Mul extends Operation {
	public Mul(double firstNumber,double secondNumber){
		this.setFirstNumber(firstNumber);
		this.setSecondNumber(secondNumber);
	}
	public double getResult(){
		return this.getFirstNumber()*this.getSecondNumber();
	}
}
