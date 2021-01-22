/*Sunil(Nalanda,Bihar) & Co.......java
wap for single inheritance in java*/
class exam
{
  int tm;
  exam(int x)
  {
    tm=x;
  }
}
class weekly_exam extends exam
{
  weekly_exam(int d)
  {
    super(d);
  }
  void display()
  {
    System.out.println("total marks = " + tm);
  }
}
class exer2
{
  public static void main(String args[])
  {
    int total_marks=75;
    weekly_exam obj;
    obj=new weekly_exam(total_marks);
    obj.display();
  }
}
