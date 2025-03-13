package s30699;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SwingSearch extends JFrame implements ActionListener, ListSelectionListener{
	
	private JTextField tfId = new JTextField(10);
	private JButton btnSearch = new JButton("검색");
	private JButton btnDelete = new JButton("삭제");
	private JButton btnInsert = new JButton("회원가입");
	private JScrollPane sp = new JScrollPane();
		
	// 테이블과 테이블 안의 데이터 모델 선언
	private DefaultTableModel model;
	private JTable table;
	
	SwingSearch(){
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JLabel lbId = new JLabel("아 이 디");
		
		p1.add(lbId); p1.add(tfId); 
		p1.add(btnSearch); p1.add(btnDelete); p1.add(btnInsert);
		
		// =========== 여기 아래 코딩 ===============//
		
		
		
		p2.setLayout(new BorderLayout());
		
		sp = new JScrollPane(table);
	 
		p2.add(sp);
		
		btnSearch.addActionListener(this);
		btnDelete.addActionListener(this);
		btnInsert.addActionListener(this);
		
		// ============ 여기 코딩 ===================
		
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		setTitle("회원 관리");
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// ============== 여기 코딩 ===============//
		
		
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		//=========== 여기 코딩 ===============//
		
		
		
	}
	
	public static void main(String[] args) {
		new SwingSearch();
	}
}






