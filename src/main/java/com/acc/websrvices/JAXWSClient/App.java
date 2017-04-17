package com.acc.websrvices.JAXWSClient;

import com.acc.web.HelloWorld;
import com.acc.web.HelloWorldImplService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 HelloWorldImplService helloWorldService = new HelloWorldImplService();  
    	 HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();  
    	 System.out.println(helloWorld.helloWorld("Arpit"));

    }
}
