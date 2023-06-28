package try_catch;

import java.util.Scanner;

public class MainClass06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age;
	System.out.print("나이 입력 : ");
	try {
		age = input.nextInt();
		if(age<1) {
			throw new Exception("잘못 입력 : "+age);
		}
		System.out.println("나이 : "+age);
	} catch (Exception e) {
		System.out.println("나이는 음수가 없습니다");
	}
	System.out.println("다음 문장 실행");
	
}
}
