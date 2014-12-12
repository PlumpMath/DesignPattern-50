package com.chapter4;

public class ServiceBuilder {
	private BaseService service;
	public ServiceBuilder(BaseService service){
		this.service = service;
	}
	public void doService(){
		service.init();
		service.validate();
		service.doService();
	}
}
