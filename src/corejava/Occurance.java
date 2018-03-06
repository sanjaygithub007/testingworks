package corejava;

import java.util.Scanner;

public class Occurance {
	public static void main(String[] args)
	{
		//Find a Occurancess of word in a sentence
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String x=sc.nextLine();
		System.out.println("Word");
		String y=sc.nextLine();
		x=x.toLowerCase();
		y=y.toLowerCase();
		int count=0;
		String s[]=x.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(y))
			{
				count=count+1;
			}
		}
		System.out.println("Occurance of " +y+ " is = "+count);
	}
}
