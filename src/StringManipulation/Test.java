package test;

public class Test {
	static{
		
	}
	public static int a=20;
	public int b=5;
	public Test(){
		//System.out.println(b);	
	}
	public Test(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	
	public static void printA(){
		System.out.println(a);
	}
	
	public static void main(String args[]){
		Test obj = new Test();
		obj.a = 10;
		obj.b = 100;
		System.out.println(obj.a );
		System.out.println(obj.b );
		
		Test obj1 = new Test();
		System.out.println(obj1.a );
		System.out.println(obj1.b );
		
		Test.printA();
	}

}
