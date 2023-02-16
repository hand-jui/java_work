package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveImage extends JFrame implements Moveable ,ActionListener{

	private ImagePanel imagePanel;
	private int imageX;
	private int imageY;

	public MoveImage() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(810, 790);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		imageX = 0;
		imageY = 0;
		imagePanel = new ImagePanel();

	}

	private void setInitLayout() {
//		setLayout(null);
		imagePanel.setLocation(0, 0);

		add(imagePanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

	static class ImagePanel extends JPanel {
		private Image image;

		public ImagePanel() {
			image = new ImageIcon("images/cute.JPG").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, 250, 250, null);
		}

		public static void main(String[] args) {
			new MoveImage();
		}
	}

	@Override
	public void left() {
		if (imageX <= 0) {
			return;
		}
		imagePanel.setLocation(imageX -= 50, imageY);
	}

	@Override
	public void right() {
		if (imageX >= 520) {
			return;
		}
		imagePanel.setLocation(imageX += 50, imageY);
	}

	@Override
	public void up() {
		if (imageY <= 0) {
			return;
		}
		imagePanel.setLocation(imageX, imageY -= 50);
	}

	@Override
	public void down() {
		if (imageY >= 500) {
			return;
		}
		imagePanel.setLocation(imageX, imageY += 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

}
