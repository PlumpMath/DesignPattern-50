package com.chapter2.good;

public class Calculator {
	private Operation oper;
	public Calculator(Operation oper){
		this.oper = oper;
	}
	public double getResult(){
		return oper.getResult();
	}
}
