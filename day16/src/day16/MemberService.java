package day16;

import java.util.*;

public class MemberService {

	Scanner scan = new Scanner(System.in);
	String id = "";
	String pw = "";
	String name = "";
	String number = "";

	// 출력이 목적이니 return 없어도 된다.
	List<MemberDTO> memberScan(List<MemberDTO> memberList) {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));

		}

		return memberList;
	}

	List<MemberDTO> login(List<MemberDTO> memberList) {
		System.out.print("아이디를 입력해주세요 : ");
		id = scan.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		pw = scan.next();
		for (int i = 0; i < memberList.size(); i++) {
			// && 사용 가능.
			if (id.equals(memberList.get(i).getId())) {
				if (pw.equals(memberList.get(i).getPw())) {
					System.out.println(memberList.get(i).getName() + "님 환영합니다!");
				} else {
					System.out.println("아이디 또는 비밀번호가 틀립니다.");
				}

			}
		}

		return memberList;
	}

	List<MemberDTO> transfer(List<MemberDTO> memberList) {
		System.out.print("아이디를 입력해주세요 : ");
		id = scan.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		pw = scan.next();
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				if (pw.equals(memberList.get(i).getPw())) {
					System.out.println(memberList.get(i).getName() + "님 환영합니다!");
					System.out.print("변경할 전화번호를 입력해주세요 : ");
					number = scan.next();
					memberList.get(i).setNumber(number);
				} else {
					System.out.println("아이디 또는 비밀번호가 틀립니다.");
				}

			}
		}
		return memberList;
	}

}
