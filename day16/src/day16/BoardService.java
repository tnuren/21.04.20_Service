package day16;

import java.util.*;

public class BoardService {

	int num = 0;
	String pw = "";
	String title = "";
	String content = "";

	Scanner scan = new Scanner(System.in);

	List<BoardDTO> member(List<BoardDTO> text) {
		for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i));

		}
		return text;
	}

	List<BoardDTO> number(List<BoardDTO> text) {
		System.out.print("글번호를 입력해주세요 : ");
		num = scan.nextInt();
		for (int i = 0; i < text.size(); i++) {
			if (num == text.get(i).getNumber()) {
				System.out.println(text.get(i));
			}
		}
		return text;
	}

	List<BoardDTO> change(List<BoardDTO> text) {
		System.out.print("글번호를 입력해주세요 : ");
		num = scan.nextInt();
		System.out.print("비밀번호를 입력해주세요 : ");
		pw = scan.next();
		for (int i = 0; i < text.size(); i++) {
			if (num == text.get(i).getNumber() && pw.equals(text.get(i).getPw())) {
				System.out.print("제목을 수정합니다 : ");
				title = scan.next();
				System.out.print("내용을 수정합니다 : ");
				content = scan.next();
				text.get(i).setTextTitle(title);
				text.get(i).setContent(content);
				System.out.println(text.get(i));
			} 
		}

		return text;
	}

	List<BoardDTO> delet(List<BoardDTO> text) {
		System.out.print("글번호를 입력해주세요 : ");
		num = scan.nextInt();
		System.out.print("비밀번호를 입력해주세요 : ");
		pw = scan.next();
		for (int i = 0; i < text.size(); i++) {
			if (num == text.get(i).getNumber() && pw.equals(text.get(i).getPw())) {
				text.remove(i);
			}
		} 
		return text;

	}
}