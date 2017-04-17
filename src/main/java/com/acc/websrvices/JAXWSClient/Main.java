package com.acc.websrvices.JAXWSClient;

public class Main {
	public static void main( String[] args )
    {
    	 HelloWorldImplService helloWorldService = new HelloWorldImplService();  
    	 HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();  
    	 System.out.println(helloWorld.helloWorld("Arpit"));

    }
}
