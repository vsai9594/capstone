import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[]){
		double a = 25;
        double b = 5;
	Operation operation=null; 
		 operation = new Addition();
		 System.out.println(" Addition between "+a+" and "+b+" resulted in "+operation.method(a,b));
		 operation = new Subtraction();
		 System.out.println(" Subtraction between "+a+" and "+b+" resulted in "+operation.method(a,b));
		 operation = new multiplication();
		 System.out.println(" multiplication between "+a+" and "+b+" resulted in "+operation.method(a,b));
		operation = new Division();
System.out.println(" Division between "+a+" and "+b+" resulted in "+operation.method(a,b));		
	

	
 }
}
