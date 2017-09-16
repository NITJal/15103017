package assignment;

import java.util.Scanner;

public class pallindromeString {
	public static void main(String as[])
	{
		Scanner scr=new Scanner(System.in);
		String a=scr.next();
		int l=a.length()-1;
		int f=0;
		while(l!=f){
		if((a.charAt(f)!=a.charAt(l)))
		{
			System.out.println("not a pallindrome");
		return;
		}
				l--;f++;
	}
		System.out.println("pallindrome");

}
}
