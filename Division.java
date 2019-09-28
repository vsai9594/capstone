public class Division implements Operation{
 // Division selected
	@Override
	public String method(double a,double b){
		double result;
		try{
		  result = a/b;
		}
		catch(Exception e){
		  e.printStackTrace();
		  return "Error";
		}
	  return Double.toString(result);	
	}
}
