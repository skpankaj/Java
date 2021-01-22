*Sunil & co.......java
 wap for function overloading  */
class polyex2
{
  int max(int x,int y)
  {
    if(x>y)
      return x;
    else
      return y;
  }
  int max(int x,int y,int z)
  {
    int mx;
    if(x>y)
      mx=x;
    else
      mx=y;
    if(z>mx) mx=z;
    return mx;
  }
  int max(int x,int y,int z,int a,int b)
  {
    int mx;
    if(x>y)
      mx=x;
    else
      mx=y;
    if(z>mx) mx=z;
    if(a>mx) mx=a;
    if(b>mx) mx=b;
    return mx;
  }
  public static void main(String args[])
  {
    polyex2 o;
    o=new polyex2();
    System.out.println("max = " + o.max(10,20));
    System.out.println("max = " + o.max(10,20,30));
    System.out.println("max = " + o.max(10,20,30,40,50));
  }
}
