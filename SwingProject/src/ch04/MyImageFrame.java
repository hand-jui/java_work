package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame {

	// swing 이미지를 다루sms 방법은 3가지 정도
	// JLable <--Stringm image()

	imagePanel imagePanel; // 내부 클래스를 멤버 변수로 선언 , 주소값이 들어있음

	// Jpanel 안에 이미지를 넣는 방법!
	// 내부 클래스 이용해보기
	class imagePanel extends JPanel {

		private Image image; // <-- 여기에 이미지 저장

		// 이미지 패널 생성자
		public imagePanel() {
			image = new ImageIcon("image1.png").getImage(); // 외부에 있는 이미지를 메모리단으로 가지고 온다.
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 대상 <--
			// 매개변수 : 대상 , x, y, 가로길이 , 세로길이
			g.drawImage(image, 0, 0, 400, 400, null);
		}

	}// end of inner class

	public MyImageFrame() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("이미지 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();
	}

	public void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}
}
