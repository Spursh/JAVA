
public class FibonaciRecur {
	
	public static void fibo(int times, int a, int b) {
		if (times == 0)
				return;
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c; 
		times = times - 1;
		fibo(times, a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0);
		System.out.println(1);
		fibo(3, 0, 1);
	}

}
