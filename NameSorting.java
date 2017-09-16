package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSorting {
public static void main(String as[])
{
	Scanner scr=new Scanner(System.in);
	System.out.println("enter no of elements");
	int n=scr.nextInt();
	
	String names[]=new String[n],temp;
	System.out.println("Enter names");
	for(int i=0;i<n;i++)
	{
		names[i]=scr.nextLine();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(names[i].compareTo(names[j])>0)
			{
				temp=names[i];
				names[i]=names[j];
				names[j]=temp;
			}
		}
	}
	System.out.println("names in sorted order");
	for(int i=0;i<n;i++)
	{
		System.out.println(names[i]);
	}
	
	
}
}
