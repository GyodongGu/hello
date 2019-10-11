package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();

	String loginId = null;

	public void execute() {

		loginCheck();
		while (true) {

			System.out.println(
					"1.게시글 작성 | 2. 게시글 전체 목록 | 3. 게시글 한건 조회 | 4. 게시글 수정 | 5. 게시글 삭제 | 6.댓글 작성 | 7.댓글 조회| 8.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoardDBList();
			} else if (menu == 3) {
				getBoardDB();
			} else if (menu == 4) {
				updateBoardDB();
			} else if (menu == 5) {
				deleteBoardDB();
			} else if (menu == 6) {
				writeReply();
			} else if (menu == 7) {
				replyList();
			} else if (menu == 8) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public void replyList() {
		System.out.println("답글 목록보기");
		System.out.println("원본 글 번호 : ");
		int orgNo = sc.nextInt();
		sc.nextLine();

		List<BoardDB> relist = service.getReply(orgNo);

		for (BoardDB bb : relist) {
			System.out.println(bb);
		}

	}

	public void writeReply() {

		BoardDB rbDB = new BoardDB();

		System.out.println("답글을 작성할 원본 글의 번호를 입력하시오.");
		int rep = sc.nextInt();
		sc.nextLine();

		System.out.println("답글 제목 : ");
		String reTitle = sc.nextLine();
		System.out.println("답글 내용 : ");
		String reContent = sc.nextLine();

		rbDB.setOrigNo(rep);
		rbDB.setTitle(reTitle);
		rbDB.setContent(reContent);
		rbDB.setWriter(loginId);

		service.insertReply(rbDB);
		System.out.println("답글을 작성했습니다.");

	}

	public void deleteBoardDB() {
		System.out.println("삭제할 게시글 번호를 입력하세요.");
		int deleteNo = sc.nextInt();
		sc.nextLine();
		service.deleteBoardDB(deleteNo);
		System.out.println("삭제가 성공적으로 되었습니다.");

	}

	public void updateBoardDB() {
		System.out.println("수정할 게시글 번호를 입력하세요.");
		int updateNo = sc.nextInt();
		sc.nextLine();
		BoardDB upboard = new BoardDB();
		upboard = service.getBoardDb(updateNo);
		System.out.println("제목 수정 : ");
		String upTitle = sc.nextLine();
		System.out.println("수정할 내용 : ");
		String upContent = sc.nextLine();

		upboard.setTitle(upTitle);
		upboard.setContent(upContent);

		service.updateBoardDB(upboard);

	}

	public void getBoardDB() {
		System.out.println("단건조회");
		System.out.println("조회할 글 번호 : ");
		int DBNo = sc.nextInt();
		sc.nextLine();
		BoardDB bDB = new BoardDB();
		bDB = service.getBoardDb(DBNo);

		System.out.println(bDB);

	}

	public void getBoardDBList() {
		System.out.println("전체목록");
		List<BoardDB> list = service.getBoardDBList();

		for (BoardDB bb : list) {
			System.out.println(bb);
		}

	}

	public void writeBoard() {

		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요");
		String contents = sc.nextLine();

		BoardDB bDB = new BoardDB();
		bDB.setTitle(title);
		bDB.setContent(contents);
		bDB.setWriter(loginId);

		service.insertBoardDB(bDB);

		System.out.println("글을 작성했습니다.");

	}

	public void loginCheck() {
		String name = null;
		while (true) {
			System.out.println("id를 입력하세요");
			String id = sc.nextLine();
			System.out.println("password를 입력하세요");
			String passwd = sc.nextLine();
			name = service.loginCheck(id, passwd);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;
				break;
			} else {
				System.out.println("id와 password를 다시 입력하세요.");
			}

		}

	}
}
