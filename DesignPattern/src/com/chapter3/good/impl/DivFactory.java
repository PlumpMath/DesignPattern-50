package com.chapter3.good.impl;

import com.chapter3.good.Div;
import com.chapter3.good.ICalculatorFactory;
import com.chapter3.good.Operation;

public class DivFactory implements ICalculatorFactory {

	@Override
	public Operation createOperation(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return new Div(firstNumber,secondNumber);
	}

}
