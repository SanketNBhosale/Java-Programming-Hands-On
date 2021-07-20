import java.util.*;
import Marvellous.Matrix;
class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	int Maximum()
	{
		int iMax=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]>iMax)
				{
					iMax=Arr[i][j];
				}
			}
		}
		return iMax;
	}
	int Minimum()
	{
		int iMin=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]<iMin)
				{
					iMin=Arr[i][j];
				}
			}
		}
		return iMin;
	}
}
class program209
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
		int iRet=dobj.Minimum();
		System.out.println("Minimum is: "+iRet);
		iRet=dobj.Maximum();
		System.out.println("Maximum is: "+iRet);
		System.gc();

	}
}