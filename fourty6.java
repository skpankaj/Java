/*Sunil(Nalanda,Bihar) & Co.......java
wap for single inheritance in java*/
class exam
{
  int tm;
 void get(int x)
  {
    tm=x;
  }
}
class weekly_exam extends exam
{
  void display()
  {
    System.out.println("total marks = " + tm);
  }
}
class single42
{
  public static void main(String args[])
  {
    int total_marks=2;
    weekly_exam obj;
    obj=new weekly_exam();
    obj.get(total_marks);
    obj.display();
  }
}
