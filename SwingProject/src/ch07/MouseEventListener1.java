package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListener1 extends JFrame implements Moveable {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MouseEventListener1() {
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
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				labelText.setLocation(e.getX(), e.getY());
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
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
