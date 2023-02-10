package ex12;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("데크스탑이 화면을 표시합니다.");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑으로 타자를 칩니다.");
	}

}
