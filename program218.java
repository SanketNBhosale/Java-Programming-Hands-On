import java.util.*;
class program218
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sobj.nextLine();
		System.out.println("Length of string is :"+str.length());
		String temp=str.trim();
		String arr[]=temp.split("\\s");
		System.out.println("Count of Word is"+arr.length);
	}
}