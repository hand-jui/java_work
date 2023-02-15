package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyKeyEvent1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가 설정
		area = new JTextArea();
	}

	public void setInitLayout() {
		add(area);
		setVisible(true);

	}

	public void addEventListener() {
		area.addKeyListener(this);

	}

//	문자를 반응한다
	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped : " + e.toString());
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.toString());
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("방향기 위\n");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("방향기 오른족\n");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("방향기 아래\n");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("방향기 왼쪾\n");
		}
//		System.out.println(e.getKeyCode());
//		제어문 활용하여 방향키 위가 눌러지면 콘솔에 up 이란 문자열을 출력
//		왼쪽, 오른쪽,아래
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
