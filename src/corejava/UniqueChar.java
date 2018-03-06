package corejava;
import java.util.Scanner;

public class UniqueChar 
{
	public static void main(String[] args) 
	{
		// Find unique Character in a string and print it
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String x="";
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			int c=0;
			for(int j=0;j<i;j++)
			{
				char b=s.charAt(j);
				if(b==a)
				{
					c=c+1;
				}
			}
			if(c==0)
			{
				x=x+a;
			}
		}
		System.out.print(x);
	}

}
