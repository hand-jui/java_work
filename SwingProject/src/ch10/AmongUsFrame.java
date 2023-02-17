package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {

//	boolean isRight = true;

//	배경 이미지
	BufferedImage backgroundMap;
//	캐릭터 어몽어스 이미지1
	BufferedImage pinkImage1;
//	캐릭터 어몽어스(적군) 이미지1 
	BufferedImage grayImage1;
	BufferedImage grayLeft;
	BufferedImage grayRight;
//	JPanel 상속 --> inner class 
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();
		new Thread(customPanel).start();
	}

//	a=1;
//
//	b c
//
//	a=
//	b
//	a = c;

	private void initData() {
		setTitle("미니어몽");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		이미지 3개 있음, CustomPanel
		try {
			backgroundMap = ImageIO.read(new File("images/background_map.png"));
			pinkImage1 = ImageIO.read(new File("images/pink_image.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image.png"));
			grayRight = ImageIO.read(new File("images/gray_right_image.png"));
			grayLeft = ImageIO.read(new File("images/gray_left_image.png"));

		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}
//		CustomPanel 메모리에 올라가는 순간 paintComponent() 메서드 호출
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {

		add(customPanel);
		repaint();
//		setLayout(null); // 좌표 기반
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this); // 이벤트 리스너 등록 처리
	}

	class CustomPanel extends JPanel implements Runnable {
//		BufferedImage
		@Override
		protected void paintComponent(Graphics g) {

//			System.out.println("11111111111"); // <-- 로깅
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);

		}

		@Override
		public void run() {
			boolean isRight = true;
			boolean isRightFoot = true;

			while (true) {
//				오른발 왼발
				if (isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}

//				방향 체크
				if (grayX == 500) {
					isRight = false;
				}
				if (grayX == -20) {
					isRight = true;
				}

				if (isRightFoot) {
					grayImage1 = grayRight;
					isRightFoot = false;
					System.out.println(isRightFoot);
				} else if (isRightFoot = false) {
					grayImage1 = grayLeft;
					isRightFoot = true;
					System.out.println(isRightFoot);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
//		System.out.println("keyCode : " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
//			왼쪽
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
//			오른쪽
			pinkX = (pinkX > 495) ? 505 : pinkX + 10;
		} else if (keyCode == KeyEvent.VK_UP) {
//			위
			pinkY = (pinkY < 0) ? -10 : pinkY - 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
//			아래
			pinkY = (pinkY > 465) ? 475 : pinkY + 10;
		}

		if (grayX == pinkX && grayY == pinkY) {
			pinkImage1 = null;
		}
//		그림을 다시 그려주는 기능 실행
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
} // end of outer class
