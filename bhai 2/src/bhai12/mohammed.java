package bhai12;
class student
{
	int no;
	void getstudent () {
		no=1;
	}
	void putdata() 
	{
		System.out.println("no="+no);
	}
}
class test extends student
{
	int m1,m2,m3;
	void accept()
	{
		m1=12;
		m2=23;
		m3=12;
	}
	void display() {
		System.out.println(m1+"  come "+m2+"  and "+m3);
	}
}
class result extends test
{
	int total;
	void putresult() {
		total=m1+m2+m3;
		System.out.println(total);
	}
}
public class mohammed {

	public static void main(String[] args) {
result r=new result();
r.getstudent();
r.putdata();
r.display();
r.accept();

r.putresult();


	}

}
