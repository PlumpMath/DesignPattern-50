package com.chapter4;

public abstract class BaseService {
	protected void init(){
		System.out.println("BaseService init....");
	}
	protected void validate(){
		System.out.println("BaseService validate....");
	}
	protected abstract void doService();
}
