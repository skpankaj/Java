// wap in java using class and object(reading and writing students details)//
import java.io.*;
import java.util.*;
class student
{
	private String sname;
	private int sage;
	private String sclass;
	void getdata(String sn,int sa, String sc)
	{
		sname=sn;
		sage=sa;
		sclass=sc;
		
	}
	void showdata()
	{
		System.out.println("name=\t"+sname);
		System.out.println("Age=\t"+ sage);
		System.out.println("class=\t"+sclass);
		
	}
};
class thirtyfive
{
	public static void main(String args[])
	{
		{
			student s1,s2;
			String n,c;
			int a;
			Scanner sc=new Scanner(System.in);
			s1.new student();
			s2.new student();
			System.out.println("enter data for student1:");
			n=sc.next();
			a=sc.nextInt();
			c=sc.next();
			s1.getdata(n,a,c);
			System.out.println("enter data for student2:");
			n=sc.next();
			a=sc.nextInt();
			c=sc.next();
			s2.getdata(n,a,c);
			System.out.println("\n\tstudent1\n");
			s1.showdata();
			System.out.println("\n\tstudent2\n");
			s2.showdata();
				
		}
	}
}
