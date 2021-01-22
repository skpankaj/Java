/*Sunil(Nalanda,Bihar) & Co.......java
wap for single inheritance in java*/
class first
{
  double n;
  void get(double x)
  {
    n=x;
  }
}
class second extends first
{
  double square()
  {
    return n*n;
  }
  double cube()
  {
    return n*n*n;
  }
}
class single
{
  public static void main(String args[])
  {
    double n=4.0;
    second obj;
    obj=new second();
    obj.get(n);
    double sq,cb;
    sq=obj.square();
    cb=obj.cube();
    System.out.println("number = " +n);
    System.out.println("square = " +sq);
    System.out.println("cube = " +cb);
  }
}
