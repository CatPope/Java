package SwingTalk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AppMain extends JFrame implements ActionListener{
	
	JTextField txt_login;
	JButton btn_login;
	JLabel profile;
	JLabel picture;
	String userId;

	
	public static void main(String[] args) {
		new AppMain();
	}
	
	public AppMain() {
		setSize(320, 600);
		setTitle("RobotChat Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(254, 229, 0));
		
		txt_login = new JTextField("");
		btn_login = new JButton("확인");
		
		ImageIcon image = new ImageIcon("image/nahida.png");
		picture = new JLabel(image);
		profile = new JLabel("사랑으로크는우리아이");
		profile.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt_login.setBounds(50, 400, 200, 30);
		btn_login.setBounds(50, 440, 200, 30);
		profile.setBounds(55, 350, 200, 60);
		picture.setBounds(50, 150, 200, 200);

		panel.add(txt_login);
		panel.add(btn_login);
		panel.add(profile);
		panel.add(picture);
		add(panel);
		
		setVisible(true);
		btn_login.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btn_login) {
			String userId = txt_login.getText().trim();
			if(userId.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
			}else {
				new Chat(userId);
				dispose();
				
			}
		}
		
	}

}