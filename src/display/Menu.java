package display;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Element.EleButton;
import Element.EleLabel;

public class Menu extends JPanel {

		private static final long serialVersionUID = 1L;
		public long point;
		
		public Menu() {
			//----
		}
		
		public Menu(long point,ActionListener main) {
			try {
					this.point = point;
					this.setBackground(new Color(241, 98, 69));
					this.setBounds(0,0,1000,600);
					this.setFocusable(true);
					this.setLayout(null);
					
					EleLabel status = new EleLabel("คุณตาย!",40,400,100,200,100);
					status.setForeground(Color.white);
					
					EleLabel showPoint = new EleLabel("คะแนน : "+this.point,30,380,200,200,100);
					showPoint.setForeground(Color.white);
										
					EleButton restart = new EleButton("เริ่มใหม่",15,380,300,200,50);
					restart.addActionListener(main);		
					
					this.add(showPoint);
					this.add(status);
					this.add(restart);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}
