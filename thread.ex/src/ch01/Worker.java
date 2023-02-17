package ch01;

//thread 만들어 보기 (생성)
//-- 상속 활용해서 스레드 만들어 보기(작업자 만들어 보기)
//Thread를 상속한 클래스. 즉, Worker는 Thread이기도 하다 -다형성
class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

//		약속된 부분!
//		-> start 메서드를 통해서 thread한테 일을 시작하라 명령을 줄 수 있음
//		그러면 thread는 run 메서드 안에 있는 부분을 수행 시킨다  <-
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker " + name + " : " + i + "\t" + Thread.currentThread());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of run

}
