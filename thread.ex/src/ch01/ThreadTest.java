package ch01;

public class ThreadTest {
//	메인 스레드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		TT titi1 =new TT("티티");
		titi1.start();
		
	} // end of main

} // end of class

class TT extends Thread {
	private String name;

	public TT(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int i =0;
		while(i<10) {
			System.out.println(name+i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}