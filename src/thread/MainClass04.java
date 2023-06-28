package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread{
	public void run() {
		Scanner input = new Scanner(System.in);
		String str;
		while(true) {
			System.out.print("입력 : ");
			str = input.next();
			System.out.println("값 : "+str);
		}
	}
}

public class MainClass04 {
public static void main(String[] args) {
	A04 a = new A04();
	a.start();
	
	
	JFrame frame = new JFrame("제목");//기본틀
	
	Container c = frame.getContentPane();//장판
	
	JLabel label = new JLabel("test gui");//글씨
	c.add(label);
	label.setFont(new Font(null, Font.ITALIC, 32));//폰트, 스타일, 사이즈
	label.setHorizontalAlignment(JLabel.CENTER);//폰트 정렬
	
	frame.setLocation(600,300);//화면 상 위치
	frame.setPreferredSize(new Dimension(500,200));//창 크기
	frame.pack();//보여줌
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	for(int i=0;;i++) {
		label.setText(""+i);
	}
	
}
}
