package test1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingCounter extends JFrame implements ActionListener{

	//전역 변수 선언, 문제지에도 안내
	JPanel p = new JPanel();
	JLabel labelNumber = new JLabel("10");
	JButton btnDec = new JButton("감소");
	JButton btnInc = new JButton("증가");
	JButton btnCls = new JButton("초기화");
	JButton btnStart = new JButton("카운트다운");
	
	
	SwingCounter(){
		//타이머 숫자 폰트 지정, 문제지에 안내
		labelNumber.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//프레임 설정
		//1. 타이틀("간단 카운터"), 2.사이즈 350*200, 3.가운데 띄우기, 4.프로그램 종료, 5.화면 띄우기
		setTitle("간단 카운터");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//패널, 컴포넌트 추가
		add(p);
		p.add(btnCls);
		p.add(btnDec);
		p.add(btnInc);
		p.add(btnStart);
		p.add(labelNumber);
		
		//각 버튼에 리스너 생성
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		btnStart.addActionListener(this);		
	}
		
		
		
	public static void main(String[] args) {
		new SwingCounter();
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnInc) {
			String str = labelNumber.getText().trim();
			int count = Integer.parseInt(str)+1; //숫자로 바꾸고 +1
			str=Integer.toString(count); //다시 숫자를 문자로 바꾸고
			labelNumber.setText(str); //숫자 라벨에 설정
		}
		else if(e.getSource() == btnDec) {
			String str = labelNumber.getText().trim();
			int count = Integer.parseInt(str); //숫자로 바꾸고
			if(count > 0) {
				count-=1; // 거기에 -1
				str=Integer.toString(count); //다시 숫자를 문자로 바꾸고
				labelNumber.setText(str); //숫자 라벨에 설정
			} 
			
		}
		else if(e.getSource() == btnCls) {
			labelNumber.setText("0"); //0으로 초기화, **문자열**
			btnStart.setEnabled(true); // 카운트다운버튼 클릭 가능 하도록 재설정
		}
		else if(e.getSource() == btnStart) {
			//쓰레드에서 라벨에 접근할 수 있도록 객체를 생성자로 넘겨줌.
			CountDownTimer runnable = new CountDownTimer(labelNumber);
			Thread thread = new Thread(runnable);
			thread.start();//동시작업 시작
			
			btnStart.setEnabled(false);//카운트다운 버튼 비활성화버튼
		}
		
	}
	
	
	

}
