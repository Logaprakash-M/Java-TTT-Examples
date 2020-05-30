package com.logumaven;
//import util.Scanner.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Calculator" );
        int num1,num2;
        int choice;
        System.out.println("1. Addition");
        System.out.println("2. Subtration");
        System.out.println("3. Multiplication");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        choice=Integer.parseInt(br.readLine());
        int result;
        switch(choice)
        {
        case 1:
        	num1=Integer.parseInt(br.readLine());
        	num2=Integer.parseInt(br.readLine());
        	result=num1+num2;
        	System.out.println("The Result is:"+result);
        	break;
        case 2:
        	num1=Integer.parseInt(br.readLine());
        	num2=Integer.parseInt(br.readLine());
        	result=num1-num2;
        	System.out.println("The Result is:"+result);
        	break;
        case 3:
        	num1=Integer.parseInt(br.readLine());
        	num2=Integer.parseInt(br.readLine());
        	result=num1*num2;
        	System.out.println("The Result is:"+result);
        	break;
        }
    }
}
