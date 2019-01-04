package jframeTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Member extends JFrame {
	private JTextField id_tf;
	private JTextField pw_tf;
	private JTextField name_tf;
	private JTextField age_tf;
	private JTextField tel_tf;
	
	Database[] db = new Database[100];
	int idx = 0;
	
	public Member() {
		setTitle("회원가입 화면입니다");
		setSize(300, 300);
		JLabel intro = new JLabel("회원가입을 진행합니다.");
		intro.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().setLayout(null);
		intro.setBounds(0, 0, 284, 38);
		getContentPane().add(intro);
		
		id_tf = new JTextField();
		id_tf.setBounds(60, 37, 200, 27);
		getContentPane().add(id_tf);
		id_tf.setColumns(10);
		db[idx].id = id_tf.getText();
		
		JLabel id_lb = new JLabel("ID");
		id_lb.setBounds(23, 37, 37, 27);
		getContentPane().add(id_lb);
		
		pw_tf = new JPasswordField();
		pw_tf.setColumns(10);
		pw_tf.setBounds(60, 74, 200, 27);
		getContentPane().add(pw_tf);
		String pwS = pw_tf.getText();
		
		JLabel pw_lb = new JLabel("pw");
		pw_lb.setBounds(23, 74, 37, 27);
		getContentPane().add(pw_lb);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(60, 111, 200, 27);
		getContentPane().add(name_tf);
		String nameS = name_tf.getText();
		
		JLabel name_lb = new JLabel("\uC774\uB984");
		name_lb.setBounds(23, 111, 37, 27);
		getContentPane().add(name_lb);
		
		age_tf = new JTextField();
		age_tf.setColumns(10);
		age_tf.setBounds(60, 148, 200, 27);
		getContentPane().add(age_tf);
		String ageS = age_tf.getText();
		
		JLabel age_lb = new JLabel("\uB098\uC774");
		age_lb.setBounds(23, 148, 37, 27);
		getContentPane().add(age_lb);
		
		tel_tf = new JTextField();
		tel_tf.setColumns(10);
		tel_tf.setBounds(60, 186, 200, 27);
		getContentPane().add(tel_tf);
		String telS = tel_tf.getText();
		
		JLabel tel_lb = new JLabel("Tel");
		tel_lb.setBounds(23, 186, 37, 27);
		getContentPane().add(tel_lb);
		
		JButton b1 = new JButton("Join");
		b1.setBounds(175, 228, 97, 23);
		getContentPane().add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("내용확인");
				System.out.println("ID : "+db[idx]);
				System.out.println("PW : "+pwS);
				System.out.println("이름 : "+nameS);
				System.out.println("나이 : "+ageS);
				System.out.println("Tel : "+telS);
				idx++;
				
			}
		});
		
		setVisible(true);
	}
}
