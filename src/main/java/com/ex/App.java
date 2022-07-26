package com.ex;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	//Logger logger = LoggerFactory.getLogger(App.class);
	logger.info("Hello world log");
		// TODO Auto-generated method stub
	logger.info("Enter two numbers");
//		int a=10;
//		int b=0;
	   int a=s.nextInt();
	    int b=s.nextInt();
	    String str="";
	    logger.info("Enter operation:Add(+),subtract(-),Multiply(*),Divide(/)");
	    str=s.next();
	    if(str.equals("+"))
		{
	    	logger.info("Addition of {} and {} is :{}",a,b,add(a,b));
		}
	    else if(str.equals("-"))
		logger.info("subtraction of {} and {} is :{}",a,b,subtract(a,b));
	    else if(str.equals("/"))
		logger.info("Division of {} and {} is :{}",a,b,div(a,b));
	    else if(str.equals("*"))
		logger.info("Product of {} and {} is :{}",a,b,multiply(a,b));
//		System.out.println(add(a,b));
//		System.out.println(subtract(a,b));
//		System.out.println(div(a,b));
		

	}

    public static int add(int a,int b)
    {
    	
    	return a+b;
    }
    public static double add(double a,double b)
    {
    	
    	return a+b;
    }
    public static int subtract(int a,int b)
    {
    	
    	return a-b;
    }
    public static int multiply(int a,int b)
    {
    	return a*b;
    }
    public static int div(int a,int b)
    {
    	
    		if(b==0)
    		{
    			logger.warn("In division denominator should not be zero");
    			return 0;
    		}
    	return a/b;
    }
    
}
