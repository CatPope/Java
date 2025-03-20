package s30699;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.util.Date;

public class SwingRegister extends JFrame implements ActionListener{
	
	private String name[] = {"id", "이름", "비밀번호", "주소", "가입일자"};
	private JLabel label[] = new JLabel[5];
	private JTextField textF[] = new JTextField[5]; 
		
	private JButton btnSave = new JButton("저장");
	private JButton btnCancel = new JButton("취소");
		
	// 회원 등록
	SwingRegister(){
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setLayout(new GridLayout(0,2));
				
		// 화면 그리기 
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel( name[i] );
			label[i].setHorizontalAlignment(JLabel.CENTER);
			if(i==2)	textF[i] = new JPasswordField(20);
			else		textF[i] = new JTextField(20);
			p1.add(label[i]);
			p1.add(textF[i]);
		}
		
		p2.add(btnSave);
		p2.add(btnCancel);		
				
		// =============== 여기 코딩 ==================
		
		
	
		
		
		
		btnSave.addActionListener(this);
		btnCancel.addActionListener(this);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(350, 250);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setTitle("회원 등록");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// ==============  여기에 코딩  ==================
		
	}

}
