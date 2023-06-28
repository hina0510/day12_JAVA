package quiz;

import java.util.Scanner;

public class MemberServicelmpl implements MemberService{
	MemberDTO mdto = new MemberDTO();
	private String name, addr;
	private int age;
	
	public void getUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = input.next();
		mdto.setName(name);
		System.out.print("나이 : ");
		age = input.nextInt();
		mdto.setAge(age);
		System.out.print("주소 : ");
		addr = input.next();
		mdto.setAddr(addr);
	}
	public void setUser() {
		if(mdto.getName()!=null) {
			System.out.println("이름 : "+mdto.getName());
			System.out.println("나이 : "+mdto.getAge());
			System.out.println("주소 : "+mdto.getAddr());
		}else {
			System.out.println("정보가 없습니다");
		}
	}
	public void delUser() {
		mdto.setName(null);
		mdto.setAge(0);
		mdto.setAddr(null);
		System.out.println("삭제되었습니다");
	}
	public void updateUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		name = input.next();
		mdto.setName(name);
		System.out.print("나이 : ");
		age = input.nextInt();
		mdto.setAge(age);
		System.out.print("주소 : ");
		addr = input.next();
		mdto.setAddr(addr);
		
	}
	
}

