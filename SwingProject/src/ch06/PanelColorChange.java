package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelColorChange extends JFrame implements ActionListener {
	private JPanel panel1;
	private JPanel panel2;
	private JButton[] button = new JButton[5];

	public PanelColorChange() {
		initData();
		setInitLayout();
		addEventListner();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("click" + (i + 1));
		}
	}

	private void setInitLayout() {
		add(panel1, BorderLayout.CENTER);
		panel1.setBackground(Color.black);
		add(panel2, BorderLayout.SOUTH);
		panel2.setBackground(Color.gray);
		for (int i = 0; i < button.length; i++) {
			panel2.add(button[i]);
		}
//		setLayout();
		setVisible(true);
	}

	private void addEventListner() {
		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}

	}

	public static void main(String[] args) {
		new PanelColorChange();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();

		if (targetButton.getText().equals("click1")) {
			panel1.setBackground(Color.MAGENTA);
		} else if (targetButton.getText().equals("click2")) {
			panel1.setBackground(Color.blue);
		} else if (targetButton.getText().equals("click3")) {
			panel1.setBackground(Color.cyan);
		} else if (targetButton.getText().equals("click4")) {
			panel1.setBackground(Color.green);
		} else {
			panel1.setBackground(Color.orange);
		}

	}
}
