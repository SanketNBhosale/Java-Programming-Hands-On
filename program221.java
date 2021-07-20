import java.util.*;
class Demo
{
	public int WordCount(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		return arr.length;
	}
}
class program221
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj=new Demo();
		int ret=dobj.WordCount(str);
		System.out.println("count of words  is : "+ret);

	}

}
