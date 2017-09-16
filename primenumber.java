package assignment;

import java.util.Scanner;

public class primenumber {
	public static void main(String as[])
	{
		Scanner scr=new Scanner(System.in);
		int i,n;
		int flag=0;
		n=scr.nextInt();
		for(i=2;i<=n;i++)
		{
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if((i%j)==0)
					flag=1;
			}
			if(flag==0)
			System.out.println(i);
			else
				flag=0;
		}
	}
}
