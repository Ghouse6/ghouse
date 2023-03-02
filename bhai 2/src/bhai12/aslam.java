package bhai12;
class harshi1
{
	int no=123;
String name="ghouse";
void moon()
{
	System.out.println("ghouse from house");
}
}
class bhavya extends harshi1
{
	int no =1234;
	String name="ghouse bhadsha";
	void sun() {
		System.out.println("no="+no);
		System.out.println("Name="+name);
	}
}

public class aslam extends bhavya
{
	int no =200;
	String name="ghouse bhai";
	void earth()
	{
		System.out.println("no="+no);
		System.out.println("Name="+name);
	}

	public static void main(String[] args) {
		aslam s=new aslam();
	s.moon();
	s.sun();
	s.earth();
	
	harshi1 b=new harshi1();
		b.moon();


	}

}
