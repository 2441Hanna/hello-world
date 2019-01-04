package jframeTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;

public class ShoppingCompany extends JFrame {
	public ShoppingCompany() {
		setTitle("회사소개");
		setSize(500, 600);
		getContentPane().setLayout(null);
		
		JLabel lblTop = new JLabel("");
		lblTop.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		lblTop.setBounds(0, 0, 484, 131);
		getContentPane().add(lblTop);
		
		JLabel lblBottom = new JLabel("");
		lblBottom.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\main1.png"));
		lblBottom.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBottom.setBounds(0, 530, 484, 31);
		getContentPane().add(lblBottom);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("굴림", Font.PLAIN, 15));
		textPane.setContentType("");
		textPane.setText("인터넷을 통한 온라인 판매를 분류하면 크게 소수의 특정 제품을 전문적으로 판매하는 온라인 상점(online store), 경매를 통하여 물건을 판매하는 경매사이트, 그리고 여러 개의 온라인 상점이 모여 매우 많은 종류의 제품을 판매하는 백화점과 같은 곳인 몰(mall)로 분류될 수 있는데, 쇼핑몰이란 결국 인터넷 상에 존재하는 온라인 상점의 거대한 집합체라 할 수 있다.\r\n" + 
				"\n[네이버 지식백과] 쇼핑몰 [shopping mall] (NEW 경제용어사전, 2006. 4. 7., 미래와경영)");
		textPane.setBounds(17, 175, 450, 340);
		getContentPane().add(textPane);
		
		JLabel lblTitle = new JLabel("introduce our Company");
		lblTitle.setFont(new Font("Sitka Display", Font.BOLD, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(17, 140, 450, 35);
		getContentPane().add(lblTitle);
		
		
		setVisible(true);
	}
}
