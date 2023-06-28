package quiz;


import java.util.Scanner;

public class LoginService04 extends TimeService{
	LoginDTO04 login;
	MyFrame myFrame;
	MemberServicelmpl mem;
	
	public LoginService04() {
		login = new LoginDTO04();
		myFrame = new MyFrame();
		mem = new MemberServicelmpl();
	}
	public void display() {
		LoginDTO04 dto = new LoginDTO04();
		Scanner input = new Scanner(System.in);
		
		String id, pw, gid, gpw, lid, lpw;
		int num;
		
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1: 
				gid = dto.getId();
				gpw = dto.getPw();
				if(gid==null) {
					System.out.println("저장하세요");
				}else {
					System.out.print("id : ");
					lid = input.next();
					System.out.print("pw : ");
					lpw = input.next();
					
					if(lid.equals(gid)==true) {
						if(lpw.equals(gpw)==true) {
							System.out.println("인증 통과");
							System.out.println("서비스 시간 설정");
							setStTime();
							myFrame.start();
							while(true) {
								System.out.println("1. 회원 정보 등록");
								System.out.println("2. 회원 정보 보기");
								System.out.println("3. 회원 정보 삭제");
								System.out.println("4. 회원 정보 수정");
								System.out.println("5. 나가기");
								System.out.print(">>>");
								num = input.nextInt();
								if(num==1) {
									mem.getUser();
								}else if(num==2) {
									mem.setUser();
								}else if(num==3) {
									mem.delUser();
								}else if(num==4) {
									mem.updateUser();
								}else if(num==5) {
										break;
								}
							}
							
						}else {
							System.out.println("비번 틀림");
						}
					}else {
						System.out.println("존재하지 않는 id");
					}
				}
				break;
			case 2: 
				System.out.print("id : ");
				id = input.next();
				gid = dto.getId();
				if(gid!=null) {
					System.out.println("사용자가 존재함");
				}else {
					dto.setId(id);
					System.out.print("pw : ");
					pw = input.next();
					dto.setPw(pw);
				}
				break;
			case 3: 
				gid = dto.getId();
				if(gid==null) {
					System.out.println("등록값 없음");
				}else {
					dto.setId(null);
					dto.setPw(null);
					System.out.println("탈퇴하였습니다");
				}
				break;
			case 4: 
				setEndTime();
				System.out.println( useTime() );
				myFrame.setFlag(false);
				myFrame.setLable( useTime() );
				break;
			}
		}
	}
}