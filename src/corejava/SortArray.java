package corejava;
import java.util.ArrayList;
import java.util.Scanner;

public class SortArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int d=sc.nextInt();
		System.out.println("Enter Value to Array");
		for(int i=0;i<d;i++)
		{
			a.add(sc.nextInt());
		}
		
		// Sorting Program
		
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<d-1;j++)
			{
				if(a.get(j)>a.get(j+1))
				{
					int temp=a.get(j);
					a.set(j,a.get(j+1));
					a.set((j+1),temp);
				}
			}
		}
		//Display Array
		for(int i=0;i<d;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println("Minimum value is "+a.get(0));
		System.out.println("Maximum Value is"+a.get(d-1));
	}
}
