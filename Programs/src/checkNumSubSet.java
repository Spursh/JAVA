import java.util.Stack;

public class checkNumSubSet {
	private static Stack<Integer> s = new Stack<Integer>();
	private static int stackSum;
	
	public static void set(int[] a, int startIndex, int endIndex, int target) {
		
		if(stackSum == target)
			print();
		
		for(int curIndex = startIndex; curIndex < endIndex; curIndex++) {
			if(stackSum + a[curIndex] <= target) {
				stackSum = stackSum + a[curIndex];
				s.push(a[curIndex]);
				set(a, curIndex + 1, endIndex, target);
				stackSum -= s.pop();
			}
				
		}
	}
	
	public static void print() {
		StringBuilder sb = new StringBuilder();
		for(Integer i : s) {
			sb.append(i);
			sb.append(",");
		}
		System.out.println(sb);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 4, 7, 9, 3, 2};
		int target = 7;
		set(a,0, a.length, target);

	}

}
