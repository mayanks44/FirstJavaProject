
class Employee_1
{
private String n="Mayank";
private int a=28;
int id;

public int get_age()
{
	return a;
}
	
public String get_name()
{
	return n;
}
public void set_age(int b)
{
	this.a=b;
}
public void set_name(String c)
{
	this.n=c;
}
}

public class Employee
{
	public static void main(String[] args)
	{
		Employee_1 e = new Employee_1();
		e.set_age(24);
		e.set_name("Maya");
		e.id=123;
		System.out.println("employee id is:" + e.id);
		System.out.println("name is:" + e.get_name());
		System.out.println("Age of employee is:" + e.get_age());
	}
}


