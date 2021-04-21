package com.app.publisher;

import javax.xml.ws.Endpoint;

import com.app.soapService.impl.SoapServiceImpl;

public class PublisherMain {
	
	public static void main(String[] args) {
		String url="http://localhost:7000/calculator";
		Endpoint.publish(url, new SoapServiceImpl());
		
		System.out.println("Hello your service is published successfully on the below url.... You can access it from any of your favorite browser or access it from creating a client");
		System.out.println(url+"?wsdl");
	}

}
