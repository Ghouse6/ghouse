package bhai12;
class mm5
{
void g1() {
	System.out.println("ghouse come from home");
}
void g2()
{
	System.out.println("ghouse come from office");
}

 class mass extends mm5 {
	void g3()
	{
		System.out.println("madanapalli");
	}
	
	public void main(String[] args) 
	{
		mass h=new mass();
		h.g1();
		h.g2();
		h.g3();
		mm5 w=new mm5();
		w.g1();
		w.g2();
	
	}

}
}
