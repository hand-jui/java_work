package ch10;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println("공격합니당");

	}

	public static void main(String[] args) {
//		Warrior warrior = new Warrior("워리어", 100);
//		Archer archer = new Archer("아처", 200);
//		Wizard wizard = new Wizard("위자드", 150);

//		warrior.comboAttack();
	}
}

//class Warrior extends Hero {
//
//	public Warrior(String name, int hp) {
//		super(name, hp);
//	}
//
//	public void comboAttack() {
//		System.out.println(name + "가 2단 공격을 합니다.");
//	}
//}
//
//class Archer extends Hero {
//
//	public Archer(String name, int hp) {
//		super(name, hp);
//	}
//
//	public void fireArrow() {
//		System.out.println(name + "가 불화살 공격을 합니다.");
//	}
//
//}
//
//class Wizard extends Hero {
//
//	public Wizard(String name, int hp) {
//		super(name, hp);
//	}
//
//	public void freezing() {
//		System.out.println(name+"가 얼음 공격을 합니다.");
//	}
//
//}
