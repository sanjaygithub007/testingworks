package corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 
{
	public static void main(String[] args) 
	{
		Pattern p=new Pattern.compile("[0-9]");
		Matcher m=p.matcher("26 in 2026");
		int c=0;
		while(m.find())
		{
			System.out.println(m.group());
			c=c+1;
		}

	}

}
