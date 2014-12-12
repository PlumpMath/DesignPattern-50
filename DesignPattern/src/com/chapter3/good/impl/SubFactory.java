package com.chapter3.good.impl;

import com.chapter3.good.ICalculatorFactory;
import com.chapter3.good.Operation;
import com.chapter3.good.Sub;

public class SubFactory implements ICalculatorFactory {

	@Override
	public Operation createOperation(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return new Sub(firstNumber,secondNumber);
	}

}
