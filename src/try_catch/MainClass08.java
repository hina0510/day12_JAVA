package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass08 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("인증 프로그램 입니다");
	while(true) {
		System.out.println("90년생 이상은 '가입불가'");
		System.out.println("89년생 이하는 '가입가능'");
		System.out.println("'A, ㅁ, ㅋ 문자는 잘못 입력'");
		try {
			System.out.print("주민번호 입력(앞6자리) : ");
			num=input.nextInt();
			if(num>=10000000 || num<100000) {
				System.out.println("길이가 틀렸습니다");
			}else if((num/10000)<=89){
				System.out.println("가입 가능");
			}else if((num/10000)>=90){
				System.out.println("가입 불가");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요!!");
		}
	}
	
	
	
}
}
