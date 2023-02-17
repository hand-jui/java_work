package ch01;

import javax.swing.JFrame;

public class RunnableTest1 {

	public static void main(String[] args) {
//		사용하는 방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
//		subWorker.start();  <-- 현재 start 메서드가 없음
//		SubWorker 기능을 구현 했지 Thread를 상속 받은 것은 아님
//		그래서 thread 기능인 start 메소드가 없는 상태

//		!!!
//		생각하는 방법--start() 메서드는 thread가 가지고 있음
//		스레드를 생성할 때 생성자에 Runnable 타입을 넣을 수 있다고 확인 - 문서, 코드 힌트
		Thread thread1 = new Thread(subWorker);
		Thread thread2 = new Thread(subWorker);

//		시작 시점은 이벤트를 받던지 연산 후에 하던지 작성하는 사람이 정할 수 있음
		thread1.start();
		thread2.start();

	} // end of main

} // end of class

//설계하는 방법
class SubWorker extends JFrame implements Runnable {

//	나중에 쓰레드가 동작 해야 하는 부분을 run 안에서 작성함
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("i" + i + "\n");
		}
	}

}