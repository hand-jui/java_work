package ch04;

public class GameTest {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 400);
		Wizard wizard = new Wizard("마법사", 350);
		warrior.attack(20);
		wizard.defenceMiss();
		wizard.defence();
		

		wizard.attackMiss();
		warrior.attackMiss();
		wizard.attack(20);

		warrior.attack(30);

		warrior.showInfo();
		wizard.showInfo();

	}
}
