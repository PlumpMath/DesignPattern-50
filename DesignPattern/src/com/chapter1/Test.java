package com.chapter1;

import com.chapter1.good.Operation;
import com.chapter1.good.OperatorFactory;
/*
 * 简单工厂模式
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper = OperatorFactory.createOperate("+",30,20);
		System.out.println(oper.getResult());
	}

}
