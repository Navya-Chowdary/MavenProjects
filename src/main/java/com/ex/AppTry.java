package com.ex;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTry {
	static Logger logger = LoggerFactory.getLogger(App.class);
	static Calculator calculator=new Calculator();

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
	logger.info("Welcome to calculator");
	logger.info("Press Y to continue N to exit");
	String op="";
	op=s.next();
	while (op.equals("Y"))
	{
		//takes two numbers as input from users
		logger.info("Enter two numbers");
		int a=s.nextInt();
	    int b=s.nextInt();
	    String str="";
	    
	    //asks user to enter operator
	    logger.info("Enter operation:Add(+),subtract(-),Multiply(*),Divide(/)");
	    str=s.next();
	    
	    //performs the desired operation in calculator
	    if(str.equals("+"))
		{
	    	logger.info("Addition of {} and {} is :{}",a,b,calculator.add(a,b));
		}
	    else if(str.equals("-"))
	    {
	    	logger.info("subtraction of {} and {} is :{}",a,b,calculator.subtract(a,b));
	    }
	    else if(str.equals("/"))
	    {
	    	logger.info("Division of {} and {} is :{}",a,b,calculator.div(a,b));
	    }
	    else if(str.equals("*"))
	    {
	    	logger.info("Product of {} and {} is :{}",a,b,calculator.multiply(a,b));
	    }
	    
	    logger.info("Press Y to continue N to exit");
	    op=s.next();
	}
	  
	  //breaks the program
	while (op.equals("N"))
	{
		break;
	}


	
   }   
}

