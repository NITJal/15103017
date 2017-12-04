import java.util.ArrayList;
import java.util.Scanner;
public class texteditor {
	//static ArrayList <String> dict=new ArrayList<String>();
	static ArrayList<String> output=new ArrayList<String>();
	static String[] Dict;
	static String[] Final;
	
	static void matching(String a,int index)
	{for(int k=0;k<Dict.length;k++)
	{
		if(a.length()==(Dict[k].length()))
		{int i=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)==Dict[k].charAt(j))
						i++;
			}
		if(i>=a.length()/2)
		{
			Final[index]=Dict[k];
		}
		}
		else
			Final[index]=a;	
		}
	}
	
	
	
	public static void main(String as[])
	{
		/*Scanner scr=new Scanner(System.in);
		System.out.println("Enter predefined dictionary elements");
		while(scr.hasNext())
			{dict.add(scr.next());
			}
		System.out.println("Enter input sentence");
		while(scr.hasNext())
		{
			input.add(scr.next());
		}*/
		Scanner scr=new Scanner(System.in);
		String dict,input;
		String in[];
		System.out.println("Enter predefined dictionary elements");
		dict=scr.nextLine();
		Dict=dict.split(" ");
		System.out.println("Enter input");
		input=scr.nextLine();
		in=input.split(" ");
		int i;
		for( i=0;i<in.length;i++);
		{
		System.out.println(in[i]);
		}Final=new String[in.length];
		//int i;
		//for( i=0;i<in.length;i++);
		//{
			
			//matching(in[i],i);
			
		//}
		for(int j=0;j<Final.length;j++)
		System.out.print(Final[j]+" ");
		
	
		
	}

}
