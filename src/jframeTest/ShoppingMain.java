package jframeTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class ShoppingMain extends JFrame {
	public static void main(String[] args) {
		ShoppingMain sm = new ShoppingMain();
	}
	public ShoppingMain() {
		setTitle("옷 쇼핑몰에 오신것을 환영합니다");
		setSize(500, 600);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		lblNewLabel.setBounds(0, 115, 484, 304);
		getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("\uAC8C\uC2DC\uD310");
		b1.setBounds(15, 430, 145, 50);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC0C1\uD488\uBCF4\uAE30");
		b2.setBounds(170, 430, 145, 50);
		getContentPane().add(b2);
		
		JButton b3 = new JButton("\uD68C\uC0AC\uC18C\uAC1C");
		b3.setBounds(325, 430, 145, 50);
		getContentPane().add(b3);
		
		JLabel lblNewLabel_1 = new JLabel("shopping mall ~ *");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setBounds(0, 30, 484, 87);
		getContentPane().add(lblNewLabel_1);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ShoppingBoard sb = new ShoppingBoard();
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ShoppingProduct sp = new ShoppingProduct();
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ShoppingCompany sc = new ShoppingCompany();
			}
		});
		setVisible(true);
	}
}
