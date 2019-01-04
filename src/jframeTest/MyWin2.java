package jframeTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MyWin2 extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	public MyWin2() {
		setTitle("나의 그래픽 프로그램");
		setSize(500, 300);
		JButton b1 = new JButton("나는 위로 갈 버튼");
		b1.setBackground(Color.RED);
		JButton b2 = new JButton("나는 왼쪽으로 갈 버튼");
		b2.setBackground(Color.ORANGE);
		JButton b3 = new JButton("나는 가운데로 갈 버튼");
		b3.setBackground(Color.YELLOW);
		JButton b4 = new JButton("나는 오른쪽으로 갈 버튼");
		b4.setBackground(Color.GREEN);
		JButton b5 = new JButton("나는 아래로 갈 버튼");
		b5.setBackground(Color.CYAN);
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("↑↑↑↑↑↑↑↑");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("←←←←←←←←←");
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("◎");
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("→→→→→→→→→→");
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("↓↓↓↓↓↓↓↓");
			}
		});
		
		getContentPane().add(b1,BorderLayout.NORTH);
		getContentPane().add(b2,BorderLayout.WEST);
		getContentPane().add(b3,BorderLayout.CENTER);
		getContentPane().add(b4,BorderLayout.EAST);
		getContentPane().add(b5,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWin2 mw = new MyWin2();
	}

}
