package jframeTest;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	private JTextField id_tf;
	private JTextField pw_tf;
	public Login() {
		setTitle("로그인 화면");
		setSize(300, 300);
		getContentPane().setLayout(null);
		
		id_tf = new JTextField();
		id_tf.setColumns(10);
		id_tf.setBounds(59, 149, 200, 27);
		getContentPane().add(id_tf);
		
		pw_tf = new JPasswordField();
		pw_tf.setColumns(10);
		pw_tf.setBounds(59, 187, 200, 27);
		getContentPane().add(pw_tf);
		
		JLabel pw_lb = new JLabel("PW");
		pw_lb.setBounds(22, 187, 37, 27);
		getContentPane().add(pw_lb);
		
		JLabel id_lb = new JLabel("ID");
		id_lb.setBounds(22, 149, 37, 27);
		getContentPane().add(id_lb);
		
		JButton b1 = new JButton("Login");
		b1.setBounds(157, 224, 115, 27);
		getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\2015031602655_3.jpg"));
		lblNewLabel.setBounds(0, 0, 284, 126);
		getContentPane().add(lblNewLabel);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "가입되었습니다");
				
			}
		});
		
		setVisible(true);
	}
}
