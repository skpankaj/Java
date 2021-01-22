class shape
{
  final double pi=3.14159;
  String sp;
  double r,s,l,b;
  shape(String sp,double x)
  {
    this.sp=sp;
    if(sp.equals("circle"))
      this.r=x;
    else if(sp.equals("square"))
      this.s=x;
  }
  shape(String sp,double l,double b)
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
class polyex4a
{
  public static void main(String args[])
  {
    shape s1,s2,s3;
    s1=new shape("circle",1.22);
    s2=new shape("square",4.99);
    s3=new shape("rectangle",11.22,21.11);
    System.out.println("area of circle = " + s1.area());
    System.out.println("area of square = " + s2.area());
    System.out.println("area of rectangle = " + s3.area());
  }
}
