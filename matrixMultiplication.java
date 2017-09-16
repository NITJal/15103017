package assignment;

import java.util.Scanner;

public class matrixMultiplication 
{
	public static void main(String as[])
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the order of two matrix as a*b b*c");
		int a,b,c;
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		int arr1[][]=new int[a][b];
		int arr2[][]=new int[b][c];
		int arr3[][]=new int[a][c];
		System.out.println("enter values of first matrix");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
			arr1[i][j]=scr.nextInt();	
			}
		}
		System.out.println("enter values of second matrix");
		for(int i=0;i<b;i++)
		{	for(int j=0;j<c;j++)
				{
				arr2[i][j]=scr.nextInt();	
				}
		}
		
		for(int i=0;i<a;i++)
		{for(int j=0;j<c;j++)
		{ for(int k=0;k<b;k++)
		{
			arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[k][j]);
			//System.out.print(arr3[i][j]+"\t");	
		}
		}
		}
		for(int i=0;i<b;i++)
		{	for(int j=0;j<c;j++)
				{
			System.out.print(arr3[i][j]+"\t");	
				}
		System.out.println(" ");
		}
		
		
	}
}
