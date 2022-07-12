class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=10000; i++) {
			System.out.println("Thread1");
//		try {
//			sleep(1000);
//		}catch(InterruptedException e){
//			return;
		}
		}
	}	


class Thread2 extends Thread{
	public void run() {
		for(int i=1; i<=10000; i++) {
		System.out.println("Thread2");
//		try {
//			sleep(1000);
//		}catch(InterruptedException e){
//			return;
//		}
		}
	}
	
}


public class ThreadTest {

	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		th1.start();
		Thread th2 = new Thread2();
		th2.start();
	}

}
