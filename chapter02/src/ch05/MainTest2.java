package ch05;

import java.util.Scanner;

public class MainTest2 {
//	메인함수
	public static void main(String[] args) {
//		객체 생성
		Student studentK = new Student("철이", 30_000);
		Bus bus160 = new Bus(160);
		Bus bus33 = new Bus(33);
		Bus bus1004 = new Bus(1004);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		Subway subwayLine3 = new Subway(3);
//		1단계 -사용해보기
//		studentK.takeSubway(subwayLine1);
//		studentK.showInfo();
//		2단계 - 스캐너를 활용하여 실행의 흐름 만들어 보기
		Scanner scanner = new Scanner(System.in);
		String what;
		int n;
		do {
			System.out.println("어떤 대중교통을 이용하겠음?");
			what = scanner.nextLine();
			if (what.equals("지하철")) {
				do {
					System.out.println("지하철 몇호선을 이용하시렵니까");
					n = scanner.nextInt();
					if (n == 1) {
						studentK.takeSubway(subwayLine1);
					} else if (n == 2) {
						studentK.takeSubway(subwayLine2);
					} else if (n == 3) {
						studentK.takeSubway(subwayLine3);
					} else {
						System.out.println("정확한 호선을 입력해주세요");
					}
				} while (n != 1 && n != 2 && n != 3);
				studentK.showInfo();
			} else if (what.equals("버스")) {
				do {
					System.out.println("몇번 버스를 이용하시렵니까");
					n = scanner.nextInt();
					if (n == 160) {
						studentK.takeBus(bus160);
					} else if (n == 33) {
						studentK.takeBus(bus33);
					} else if (n == 1004) {
						studentK.takeAreaBus(bus1004);
					} else {
						System.out.println("정확한 번호를 입력해주세요");
					}
				} while (n != 160 && n != 33 && n != 1004);
				studentK.showInfo();
			} else {
				System.out.println(studentK.name + "... 걸어 가고싶니..?");
			}
		} while (!what.equals("지하철") && !what.equals("버스"));
	} // end of main
} // end of class