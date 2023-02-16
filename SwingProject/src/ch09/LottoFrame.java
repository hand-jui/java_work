package ch09;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame {

	JButton button;
	LottoRandomNumber lotto;

//	화면 담당
//	LottoRandomNumber 클래스에서 받아오기
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또 굴리기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 시작");
		lotto = new LottoRandomNumber();
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		int[] getNumbers = lotto.getLotto();
		g.drawString(getNumbers[0] + "", 50, 200);
		g.drawString(getNumbers[1] + "", 150, 200);
		g.drawString(getNumbers[2] + "", 250, 200);
		g.drawString(getNumbers[3] + "", 350, 200);
		g.drawString(getNumbers[4] + "", 450, 200);
		g.drawString(getNumbers[5] + "", 550, 200);

	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
	}

}
