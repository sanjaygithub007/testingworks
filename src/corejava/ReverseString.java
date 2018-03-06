package corejava;
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		//Reverse a String using charAt()
		
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String s=sc.nextLine();
		String y="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			y=y+c;
		}
		System.out.println(y);
		if(s.equals(y))
		{
			System.out.println(s+ " is a Palindrom");
		}
		else
		{
			System.out.println(s+ " is a not Palindrom");	
		}
	}

}

