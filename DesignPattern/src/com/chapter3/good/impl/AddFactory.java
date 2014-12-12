package com.chapter3.good.impl;

import com.chapter3.good.Add;
import com.chapter3.good.ICalculatorFactory;
import com.chapter3.good.Operation;

public class AddFactory implements ICalculatorFactory {

	@Override
	public Operation createOperation(double firstNumber,double secondNumber) {
		// TODO Auto-generated method stub
		return new Add(firstNumber,secondNumber);
	}

}
