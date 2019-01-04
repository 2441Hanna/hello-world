package jframeTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class ShoppingBoard extends JFrame {
	private JTextField textField;
	public ShoppingBoard() {
		setTitle("게시판");
		setSize(500, 600);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		label.setBounds(0, 0, 484, 131);
		getContentPane().add(label);
		
		JLabel lbTitle = new JLabel("Title");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 25));
		lbTitle.setBounds(205, 140, 70, 30);
		getContentPane().add(lbTitle);
		
		textField = new JTextField();
		textField.setBounds(20, 170, 440, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbContent = new JLabel("Content");
		lbContent.setHorizontalAlignment(SwingConstants.CENTER);
		lbContent.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 25));
		lbContent.setBounds(165, 205, 150, 30);
		getContentPane().add(lbContent);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 236, 440, 250);
		getContentPane().add(textArea);
		
		JButton b1 = new JButton("\uB4F1\uB85D");
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setBounds(80, 500, 155, 40);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("\uCDE8\uC18C");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setBounds(250, 500, 155, 40);
		getContentPane().add(b2);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "등록되었습니다");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "취소되었습니다");
			}
		});
		setVisible(true);
	}
}
