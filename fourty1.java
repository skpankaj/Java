/*
  Object Oriented Programming lab dated-03-07-2009
  Authors:Sunil kumar(Nalanda,Bihar) & Co. 
 ****************************************************************
  Using constructor of a student of ACEIT
 */

class student
    {
 
	private String name;
	private String rollno;
	private int year;
	private float percentage;
	
	public student()
	{
	 
		name = rollno = null;
		year = 0;
		percentage = 0.0f;
	}
	
	public student(student s)
	{
	 
		name = s.name;
		rollno = s.rollno;
		year = s.year;
		percentage = s.percentage;
	}
	
	public student(String nam, String roll, int yr)
	{
		 
		name = nam;
		rollno = roll;
		year = yr;
		percentage = 0.0f;
	}
	
	public student(String nam, String roll, int yr, float prt)
	{
	 
		name = nam;
		rollno = roll;
		year = yr;
		percentage = prt;
	}
	
	public String toString()
	{
		return "Student[ name: " + name + "; Roll. no: " + rollno + "; Year: " + year + "; Percentage: " + percentage + "]";
	}
}
class fourty1
{
	public static void main(String [] args)
	{
		student s1 = new student();
		student s2 = new student("sunil", "08EARCS203", 2008);
		student s3 = new student("pankaj", "08EARCS210", 2009,75.6f);
		student s4 = new student(s3);
                System.out.println("\n\t\t****program for oops lab examination***\n");
		System.out.println(s1);
		System.out.println("\n");
		System.out.println(s2);
		System.out.println("\n");
		System.out.println(s3);
		System.out.println("\n");
		System.out.println(s4);
		System.out.println("\nprogram designed by SUNIL KUMAR ROLLNO-8EARCS203");
	}
}
