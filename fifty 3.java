/*write a program in java package to set data and time*/
import java.io.*;
import java .util.*;
class life
{
	public static void main(String args[])
	{
		Date d=new Date();
		life.Set(life.HOUR,10);
		life.Set(life.MINUTE,29);
		life.Set(life.SECOND,22);
		System.out.println("the current date  & time are:"+d);
		System.out.println("update time:" );
		System.out.println(life.get(life.HOUR)+":");
		System.out.println(life.get(life.MINUTE)+":");
		System.out.println(life.get(life.SECOND)+":");
		

	}
}