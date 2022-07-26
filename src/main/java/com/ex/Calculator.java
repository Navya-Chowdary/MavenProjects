package com.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	static Logger logger = LoggerFactory.getLogger(Calculator.class);

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
    			return 0;    //returns 0 if denominator is 0
    	}
    	return a/b;
    }

}
