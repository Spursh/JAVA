import java.util.Queue;

public class WalmartQuesPrinting {
	
	public static void printing(int[] a) {
		for(int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++)
				System.out.println(a[i]+"-"+a[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3};
		printing(a);

	}

}
