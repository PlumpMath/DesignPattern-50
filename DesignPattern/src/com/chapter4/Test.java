package com.chapter4;
/*
 * 建造者模式
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Query query = new Query();
		ServiceBuilder service = new ServiceBuilder(query); 
		service.doService();
	}

}
