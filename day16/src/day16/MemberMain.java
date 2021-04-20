package day16;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int select = 0;
		String id = "";
		String pw = "";
		String name = "";
		String number = "";
		List<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		MemberService ms = new MemberService();
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 회원가입  ㅣ  2. 전체회원조회  ㅣ 3. 로그인  ㅣ  4. 전화번호 변경 ");
			System.out.println("----------------------------------------------------------");
			System.out.print("입력 > ");
			select = scan.nextInt();
			if(select == 1) {
				MemberDTO m1 = new MemberDTO();
				System.out.print("아이디를 입력하세요 : ");
				id = scan.next();
				m1.setId(id);
				System.out.print("비밀번호를 입력하세요 : ");
				pw = scan.next();
				m1.setPw(pw);
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				m1.setName(name);
				System.out.print("전화번호를 입력하세요 : ");
				number = scan.next();
				m1.setNumber(number);
				memberlist.add(m1);
			} else if (select == 2) {
				memberlist = ms.memberScan(memberlist);
			} else if (select == 3) {
				memberlist = ms.login(memberlist);
			} else if (select == 4) {
				memberlist = ms.transfer(memberlist);
			}
			
			
			
		}
			
		}
		
		
		
		
		
		
		
		
		
	}


