package try_catch;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String n1, n2;
		System.out.println("11입력");
		n1=input.nextLine();//공백도 입력가능
		System.out.println("22입력");
		n2=input.next();
		
		System.out.println("1. "+n1);
		System.out.println("2. "+n2);
		*/
		int num;
		while(true) {
			try {
				System.out.println("수 입력 : ");
				num=input.nextInt();
				System.out.println("입력값 : "+num);
			} catch (Exception e) {
				String s = input.nextLine();
				System.out.println(s+"수 입력하세요!!");
			}
		}
	}
}
