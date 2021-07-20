import java.util.*;
class program214
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sobj.nextLine();
		System.out.println("Length of string is :"+str.length());
		String temp=str.trim();
		System.out.println("updated string is :"+temp);
		System.out.println("Length of trimmed string is :"+temp.length());
	}

}