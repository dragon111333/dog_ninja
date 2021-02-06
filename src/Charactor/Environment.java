package Charactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Environment {
		public int x;
		public int y;
		public int startX;
		public int speed;
		public int eType;
		public static int CLOUD = 0,BUILDING=1;
		private Timer timeMove;
		public Environment(int x,int y,JPanel page,int eType,int speed) {
			this.x = x;
			this.y = y;
			this.startX = x;
			this.speed = speed;
			this.eType = eType;
			this.move(page);
		}
		
		public void move(JPanel page) {
				   this.timeMove = new Timer(10,new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							if(x+400<0) {
								x = startX;
							}
							x -= speed;
							page.repaint(); 
					}
				});
				this.timeMove.start();
		}
		
		public void stop() {
			this.timeMove.stop();
		}

		
		public String getEvType(int eType){
			 String[] name = new String[] {"cloud.png","building.png"};
			 return name[eType];
		}
		
		public BufferedImage getImage() {
			BufferedImage image = null;
			try {
				 image = ImageIO.read(new File("img\\"+getEvType(this.eType)));
				 return image;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return image;
		}
}
