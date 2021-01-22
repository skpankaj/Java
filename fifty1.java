*Sunil & co.......java
 wap for function overloading  */
class shape
{
  final double pi=3.14159;
  String sp;
  double r;
  long s,l,b;
  shape(String sp,double r)
  {
    this.sp=sp;
    this.r=r;
  }
  shape(String sp,long s)
  {
    this.sp=sp;
    this.s=s;
  }
  shape(String sp,long l,long b)
  {
    this.sp=sp;
    this.l=l;
    this.b=b;
  }
  double area()
  {
    if(sp.equals("circle"))
      return pi*r*r;
    else if(sp.equals("square"))
      return s*s;
    else if(sp.equals("rectangle"))
      return l*b;
    else
      return 0;
  }
}
class polyex4
{
  public static void main(String args[])
  {
    shape s1,s2,s3;
    s1=new shape("circle",1.22);
    s2=new shape("square",4);
    s3=new shape("rectangle",11,21);
    System.out.println("area of circle = " + s1.area());
    System.out.println("area of square = " + s2.area());
    System.out.println("area of rectangle = " + s3.area());
  }
}
