package SwingTalk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class SelectRGB extends JDialog implements ActionListener, AdjustmentListener{
	JScrollBar RS, GS, BS;
	JLabel label_r, label_g, label_b;
	JLabel sample;
	JButton btnOK, btnNo;
	boolean changeColor = false;
	
	SelectRGB(){
		
		setTitle("RGB값을 조절하여 배경색을 선택하세요");
		setBounds(1000, 0 , 500, 250);
		setModal(true);
		
		JPanel p0 = new JPanel(null); add(p0);

		RS = new JScrollBar(JScrollBar.HORIZONTAL, 127, 1, 0, 256);
		GS = new JScrollBar(JScrollBar.HORIZONTAL, 127, 1, 0, 256);
		BS = new JScrollBar(JScrollBar.HORIZONTAL, 127, 1, 0, 256);
		RS.setBounds(10, 40, 300, 20); p0.add(RS);
		GS.setBounds(10, 70, 300, 20); p0.add(GS);
		BS.setBounds(10, 100, 300, 20); p0.add(BS);

		label_r = new JLabel("RED");
		label_g = new JLabel("GREEN");
		label_b = new JLabel("BLUE");
		label_r.setBounds(320,  40,  50,  20);	p0.add(label_r);
		label_g.setBounds(320,  70,  50,  20);	p0.add(label_g);
		label_b.setBounds(320,  100,  50,  20);	p0.add(label_b);
		
		sample = new JLabel("SAMPLE");
		sample.setOpaque(true);
		sample.setBounds(400, 40, 80, 80);
		sample.setBackground(Color.BLACK);
		p0.add(sample);
		
		btnOK = new JButton("확인");
		btnNo = new JButton("취소");
		btnOK.setBounds(300, 150, 80, 20);
		btnNo.setBounds(400, 150, 80, 20);
		p0.add(btnOK);
		p0.add(btnNo);
		
		btnOK.addActionListener(this);
		btnNo.addActionListener(this);

		RS.addAdjustmentListener(this);
		GS.addAdjustmentListener(this);
		BS.addAdjustmentListener(this);
		
		setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {

		if(e.getSource() == RS) {
			label_r.setText(Integer.toString(RS.getValue()));
		}else if(e.getSource() == GS) {
			label_g.setText(Integer.toString(GS.getValue()));
		}else if(e.getSource() == BS) {
			label_b.setText(Integer.toString(BS.getValue()));
		}
		
		Color color = new Color(RS.getValue(), GS.getValue(), BS.getValue());
		sample.setBackground(color);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOK) {
			changeColor = true;
			setVisible(false);
		}else if(e.getSource() == btnNo) {
			changeColor = false;
			setVisible(false);
		}

	}
	
}
