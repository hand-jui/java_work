package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame2 extends JFrame implements Moveable {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
//		초기값 셋팅
		labelTextX = 300;
		labelTextY = 350;

		labelText = new JLabel("Hello World~");
		labelText.setSize(100, 100);
	}

	public void setInitLayout() {
		setLayout(null);
		labelText.setLocation(300, 350);
		add(labelText);
		setVisible(true);
	}

	public void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
//					현재 이벤트가 일어난 시점에 X,Y 좌표값을 확인
//				int currenX = labelText.getX();
//				int currenY = labelText.getY();
				if (labelTextX > 50 && labelTextX < 650 && labelTextY >= 0 && labelTextY <= 690) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						right();
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						left();
					} else if (e.getKeyCode() == KeyEvent.VK_UP) {
						up();
					} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						down();
					}
				} 
					
				
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

	@Override
	public void left() {
		labelText.setLocation(labelTextX -= 50, labelTextY);
	}

	@Override
	public void right() {
		labelText.setLocation(labelTextX += 50, labelTextY);
	}

	@Override
	public void up() {
		labelText.setLocation(labelTextX, labelTextY -= 50);
	}

	@Override
	public void down() {
		labelText.setLocation(labelTextX, labelTextY += 50);
	}

}
