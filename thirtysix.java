//wap in java to evaluate the given basic salary(bs) as input . if bs is >5000,
//da=55%of bs  and hra =15% of bs else  da =45% of bs and hra =10% of bs.
import java.io.*;
import java.util.*;
class thirtysix
{
	public static void main(String args[])
	{
		float bs,gs,hra,da;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your basic salary:");
		bs=sc.nextfloat();
		if(bs<=5000)
		{
			da=(bs*45)/100;
			hra=(bs*10)/100; 
		}
		else
		{
			da=(bs*55)/100;
			hra=(bs*15)/100;
		}
		gs=bs+da+hra;
		System.out.println("basic salary is "+bs);
		System.out.println("hra is "+hra);
		System.out.println("da is "+bs);
		System.out.println("gross salary is "+gs);
	}
}  