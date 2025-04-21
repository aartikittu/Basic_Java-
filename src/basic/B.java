package basic;

public class B extends A {
	int j=20;
	public static void main(String[] args) 
	{

		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.i);
		System.out.println(b.j);
		A a= new A();
		System.out.println(a.i);
		// System.out.println(a.j); cannot access child member
	}

}
