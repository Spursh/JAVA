import java.util.TreeSet;

public class WalmartQuestionMergeUnsortedListIntoSorted {
	
	public static void unsortedToSorted(int[] l1, int[] l2) {
		TreeSet<Integer> tS = new TreeSet<Integer>();
		for(int i = 0; i < l1.length; i++) {
			if(!tS.contains(l1[i]))
				tS.add(l1[i]);
		}
		
		for(int i = 0; i < l2.length; i++) {
			if(!tS.contains(l2[i]))
				tS.add(l2[i]);
		}
		
		for(Integer i : tS) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] l1 = {5,3,6,2};
		int[] l2 = {2,4,1,8,9};
		unsortedToSorted(l1, l2);

	}

}
