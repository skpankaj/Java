*Sunil & co.......java
 wap for function overloading  */
class polyex1
{
  void display(String s)
  {
    System.out.println(s);
  }
  void display(int n)
  {
    System.out.println(n);
  }
  void display(int n,int m)
  {
    int s=n+m;
    System.out.println(s);
  }
  public  static void main(String args[])
  {
    polyex1 o=new polyex1();
    o.display("vijay kesari");
    o.display(99);
    o.display(10,20);
  }
}

