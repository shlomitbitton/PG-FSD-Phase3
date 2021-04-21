package com.app.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.app.soapService.SoapService;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
		String endpoint="http://localhost:7000/calculator?wsdl";
		
		try {
			URL url =new URL(endpoint);
			
			QName qname=new QName("http://impl.soapService.app.com/", "SoapServiceImplService");
			
			
			Service service=Service.create(url,qname);
			SoapService soapService=service.getPort(SoapService.class);
			System.out.println("Accessing the services in client side");
			System.out.println(soapService.subtract(2, 3));
			System.out.println(soapService.add(3, 7));
			System.out.println(soapService.multiply(5, 40));
			System.out.println(soapService.divide(98, 12));
		}catch (MalformedURLException e) {
			System.out.println(e);
		}
	}

}
