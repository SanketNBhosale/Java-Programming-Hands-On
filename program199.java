import java.util.*;

class FirstWindow
{
	public Frame fobj;
	public FirstWindow()
	{
		Frame fobj=new Frame("IpPackUnPack");
		Button bobj1=new Button("PACK");
		Button bobj2=new Button("UNPACK");
		Label lobj1=new Label("IP Packing Unpacking");
		Label lobj2=new Label("First Number");
		Label lobj3=new Label("Second Number"); 
		Label lobj4=new Label("Third Number");
		Label lobj5=new Label("Forth Number");
		TextField iNo1=new TextField();
		TextField iNo2=new TextField();
		TextField iNo3=new TextField();
		TextField iNo4=new TextField();
		bobj1.setBounds(30,70,100,30);  //x,y,width,height
		bobj2.setBounds(120,70,100,30);
		lobj1.setBounds(60,20,200,70);
		lobj2.setBounds(30,120,100,30);
		lobj3.setBounds(30,180,100,30);
		lobj4.setBounds(30,220,100,30);
		lobj5.setBounds(120,220,100,30);
		iNo1.setBounds(140,120,100,30);
		iNo2.setBounds(140,180,100,30);
		iNo3.setBounds(140,240,100,30);
		iNo4.setBounds(140,300,100,30);
		fobj.add(bobj1);
		fobj.add(bobj2);
		fobj.add(lobj1);
		fobj.add(lobj2);
		fobj.add(lobj3);
		fobj.add(lobj4);
		fobj.add(lobj5);
		fobj.add(iNo1);
		fobj.add(iNo2);
		fobj.add(iNo3);
		fobj.add(iNo4);
		fobj.setSize(350,350);
		fobj.setLayout(null);
		fobj.setVisible(true);
		fobj.addWindowListener(new ActionListener());
	}
}
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
public class program199
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
		FirstWindow obj2=new FirstWindow();
		obj2.FirstWindow();
	}
}