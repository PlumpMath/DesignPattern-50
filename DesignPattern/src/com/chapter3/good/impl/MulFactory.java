package com.chapter3.good.impl;

import com.chapter3.good.ICalculatorFactory;
import com.chapter3.good.Mul;
import com.chapter3.good.Operation;

public class MulFactory implements ICalculatorFactory{

	@Override
	public Operation createOperation(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return new Mul(firstNumber,secondNumber);
	}

}
