package jframeTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class Mywin extends JFrame {
	private JButton b2;

	public Mywin() {
		setTitle("나의 그래픽 프로그램");
		setSize(500, 600);
		JButton b1 = new JButton("...... \uB354 \uAE38\uC5B4\uC9C8 \uC218 \uC774\uC4F0\uAE4C...");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		getContentPane().add(b1);
		
		b2 = new JButton("\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B\u314B");
		b2.setForeground(Color.DARK_GRAY);
		b2.setBackground(Color.ORANGE);
		b2.setToolTipText("\uB098\uB294 \uB3C4\uC6C0\uB9D0 \uC5ED\uD560");
		getContentPane().add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("나를 누르셨군요");
			}
		});	
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("두번째 버튼도 누르셨군요...! 환영합니다!!!");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		Mywin mw = new Mywin();
	}
	

}
