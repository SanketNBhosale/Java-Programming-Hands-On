import java.util.*;
class Demo
{
	public void DisplayEvenWords(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].length() % 2)==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
class program222
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
