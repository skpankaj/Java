/*Sunil & co.......java
 wap for function overloading & using ternary operator function*/
class polyex3
{
  int max(int x,int y)
  { 
  return x>y?x:y;
  }
  float max(float x,float y)
  {
  	 return x>y?x:y;
  }
  double max(double x,double y)
  { 
  return x>y?x:y;
  }
  long max(long x,long y)
  {
  	 return x>y?x:y;
  }

  public static void main(String args[])
  {
    int a=10,b=15;
    float c=14.6F,d=19.4F;
    double e=25,f=16;
    long g=166,h=566;
    polyex3 o=new polyex3();
    System.out.println("max = " + o.max(a,b));
    System.out.println("max = " + o.max(c,d));
    System.out.println("max = " + o.max(e,f));
    System.out.println("max = " + o.max(g,h));
  }
}
