package com.chapter2.good;

import com.chapter1.good.Add;
import com.chapter1.good.Div;
import com.chapter1.good.Mul;
import com.chapter1.good.Operation;
import com.chapter1.good.Sub;

public class CalculatorFactory {
	private Operation oper;
	public CalculatorFactory(String operate,double firstNumber,double secondNumber){
		  switch(operate){
		  case "+": oper = new Add(firstNumber,secondNumber);break;
		  case "-": oper = new Sub(firstNumber,secondNumber);break;
		  case "*": oper = new Mul(firstNumber,secondNumber);break;
		  case "/": oper = new Div(firstNumber,secondNumber);break;
		  }
	}
	public double getResult(){
		return oper.getResult();
	}
}
