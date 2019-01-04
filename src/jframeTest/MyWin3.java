package jframeTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MyWin3 extends JFrame implements ActionListener {
	
	public MyWin3() {
		setTitle("나의 윈도우 프로그램");
		setSize(500, 600);
		getContentPane().setLayout(null);
		
		JButton b1 = new JButton("join us");
		b1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 29));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.DARK_GRAY);
		b1.setBounds(91, 10, 315, 131);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("2\uBC88 \uBC84\uD2BC\uC785\uB2C8\uB2E4..!");
		b2.setToolTipText("pizza");
		b2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\2310E2405809C5E421.jfif"));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLUE);
		b2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 50));
		b2.setBounds(12, 151, 460, 317);
		getContentPane().add(b2);
		
		JButton b3 = new JButton("Login \u3131\u3131\u3131\u3131");
		b3.setForeground(new Color(0, 0, 0));
		b3.setBackground(Color.ORANGE);
		b3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 30));
		b3.setBounds(91, 478, 315, 73);
		getContentPane().add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌렀군요....");
				Member mb = new Member();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("피자가 좋아!");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인");
				Login lg = new Login();
			}
		});
		
		
		setVisible(true);
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWin3 mw = new MyWin3();
	}
}
