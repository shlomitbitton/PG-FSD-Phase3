package com.app.soapService.impl;

import javax.jws.WebService;

import com.app.soapService.SoapService;

@WebService(endpointInterface = "com.app.soapService.SoapService")
public class SoapServiceImpl implements SoapService{

	@Override
	public int add(int x, int y) {
		int c=0;
		c=x+y;
		return c;
	}

	@Override
	public int subtract(int x, int y) {
		int c=0;
		c=x-y;
		return c;
	}

	@Override
	public int multiply(int x, int y) {
		int c=0;
		c=x*y;
		return c;
	}

	@Override
	public int divide(int x, int y) {
		int c=0;
		if(y!=0) {
			c=x/y;
		}
		return c;
	}

}
