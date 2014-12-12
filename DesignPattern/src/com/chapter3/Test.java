package com.chapter3;

import com.chapter3.good.impl.AddFactory;
/*
 * 工厂模式
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AddFactory().createOperation(30,20).getResult());
	}

}
