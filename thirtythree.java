//wap to reading string data by using catch exception//
import java.io.*;
class thirtythree
{
public static void main(String args[])
{
String sname ;
try
{
DataInputStream dis=new DataInputStream (System.in);
System.out.println("enter your name=");
sname =dis.readLine();
//int b=Integer.parseInt(sname );//change string to integer gives error
System.out.println("Hello ,"+sname );
}
catch(Exception eobj)
{
System.out.println("Error");
}
}
}
