package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {

//	JButton <--
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("노레이아웃연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("귀");
		button1.setSize(100, 100);
		button2 = new JButton("귀");
		button2.setSize(100, 100);
		button3 = new JButton("얼굴");
		button3.setSize(150, 150);
		button4 = new JButton("코");
		button4.setSize(30, 30);
	}

	private void setInitLayout() {
		setLayout(null);
		button1.setLocation(100, 100);
		add(button1);
		button2.setLocation(250, 100);
		add(button2);
		button4.setLocation(210, 235);
		add(button4);
		button3.setLocation(150, 150);
		add(button3);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
