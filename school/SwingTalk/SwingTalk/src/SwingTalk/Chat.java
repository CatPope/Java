package SwingTalk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.html.HTMLDocument;

public class Chat extends JFrame implements ActionListener{
	
	
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem[] = new JMenuItem[4];
	String[] menuTitle = {"이름 변경", "배경 변경", "폰트 변경", "서버주소변경"};
	
	JPanel jp_top, jp_bottom;
	JScrollPane jp_chat;
	
	String userId;
	JLabel userLabel;
	
	JTextPane chatTextPane;
	HTMLDocument doc;

	public Chat(String userId) {
		
		this.userId=userId;
		
		setSize(320, 620);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		createMenue();
		
		jp_top = new JPanel();
		jp_chat = new JScrollPane();
		jp_bottom = new JPanel();
		
		jp_top.setBounds(0, 0, 320, 40);
		jp_chat.setBounds(0, 40, 320, 440);
		jp_bottom.setBounds(0, 480, 320, 80);

		jp_top.setBackground(Color.yellow);
		jp_chat.setBackground(Color.pink);
		jp_bottom.setBackground(Color.gray);

		add(jp_top);
		add(jp_chat);
		add(jp_bottom);
		
		setVisible(true);

		draw_top_panel();
		draw_chat_panel();
		draw_bottom_panel();
	}


	private void draw_top_panel() {
		userLabel = new JLabel();
		userLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		userLabel.setBounds(0, 0, 300, 20);
		userLabel.setText(userId);
		jp_top.add(userLabel);
	}

	
	private void draw_bottom_panel() {
		jp_bottom.setLayout(null);
		JTextArea txtSend = new JTextArea();
		
		txtSend.setBounds(4, 4, 200, 70);
		txtSend.setLineWrap(true);
		
		JButton btn_imo = new JButton("❣");
		btn_imo.setBounds(220, 4, 60, 30);
		
		jp_bottom.add(txtSend);
		jp_bottom.add(btn_imo);
		
		
		txtSend.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				String str = txtSend.getText().trim();
				if (e.getKeyCode() == KeyEvent.VK_ENTER  &&  str.length() > 0) {
					System.out.println(str + "을 전송합니다. 담에 추가 구현");
				}
			}
			
		});
	}
	
	
	private void draw_chat_panel() {
		jp_chat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		chatTextPane = new JTextPane();
		chatTextPane.setBounds(0, 0, 400, 300);
		chatTextPane.setBackground(Color.pink);
		
		chatTextPane.setContentType("text/html");
		doc = (HTMLDocument) chatTextPane.getStyledDocument();
		jp_chat.setViewportView(chatTextPane);
	}


	private void createMenue() {

		menuBar = new JMenuBar();
		menu = new JMenu("설정");
		menuBar.add(menu);
		
		menuItem = new JMenuItem[4];
		
		
		for (int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(menuTitle[i]);
			menuItem[i].addActionListener(this);
			menu.add(menuItem[i]);
		}
		
		setJMenuBar(menuBar);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem[0]){
			userId = JOptionPane.showInputDialog("새 이름을 입력하세요");
			if(userId.trim().length() != 0){
				System.out.println("이름변경:" + userId);
				userLabel.setText(userId);
			}
			
		}else if(e.getSource() == menuItem[1]) {
			SelectRGB rgbDlg = new SelectRGB();
			if(rgbDlg.changeColor)
				chatTextPane.setBackground(rgbDlg.sample.getBackground());
			
		}else if(e.getSource() == menuItem[2]) {
			SelectFont font = new SelectFont();
			if(font.changeFont)
				userLabel.setFont(font.sample.getFont());
			
		}else if(e.getSource() == menuItem[3]) {
			
		}
	}

}
