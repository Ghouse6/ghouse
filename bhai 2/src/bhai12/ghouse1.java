package bhai12;
class harshi
{
	int i,j;
	void ghousee()
	{
		System.out.println(i+"ghouse bhai"+j);
	}
}
class mohan extends harshi
{
	int k;
	void jevan() {
		System.out.println("k+i:"+(i+k));
	}
	void sum() {
		System.out.println("i+j+k:"+(i+j+k));
	}
}
public class ghouse1 
{

	public static void main(String[] args) 
	{
		harshi h=new harshi();
		mohan m=new mohan();
		h.i=20;
		h.j=30;
		h.ghousee();
		System.out.println();
		m.i=90;
		m.j=80;
		m.k=70;
		System.out.println("numbers");
		m.ghousee();
		m.jevan();
		System.out.println();
		System.out.println("sum:");
		m.sum();
		
		
		

	}

}
