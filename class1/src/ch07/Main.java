package ch07;

public class Main {

	public static void main(String[] args) {

		A a = new A();

//		Q . d object에 있는 value 값을 화면에 출력
		System.out.println(a.b.c.d.value);

		for (int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
		
	}

}
