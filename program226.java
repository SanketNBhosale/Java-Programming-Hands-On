import java.util.*;
class Demo
{
	public void DisplayMax(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		String Max=arr[0];
		for(String s:arr)   //For Each Loop
		{
			if((s.length()>Max.length()))
			{
				Max=s;
			}
		}
		System.out.println("Longest word is : "+Max);
	}
}
class program226
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj=new Demo();
		dobj.DisplayMax(str);
	}

}
