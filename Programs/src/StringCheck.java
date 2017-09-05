
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		/*if(s1.equals(s2))
			System.out.println("same");
		else
			System.out.println("not");*/
		if(s1 == s2) 
			System.out.println("same");
			else
				System.out.println("not");

		if(s3 == s2) 
			System.out.println("same1");
			else
				System.out.println("not1");
		
		if(s3.equals(s2)) 
			System.out.println("same2");
			else
				System.out.println("not2");

	}

}
