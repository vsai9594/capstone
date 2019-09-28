import java.io.*;
import java.util.*;
class Subtraction implements Operation
{
	public String method(double a,double b){
		//System.out.println("Subtraction selected");
		String x = Double.toString(a-b);
		return x;
	} 
}
