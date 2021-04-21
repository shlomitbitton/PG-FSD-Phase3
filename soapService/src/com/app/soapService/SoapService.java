package com.app.soapService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface SoapService {
	
	@WebMethod
	int add(int x, int y);
	
	@WebMethod
	int subtract(int x, int y);
	
	@WebMethod
	int multiply(int x, int y);
	
	@WebMethod
	int divide(int x, int y);
	

}
