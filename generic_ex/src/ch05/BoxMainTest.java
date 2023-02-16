package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
////		Box<String> box = new Box<>();
//		box.put("안녕 반가워");
//		System.out.println(box.isEmpty());
//		System.out.println("----------");
//		String msg = box.take();
//		System.out.println("msg : " + msg);
//		System.out.println(box.isEmpty());

		Box<Toy> box1 = new Box<>();
		Box<Cloths> box2 = new Box<>();

		box1.put(new Toy());
		Toy r = box1.take();

		System.out.println(r);
//		System.out.println();

	}
}
