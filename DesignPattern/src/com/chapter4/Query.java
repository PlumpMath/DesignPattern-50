package com.chapter4;

public class Query extends BaseService {
	protected void init(){
		System.out.println("Query init...");
	}
	protected void validate(){
		System.out.println("Query validate...");
	}
	@Override
	protected void doService() {
		// TODO Auto-generated method stub
		System.out.println("Query doService...");
	}

}
