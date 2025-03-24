package Project_1;

public class Sample {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public double divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		SimpleCalculator cal = new SimpleCalculator();
		int a = 20;
		int b = 5;
		int add = cal.add(a,b);
		int sub = cal.subtract(a,b);
		int mul = cal.multiply(a,b);
		double div = cal.divide(a,b);
		System.out.println(a + "+" + b + "=" + add);
		System.out.println(a + "-" + b + "=" + sub);
		System.out.println(a + "*" + b + "=" + mul);
		System.out.println(a + "/" + b + "=" + div);
	}
}