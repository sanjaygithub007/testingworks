package corejava;
import java.util.Scanner;

public class OccrUniqChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String x=sc.nextLine();
		String y="";
		for(int i=0;i<x.length();i++)
		{
			char a=x.charAt(i);
			int c=0;
			for(int j=0;j<i;j++)
			{
				char b=x.charAt(j);
				if(a==b)
				{
					c=c+1;
				}
			}
			if(c==0)
			{
				y=y+a;
			}
		}
		System.out.println(y);
		
	}

}
