package websites;

public class StringClass1 {

	
	public static void main(String[] args) 
	{
		String name="Facebook is automated via Selenium webdriver";
		boolean status=name.startsWith("Facebook");
		System.out.println("Status is "+status);
		boolean status1=name.endsWith("webdriver");
		System.out.println("Status is "+status1);
		
	}

}
