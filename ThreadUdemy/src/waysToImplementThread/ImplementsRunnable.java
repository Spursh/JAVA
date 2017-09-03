package waysToImplementThread;

//class Run implements Runnable{
//	public void run() {
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//	}
//}
//
//public class ImplementsRunnable {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Thread t = new Thread(new Run()); /* implement Runnable and pass it to the constructor of the Thread */
//		t.start();
//
//	}
//
//}
// another way to start thread using implements Runnable
public class ImplementsRunnable {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
		 public void run() {
			 for (int i = 0; i < 10; i++) {
				 System.out.println(i);
			 }
		 }});
		t.start();
	}
	
}
