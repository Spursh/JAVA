
public class checking {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        int delIndex = 0;
        StringBuilder sb = new StringBuilder(magazine);
        if(magazine.length() >= ransomNote.length()){
            for (int i = 0; i < ransomNote.length(); i++){
                if(magazine.toString().indexOf(ransomNote.charAt(i)) >= 0){
                    delIndex = magazine.indexOf(ransomNote.charAt(i));
                        sb.deleteCharAt(delIndex);
                        magazine = sb.toString();
                }
                else
                    return false;
            }
            return true;
        }
        else
            return false;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="cjebejfafg";
		String s2 = "bdjfdjcdfijidfefcegbfihbajjgi";
		boolean op = canConstruct(s1, s2);
		System.out.println(op);
	}

}

