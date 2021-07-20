import java.util.*;

class BubbleSort
{
	public void Sort()
	{
		int i = 0, j = 0, temp = 0;
		boolean Swap=false;
		for(i = 0; i < Arr.length; i++)
		{
			Swap=false;
			for(j = 0; j < Arr.length-i-1; j++)
			{
				if(Arr[j] > Arr[j+1])
				{
					temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
					Swap=true;
				}
			}
			if(Swap==false)
			{
				break;
			}
			System.out.println("Data After Pass :"+i);
			for(int k=0;k<Arr.length;k++)
			{
				System.out.print(Arr[k]+"\t");
			}
			System.out.println();
		}
	}

}

class program237
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		BubbleSort obj = new BubbleSort(no);
		obj.Accept();
		obj.Display();

		obj.Sort();
		obj.Display();

	}
}
