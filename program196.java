import java.util.*;
class StringX
{
	public boolean Anagram(String str1,String str2)
	{
		int iCnt=0,iResult=0;
		char arr[]=str1.toCharArray();
		char brr[]=str2.toCharArray();
		int count[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		if(arr.length!=brr.length)
		{
			return false;
		}
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-'a']++;  //count[98-97]++   count[1]++
			count[brr[i]-'a']--;	
		}
		int i=0;
		for(i=1;i<26;i++)
		{
			if(count[i]!=0)
			{
				break;
			}
		}
		if(i==26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
public class program196
{
	public static void main(String arg[])
	{
		boolean bRet;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First String :");
		String str1=sobj.nextLine();
		System.out.println("Enter Second String :");
		String str2=sobj.nextLine();
		StringX obj=new StringX();
		bRet=obj.Anagram(str1,str2);
		if(bRet==true)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}

	}
}