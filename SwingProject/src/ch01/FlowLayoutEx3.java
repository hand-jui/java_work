package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

//	멤버 변수를 선언할 수 있는가
//	배열을 활용할 수 있는가
//	생성자+메서드를 호출
//	반복이 보이면 for 문 활용할 수 있는가
//	GUI 프로그램 익숙해지기
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
//	private JButton button7;
//	private JButton button8;

	private JButton[] buttons = new JButton[8];
	private FlowLayout flowLayout;
//	배치관리자 FlowLayout 멤버 변수로 선언

//	화면에 Component를 그려라
	
//	생성자는 메모리에 올라갈 때 처음 실행되는 코드
//	구현부 안에서 순서 중요함!!!
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayout2");
		setSize(600, 600);
//		static 변수나 static 함수는 클래스 이름으로도!! 접금 가능
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));

		}
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (int i = 0; i < buttons.length; i++) {
//			방어적 코드 작성 염두
			add(buttons[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
