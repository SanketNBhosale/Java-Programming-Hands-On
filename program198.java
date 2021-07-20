//String class inbult functions in java 
//Collectin frameworks in java -Hash table/hash map,stack
//For each loop in java
import java.util.*;
class IpPackUnPack
{
	public int Packing(int iNo1,int iNo2,int iNo3,int iNo4)
	{
		return (iNo1<<24|iNo2<<16|iNo3<<8|iNo4);
	}

	public void UnPacking(int iNo)
	{
		int iMask=0x000000ff;
		int iNo1=iNo;
		iNo1=iNo1>>24;
		iNo1=iNo1&iMask;
		int iNo2=iNo;
		iNo2=iNo2>>16;
		iNo2=iNo2&iMask;
		int iNo3=iNo;
		iNo3=iNo3>>8;
		iNo3=iNo3&iMask;
	    int iNo4=iNo;
		iNo4=iNo4&iMask;
		System.out.println("First Number "+iNo1);
		System.out.println("Second Number "+iNo2);
		System.out.println("Third Number "+iNo3);
		System.out.println("Fourth Number "+iNo4);
	}
}
public class program198
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int ivalue1=sobj.nextInt();
		System.out.println("Enter Second Number :");
		int ivalue2=sobj.nextInt();
		System.out.println("Enter Third Number :");
		int ivalue3=sobj.nextInt();
		System.out.println("Enter Fourth Number :");
		int ivalue4=sobj.nextInt();
		IpPackUnPack obj=new IpPackUnPack();
		iRet=obj.Packing(ivalue1,ivalue2,ivalue3,ivalue4);
		System.out.println(iRet);
		System.out.println("Enter Number for unpacking :");
		int ivalue5=sobj.nextInt();
		obj.UnPacking(ivalue5);
	}
}