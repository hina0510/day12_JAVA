package thread;

class A01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class MainClass01 {
public static void main(String[] args) {
	/*
		thread
		프로그램을 구동하기 위한 최소한의 단위
	 */
	A01 a = new A01();
	B01 b = new B01();
	//a.run();
	//b.run();
	a.start();
	b.start();
	
	
	
	
}
}
