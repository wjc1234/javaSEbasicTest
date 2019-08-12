package javawork;

public class A {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		new B();
	}
	}
class Bextends A{
	static {
		System.out.println("4");
	}
		static void B() {
			System.out.println("5");
		}
		{
			System.out.println("6");
		}
		public static void main(String[] args) {
			new A;
		}
	}