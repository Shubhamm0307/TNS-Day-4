package Day3;

public class Overloading {
	
	public void s1(int a,String b) {
		System.out.println("overloading method");
	}
	
	public void s1(String e,int g)  {
		System.out.println("method overloading");
	}
	
	public static void main(String [] args) {
		Overloading h=new Overloading();
		h.s1(12,"swa");
		h.s1("swa",12);
	}

}
