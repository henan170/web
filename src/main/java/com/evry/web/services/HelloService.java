package com.evry.web.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {

	@WebMethod
	public String hello(String name) {
		return "Hello " + name + "!";
	}

}
