
public class MyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = add(10, 100);
		System.out.println(score1);
		hello("pop");

		int score2 = add(1, 2, 3);
	}

	public static void hello(String name) {
		System.out.println("Hello " + name);
		System.out.println("Do you love meth");
	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
}
