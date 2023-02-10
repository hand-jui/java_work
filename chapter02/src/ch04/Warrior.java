package ch04;

//전사 클래스 설계하기
public class Warrior {
//	상태
	String name;
	int level = 0;
	int power;
	int hp = 200;
	int attackCount = 0;
	int defenceCount = 0;
	int attackMissCount = 0;
	int defenceMissCount = 0;

	public Warrior(String name, int power) {
		this.name = name;
		this.power = power;
	}

//	기능
	public void attack(int count) { // 공격 성공
		this.power -= count * 10;
		this.attackCount++;
		this.level += count * 2;
		if (this.power >= 0) {
			if (count >= 10) {
				System.out.println(this.name + "가 스킬을 사용했습니다.");
				System.out.println(this.name + " 공격 성공");
				System.out.println(this.name + " level up!!");
			} else if (count < 10) {
				System.out.println(this.name + " 공격 성공");
				System.out.println(this.name + " level up!!");
			}
			System.out.println(this.name + "의 남은 파워는 " + this.power + "입니다.");
			System.out.println("------------------------------------");
		} else {
			System.out.println(this.name + "의 파워가 부족해 공격을 할 수 없습니다.");
			System.out.println("------------------------------------");
		}
	}

	public void defence() { // 방어 성공
		this.defenceCount++;
		System.out.println(this.name + " 방어 성공");
		System.out.println("------------------------------------");
	}

	public void attackMiss() { // 공격 실패
		this.attackMissCount++;
		System.out.println(this.name + " 공격 실패");
		System.out.println("------------------------------------");
	}

	public void defenceMiss() { // 방어 실패
		this.defenceMissCount++;
		this.hp -= 10;
		System.out.println(this.name + " 방어 실패");
		if (this.hp >= 0) {
			System.out.println(this.name + "의 남은 체력은 " + hp + "입니다.");
			System.out.println("------------------------------------");
		} else {
			System.out.println(this.name + "의 남은 체력이 없습니다.");
			System.out.println("------------------------------------");
		}
	}

	public void showInfo() {
		System.out.println("=====" + this.name + "의 상태창=====");
		System.out.println("현재 레벨은 " + this.level + "입니다.");
		System.out.println("현재 파워는 " + this.power + "입니다.");
		System.out.println("현재 hp는 " + this.hp + "입니다.");
		System.out.println("공격 성공 횟수는 " + this.attackCount + "입니다.");
		System.out.println("공격 실패 횟수는 " + this.attackMissCount + "입니다.");
		System.out.println("방어 성공 횟수는 " + this.defenceCount + "입니다.");
		System.out.println("방어 실패 횟수는 " + this.defenceMissCount + "입니다.");
	}

} // end of class
