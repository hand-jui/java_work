package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

//	내부 클래스를 활용해서
//	JPanel 을 상속 받고 paint 메서드로 집 그림을 그려주세요
	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawString("☆", 50, 100);
			g.drawString("☆", 550, 70);
			g.drawString("★", 500, 400);
			g.drawString("★", 50, 350);
			g.drawString("☆", 100, 300);
			g.drawString("★", 150, 150);
			g.drawString("☆", 300, 50);
			g.drawString("★", 500, 250);
			g.drawString("☆", 450, 30);
			g.drawLine(0, 450, 150, 450);
			g.drawLine(450, 450, 600, 450);

			g.drawRect(150, 250, 300, 250);
			g.drawLine(100, 250, 300, 70);
			g.drawLine(500, 250, 300, 70);
			g.drawLine(100, 250, 500, 250);
			g.drawLine(425, 50, 425, 180);
			g.drawLine(425, 50, 375, 50);
			g.drawLine(375, 50, 375, 135);
			g.drawRect(200, 350, 75, 150);

			g.drawOval(325, 325, 100, 100);
			g.drawLine(325, 375, 425, 375);
			g.drawLine(375, 325, 375, 425);
			g.drawOval(260, 425, 10, 10);

		}
	}

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("집그리기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

}
