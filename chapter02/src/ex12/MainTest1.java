package ex12;

public class MainTest1 {

	public static void main(String[] args) {
//		기본적으로 추상클래스는 new 할 수 없다.
//		abstract --> 개발자한테 직접 new를 막아 버림
//		Animal animal= new Animal();  <- 추상 클래스 
		Computer[] computer = new Computer[300];
		computer[0] = new DeskTop();
		computer[1] = new DeskTop();
		computer[2] = new MyNoteBook();
//		computer.length --> 300

		for (int i = 0; i < computer.length; i++) {
			if (computer[i] != null) {
				computer[i].display();
				if (computer[i] instanceof MyNoteBook) {
					System.out.println("좋은 노트북을 구매했네용~");
				}
			}
		}

//		NoteBook noteBook = new MyNoteBook();
//		noteBook.display();
//		noteBook.typing();
//		noteBook.turnOff();
//		noteBook.turnOn();
//		System.out.println("========");
//
//		Computer computer1 = new MyNoteBook();
//		computer1.display();
//		computer1.typing();
//		computer1.turnOff();
//		computer1.turnOn();
//		System.out.println("========");
//
//		Computer computer2 = new DeskTop();
//		computer2.display();
//		computer2.typing();
//		computer2.turnOff();
//		computer2.turnOn();

	}
}
