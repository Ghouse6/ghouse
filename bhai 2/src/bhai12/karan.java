package bhai12;

 class karan1 
{
int id=11;
String Name="java";
void display()
	{
	System.out.println("display()");
	}
void show()
	{
	System.out.println("show()");
	}
void  animal()
	{
	System.out.println("animal()");
	}
}
class house extends karan1
{
	void area() 
	{
		String city="madanapalli";
		String country="Indian";
		String street="sivaji nagar";
		System.out.println("area()"+id+" and "+Name+" and "+city+" and "+country+" and S"+street);
	}
}
public class karan
{
public static void main(String[] args) 
{
		house gh=new house();
		gh.animal();
		gh.show();
		gh.display();
		gh.area();
}
}
