package try_catch;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		예외
		프로그램 실행 중 문제가 있는 코드
		프로그래머 생각과 다르게 동작하는 코드
		예외 종류
		강제 예외 : throw
		예외 전가 : throws
		예외 처리 : try, catch
		사용 목적
		프로그램 중지 없이 실행가능하다
		 */
		Scanner input = new Scanner(System.in);
		int x, y, result=0;
		while(true) {
			System.out.print("수 입력 : ");
			x=input.nextInt();
			y=input.nextInt();
			try {
				result=x/y;
			} catch (ArithmeticException e) {
				System.out.println("어떤 값을 0으로 나눌 수 없습니다");
			}

			System.out.println("result : "+result);
		}

	}
}
