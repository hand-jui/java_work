package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		RemoteController controller1 = television;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = toyRobot;
		RemoteController controller4 = toyCar;

		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyCar;

//		Q1. for 문을 활용하여 전원을 전부 켜라
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn(); // 컴파일 시점,(turnOn, turnOff)
		}
		System.out.println("------");

//		Q2. index 값이 세번째면 자신의 타입을 화면에 출력
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째 인덱스는 ToyCar 데이터 타입입니다.");
			}
		}

//		Q3. 데이터 toyrobot 이면 멤버 변수 name 값을 출력해
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
//				부모 타입으로 업 캐스팅 된 상태이기 때문에
//				자식 타입으로 바라보기 위해서는 다운 캐스팅 해야한다
				System.out.println(((ToyRobot) remoteControllers[i]).name);
			}
		}

//		Q4. 장난감 로봇에 소리 기능을 추가해 달라는 요청ㄴ
//		냉장고에도 소리나는 기능을 추가해 달라고 요청
//		소리기능-->인터페이스로 설계 구현			

	} // end of main
} // end of class
