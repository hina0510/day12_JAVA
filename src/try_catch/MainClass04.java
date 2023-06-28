package try_catch;

import java.util.Scanner;

class TestClass04{
	public void test() {
		Scanner input = new Scanner(System.in);
		int n1=10, n2=0;
		try {
			System.out.println(n1/n2);
		} catch (Exception e) {
			System.out.println("문제 발생");
		} finally {
			System.out.println("finally 실행");//무조건 실행
		}
		System.out.println("다음 문장 실행");
	}
}

public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test();
}
}
