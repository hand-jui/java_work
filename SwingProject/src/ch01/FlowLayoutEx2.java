package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame {

//	1단계 JButton 2개 생성
	private JButton button1;
	private JButton button2;
	private FlowLayout flowLayout;
//	배치관리자 FlowLayout 멤버 변수로 선언

//	화면에 Component를 그려라
	public FlowLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayout2");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}

	private void setInitLayout() {
		setLayout(flowLayout);

		add(button1);
		add(button2);
	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
