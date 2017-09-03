package waysToImplementThread;

class Runner extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class extendingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r  = new Runner();
		System.out.println("here");
		r.start();
		/*if used r.run(); it will still run the code but in the main thread. 
		However, with r.start(); it will tell the thread class to look for the run() method in its own special thread*/ 
		

	}

}
