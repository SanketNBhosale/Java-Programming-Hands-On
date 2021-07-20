import java.util.*;
import Marvellous.Matrix;
class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}

	public int SumBorder()
	{
		int iSum=0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if((i==0)||(j==0)||(i==Arr.length-1)||(j==Arr.length-1))
				{
					iSum=iSum+Arr[i][j];
				}	
			}	
		}
		return iSum;
	}
}
class program212
{
	public static void main(String str[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int row=sobj.nextInt();
		System.out.println("Enter Number of Columns: ");
		int col=sobj.nextInt();
		Demo dobj=new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		int iRet=dobj.SumBorder();
		System.out.println("Sum of Border Elements is :"+iRet);
		System.gc();

	}
}  