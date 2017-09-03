import java.util.Stack;

public class checking {
	
	 public static boolean isValid(String s) {
	        int i = 0;
	        char a;
	        Stack<Character> p = new Stack<Character>();
	        while((i < s.length()) && (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')){
	            p.push(s.charAt(i));
	            i++;
	        }
	        int an  = p.size();
	        if(p.size() == s.length())
	            return false;
	        else{
	            while(!p.isEmpty() && i < s.length()){
	              a = p.pop();
	              if((a == '[' && s.charAt(i) == ']') || (a == '{' && s.charAt(i) == '}') || (a == '(' && s.charAt(i) == ')')){
	                  i++;
	                  continue;
	              }
	                else
	                    return false;
	        }
	      }
	        return true;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="()";
		boolean op = isValid(s1);
		System.out.println(op);
	}

}

