package com.chapter1.bad;

public class Operation {
	public static double getResult(double firstNumber,double secondNumber,String operator){
		  double result =0l;
		  switch(operator){
		  case "+": result = firstNumber+secondNumber;break;
		  case "-": result = firstNumber-secondNumber;break;
		  case "*": result = firstNumber*secondNumber;break;
		  case "/": result = firstNumber/secondNumber;break;
		  }
		  return result;
	}
}
