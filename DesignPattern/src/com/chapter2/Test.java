package com.chapter2;

import com.chapter2.good.CalculatorFactory;
/*
 * 策略模式
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator calculator = new Calculator(new Add(30,20));
		CalculatorFactory calculator = new CalculatorFactory("+",30,20);
		System.out.println(calculator.getResult());
	}

}
