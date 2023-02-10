package ch07;

public class MainTest {

	public static void main(String[] args) {

		Student student1 = new Student("James", 5_000);
		Student student2 = new Student("Tomas", 10_000);

		Bus bus100 = new Bus(100);
		Subway subway1 = new Subway(1);

		student1.takeBus(bus100);
		student2.takeSubway(subway1);

		student1.showInfo();
		student2.showInfo();

		bus100.showInfo();
		subway1.showInfo();
	}

}
