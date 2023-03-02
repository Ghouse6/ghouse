package bhai12;
public class za 
{
	int a=10;
	int b=20;
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) 
	{
		za a=new za();
		a.add(100,200);
	}

}
