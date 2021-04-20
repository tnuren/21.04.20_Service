package day16;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		List<BoardDTO> text = new ArrayList<BoardDTO>();
		// int number = list.size() + 1; 글번호
		String textTitle = ""; // 제목
		String pw = ""; // 비밀번호
		String name = ""; // 작성자
		String content = ""; // 내용
		BoardService bs = new BoardService();

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.글쓰기  ㅣ  2.전체글목록  ㅣ  3.글조회  ㅣ  4.글수정  ㅣ  5.글삭제  ㅣ");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			select = scan.nextInt();

			if (select == 1) {
				BoardDTO b1 = new BoardDTO();
				int number = text.size() + 1;
				b1.setNumber(number);
				System.out.print("제목을 입력하세요 : ");
				textTitle = scan.next();
				b1.setTextTitle(textTitle);
				System.out.print("비밀번호를 입력하세요 : ");
				pw = scan.next();
				b1.setPw(pw);
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				b1.setName(name);
				System.out.print("내용을 입력하세요 : ");
				content = scan.next();
				b1.setContent(content);
				text.add(b1);

			} else if (select == 2) {
				text = bs.member(text);
			} else if (select == 3) {
				text = bs.number(text);
			} else if (select == 4) {
				text = bs.change(text);
			} else if (select == 5) {
				text = bs.delet(text);
			}

		}

	}

}
