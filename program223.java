import java.util.*;
class Demo
{
	public void DisplayEvenWords(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		for(String s:arr)   //For Each Loop
		{
			if((s.length() % 2)==0)
			{
				System.out.println(s);
			}
		}
	}
}
class program223
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj=new Demo();
		dobj.DisplayEvenWords(str);
	}

}
