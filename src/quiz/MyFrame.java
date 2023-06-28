package quiz;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends Thread{
	private JLabel label;
	private JFrame frame;
	private boolean flag;
	public void run() {
		frame.setVisible( true );
		flag = true;
		SimpleDateFormat date = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		while( flag ) {
			label.setText( date.format(new Date() ) );
		}
	}
	public void setFlag(boolean flag) { this.flag = flag; }
	public void setLable(String time) {
		label.setText( time );
	}
	public MyFrame() {
		frame = new JFrame("Time");//기본틀
	
		Container c = frame.getContentPane();//장판
	
		label = new JLabel();//글씨
		c.add(label);
		label.setFont(new Font(null, Font.ITALIC, 32));//폰트, 스타일, 사이즈
		label.setHorizontalAlignment(JLabel.CENTER);//폰트 정렬
	
		frame.setLocation(600,300);//화면 상 위치
		frame.setPreferredSize(new Dimension(500,200));//창 크기
		frame.pack();//보여줌
	
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
