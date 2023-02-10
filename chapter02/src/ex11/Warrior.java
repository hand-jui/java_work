package ex11;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
//		부모 클래스에 사용자 정의 생성자가 있다면
//		부모 생성자를 반드시 호출하여야 한다.
//		System.out.println("1111");  // <- 부모 정의 생성자 무조건 먼저 호출해야함. 그다음 추가적인 코드 작성
		super(name, hp); // super 키워드는 부모 생성자를 호출하는 키워드임
		System.out.println("Warrior 생성자 마지막줄 코드");
	}

	void comboAttack() {
		System.out.println(name + "가 2단 공격을 합니다.");
	}

//	테스트 코드
	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();
	}
}
