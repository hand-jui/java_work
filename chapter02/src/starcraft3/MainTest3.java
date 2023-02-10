package starcraft3;

public class MainTest3 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("돌격대장질럿1");
		Marine marine1 = new Marine("귀신잡는 해병은 아님");

		zealot1.attack(marine1);
		marine1.showInfo();

		Unit unit1 = new Zealot("질럿");
		Unit unit2 = new Marine("마린");
		Unit unit3 = new Zergling("저글링");

		unit1.attack(unit2);

	}

}
