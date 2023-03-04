public class ChainCaller {
	public static void main(String[] args) throws CloneNotSupportedException{
		ChainCaller t = new ChainCaller();
		t.method1(6, 3);
		t.method1(6, 0);
	}

	public void method1(double a, double b) throws CloneNotSupportedException {
		try {
			System.out.println(method2(a, b));
		} catch (ArithmeticException ae) {
			System.out.println("Divided by zero not allowed");
		}
	}

	public String method2(double a, double b) throws CloneNotSupportedException {
		if (b == 0)
			throw new CloneNotSupportedException();
		else
			return a + "/" + b + "=" + a / b;
	}
}
