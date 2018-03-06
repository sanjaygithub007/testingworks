package websites;

public class StringClass3 {

	public static void main(String[] args) 
	{
	
		// when String is case sensitive we use equalsIgnoreCase method
		
		
		String actuals="james goshle is founder of java";
		String expected="James goshle is founder of java";
		boolean status=actuals.equalsIgnoreCase(expected);
		System.out.println("Status is "+status);
		
	}

}
