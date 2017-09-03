
public class RecursiveStringReverse {
	
	public static void recursionstringRev(String s, int i) {
		if (i >= s.length()-1)
			return;
		recursionstringRev(s,++i);
		System.out.print(s.charAt(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccd";
		int i = -1;
		recursionstringRev(s, i);
	}

}
