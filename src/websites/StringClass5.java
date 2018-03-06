package websites;

public class StringClass5 {

	public static void main(String[] args) 
	{
		
		String fullname="Rohit-Dhavan-Kohli-Kedar-M.S Dhoni-Pandya";
		String array[]=fullname.split("-");
		  System.out.println("Indian Batsman name");
		for(int i=0;i<array.length;i++)
		{
		  System.out.println(array[i]);
		}
		
	}

}
