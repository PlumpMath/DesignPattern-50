package com.chapter1.good;

public class OperatorFactory {
	public static Operation createOperate(String operate,double firstNumber,double secondNumber){
			Operation oper=null;
		  switch(operate){
		  case "+": oper = new Add(firstNumber,secondNumber);break;
		  case "-": oper = new Sub(firstNumber,secondNumber);break;
		  case "*": oper = new Mul(firstNumber,secondNumber);break;
		  case "/": oper = new Div(firstNumber,secondNumber);break;
		  }
		  return oper;
	}
}
