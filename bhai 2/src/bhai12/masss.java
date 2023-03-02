package bhai12;

public class masss 
{
masss(){
	System.out.println("ghouse bhai");
}
masss(int i){
	System.out.println("i="+i);
}
masss(String ghouse ,int j){
	System.out.println(ghouse+"   coming you     "+j);
}
	public static void main(String[] args) {
	masss m1=new masss();
	masss m2=new masss(50);
	masss m13=new masss("ghouse bhai ji",500);
	}

}
