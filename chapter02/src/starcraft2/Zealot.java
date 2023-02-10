package starcraft2;

import starcraft.Marine;
import starcraft.Zergling;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private int shield;
	
//	생성자
	public Zealot(String name) {
		this.name=name;
		this.power=5;
		this.hp=100;
		this.shield=0;
	}
	
//	getter 메서드 만들기
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;

	}

	public int getHp() {
		return this.hp;
	}
	
	public int getShield() {
		return this.shield;
	}

//	질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) { // ->객체에 메세지 주고받도록 설계
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}

//	질럿이 마린을 공격합니다. -> 12마리
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
//		질럿 공격력은 현재 5이다.
		marine.beAttacked(this.power);
	}

//	자기자신이 공격을 당합니다.	
	public void beAttacked(int power) {
		if (this.hp<=0) {
			System.out.println(this.name+"이 사망하였습니다.");
			return;  // 값을 반환할 때 사용할 수 있고 실행에 종료를 시킬 수도 있다.
		} 
		System.out.println(this.name + "이 공격을 당합니다.");
		this.hp -= power;
	}

//	실드 업그레이드
//	업그레이드 5->10
	public void upgradeShield() {
		this.shield+=5;
	}
	
	
	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
		System.out.println("방어력 : " + this.shield);
	}
}
