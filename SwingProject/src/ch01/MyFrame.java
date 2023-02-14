package ch01;

import javax.swing.JFrame;

//상속JFrame <-- 자바 개발자들이 만들어준 클래스
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("MyFrame01");
//		width, height
		setSize(200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//	코드 테스트
	public static void main(String[] args) {
		new MyFrame();
//		GUI 관련 프로그램 학습 시에 배치 관리자 먼저 명확히 이해하는것이 좋음
//		레이아웃 -> 
	}
}
