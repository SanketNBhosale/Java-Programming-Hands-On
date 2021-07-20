import java.util.*;
class Demo
{
	public void DisplayMax(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		String Max=arr[0];
		for(int i=0;i<arr.length;i++)   //For Each Loop
		{
			if(arr[i].length()>Max.length())
			{
				Max=arr[i];
			}
		}
		System.out.println("Longest word is : "+Max);
	}
}
class program225
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
