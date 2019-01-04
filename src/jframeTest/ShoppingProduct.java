package jframeTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ShoppingProduct extends JFrame {
	
	public ShoppingProduct() {
		// TODO Auto-generated constructor stub
		setTitle("상품보기");
		setSize(500, 600);
		getContentPane().setLayout(null);
		
		JLabel lblTop = new JLabel("");
		lblTop.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		lblTop.setBounds(0, 0, 484, 131);
		getContentPane().add(lblTop);
		
		JLabel label1 = new JLabel("");
		label1.setBackground(Color.WHITE);
		label1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts1.jpeg"));
		label1.setBounds(10, 145, 150, 150);
		getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setBackground(Color.WHITE);
		label2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts2.jpg"));
		label2.setBounds(167, 145, 150, 150);
		getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts4.jpeg"));
		label3.setBounds(325, 145, 150, 150);
		getContentPane().add(label3);
		
		JLabel lblMichetTShirts = new JLabel("mickey-Tshirts     $12");
		lblMichetTShirts.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblMichetTShirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblMichetTShirts.setBackground(Color.GRAY);
		lblMichetTShirts.setBounds(10, 300, 150, 24);
		getContentPane().add(lblMichetTShirts);
		
		JLabel lblYellowTShirts = new JLabel("yellow-Tshirts     $15");
		lblYellowTShirts.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblYellowTShirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellowTShirts.setBackground(Color.WHITE);
		lblYellowTShirts.setBounds(167, 300, 150, 24);
		getContentPane().add(lblYellowTShirts);
		
		JLabel lblTshits = new JLabel("Tshits");
		lblTshits.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblTshits.setHorizontalAlignment(SwingConstants.CENTER);
		lblTshits.setBounds(325, 300, 150, 24);
		getContentPane().add(lblTshits);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts3-1.jpg"));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(10, 339, 150, 150);
		getContentPane().add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts5.jpg"));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(167, 339, 150, 150);
		getContentPane().add(label_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\tshirts6-1.jpg"));
		label_7.setBounds(325, 339, 150, 150);
		getContentPane().add(label_7);
		
		JLabel lblSimbatshirts = new JLabel("simba-Tshirts     $20");
		lblSimbatshirts.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblSimbatshirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimbatshirts.setBackground(Color.GRAY);
		lblSimbatshirts.setBounds(10, 490, 150, 24);
		getContentPane().add(lblSimbatshirts);
		
		JLabel lblStripeTshirts = new JLabel("stripe-Tshirts     $10");
		lblStripeTshirts.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblStripeTshirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblStripeTshirts.setBackground(Color.WHITE);
		lblStripeTshirts.setBounds(167, 490, 150, 24);
		getContentPane().add(lblStripeTshirts);
		
		JLabel lblGiantTshirts = new JLabel("giant-Tshirts     $35");
		lblGiantTshirts.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiantTshirts.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblGiantTshirts.setBounds(325, 490, 150, 24);
		getContentPane().add(lblGiantTshirts);
		
		JLabel lblBottom = new JLabel("");
		lblBottom.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBottom.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		lblBottom.setBounds(0, 530, 484, 31);
		getContentPane().add(lblBottom);
		
		setVisible(true);
	}
}
