/*Sunil & co.......java
 wap for interface using inheritance*/
interface init_v
{
  final double pi=3.14159265359;
  public double area(double r);
}
class circle implements init_v
{
  public double area(double r)
  {
    return pi*r*r;
  }
}
class test1003
{
public static void main(String args[])
{
  double r=1.25;
  circle c=new circle();
  double ar=c.area(r);
  System.out.println("radius of circle = " + r);
  System.out.println("Area of circle = " + ar);
}
}
