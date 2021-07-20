import java.util.*;

class BubbleSort<T extends Comparable<T>>
{
	public void Sort(T Arr[])
	{
		int i = 0, j = 0; 
		T temp;
		
		for(i = 0; i < Arr.length; i++)
		{
			for(j = 0; (j < Arr.length-i-1); j++)
			{
				if(Arr[j].compareTo(Arr[j+1])>0)
				{
					temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}
			}
		}
	}
}
class Program240
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		String Arr[] = new String[no];

		System.out.println("Enter the elemenets");
		for(int i = 0; i < no; i++)
		{
			Arr[i] = sobj.nextLine();
		}

		System.out.println("Entered elements are");
		for(int i = 0; i < no; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();

		BubbleSort<String> obj = new BubbleSort<String>();

		obj.Sort(Arr);
		System.out.println("Elements after sorting are");
		for(int i = 0; i < no; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}
}
