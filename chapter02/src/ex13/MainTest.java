package ex13;

import java.util.Random;

public class MainTest {
//	우리반 학생 이름을 배열에 담아주세요
//	랜덤 클래스를 사용해서 한명을 추출

	static int randomNumber() {
		Random random = new Random();
		int rNum = random.nextInt(18);
		return rNum;
	}

	public static void main(String[] args) {

		String[] student = new String[18];
		student[0] = "편용림";
		student[1] = "김효린";
		student[2] = "배진석";
		student[3] = "강민정";
		student[4] = "한범진";
		student[5] = "손주이";
		student[6] = "김유주";
		student[7] = "김미정";
		student[8] = "김지현";
		student[9] = "박성희";
		student[10] = "이지운";
		student[11] = "정다운";
		student[12] = "이치승";
		student[13] = "이서영";
		student[14] = "전대영";
		student[15] = "김현우";
		student[16] = "이현서";
		student[17] = "김민우";

		int random = randomNumber();

		System.out.println(student[random]);
	}
}
