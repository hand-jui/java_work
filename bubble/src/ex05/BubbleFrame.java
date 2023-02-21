package ex05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

//		player가 메모리에 올라간 상태(new)
//		약속 run 메서드 안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();

	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 루트 패널
		setSize(1000, 640);

		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);

		add(player);
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
//					여러번 눌러도 한번만 호출되게 방어적 코드 작성
//					false
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				case KeyEvent.VK_SPACE:
//					1단계
					Bubble bubble = new Bubble(player);
					add(bubble);
					break;
				}
			} // end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
//					왼 버튼을 떼면 player는 멈춰야함
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
//					오른 버튼을 떼면 player는 멈춰야함
					player.setRight(false);
					break;
				}

			} // end of released
		});

	}

	
//	***** 자바 프로그램 중 main 함수를 가지는 클래스는
//	프로그램에서 사용하는 모든 참조값에 접근 할 수 있다.*****
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main

}
