package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;


public class BoardProc {
	
	Scanner sc = new Scanner(System.in);
	
//	Board[] boardAry = new Board[10];	//db역할
	
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl();
	
//	BoardColletion service = new BoardCollectionImpl();
	
	BoardCollection service = new BoardCollectionImpl();
	
	
	
	public void execute() {
		while(true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1. 작성 | 2. 단건조회 | 3. 전체조회 | 4. 글삭제 | 5.게시글 수정 | 6. 종료");
			int menu = 0;
			try {
				menu = sc.nextInt();	//에러가 발생 가능한 곳.
				sc.nextLine();
			}catch(Exception e) {
				
				System.out.println("메뉴에 없는 번호입니다. 다시 선택해주세요");
				sc.nextLine();
			}
	
			
			if(menu == 1) {
				writeBoard();
			}else if(menu == 2) {
				getBoard();
			}else if(menu == 3) {
				getBoardList();
			}else if(menu == 4) {
				deleteBoard();
			}else if(menu == 5) {
				updateBoard();
			}else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		System.out.println("프로그램 종료.");
	}
	
	
	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글 번호입력.");
		try {
			int boardNo = sc.nextInt();sc.nextLine();
		
			System.out.println("제목을 입력하세요.");
			String title = sc.nextLine();
		
			System.out.println("내용을 입력하세요.");
			String contents = sc.nextLine();
			System.out.println("작성자 입력하세요.");
			String writer = sc.nextLine();
			//board class의 필드를 사용해서 인스턴스를 만들고
			//boardServiceImpl에서 method를 사용하기위해 인스턴스를 만들엇다.
			Board board = new Board(boardNo, title, contents, writer);
			BoardCollection service = new BoardCollectionImpl();	//interface service = new implement
		
//			service.writeBoard(board, boardAry);
			
			service.writeBoard(board, boardAry);
			
		}catch(Exception e) {
			System.out.println("잘못입력하셨습니다.");
			sc.nextLine();
		}
		
		
		
//		for(int i =0; i<boardAry.length; i++) {
//			if(boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}
		
	}
	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회할 번호를 입력");
		try {
			int boardNo = sc.nextInt();
		
			Board board = service.getBoard(boardNo, boardAry);
			System.out.println(board);
		}catch(Exception e) {
			System.out.println("잘못입력하셨습니다.");
			sc.nextLine();
		}
		
		
//		for(int i = 0; i<boardAry.length; i++) {
//			if(boardAry[i] !=null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + ","+ boardAry[i].getContents()+","+ boardAry[i].getWriter());
//			}
//		}
	}
	public void getBoardList() {
		System.out.println("전체글 조회");
		List<Board> resultAry = service.getBoardList(boardAry);
		for(int i =0; i<resultAry.size(); i++) {
			if(resultAry.get(i) != null) {
				System.out.println(resultAry.get(i));
			}
		}
		
		
//		for(int i=0; i<boardAry.length; i++) {
//			if(boardAry[i] != null) {
//				System.out.println(boardAry[i].getBoardNo()+","+boardAry[i].getTitle()+","+boardAry[i].getContents()+","+boardAry[i].getWriter());
//			}
//		}
	}
	
	public void deleteBoard() {
		System.out.println("삭제할 글 번호");
		try {
			int de = sc.nextInt();sc.nextLine();
		
			service.deleteBoard(de, boardAry);
			System.out.println(de+"번 글이 삭제되었습니다.");
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
			sc.nextLine();
		}
	}
	
	
	public void updateBoard() {
		System.out.println("변경할 번호");
		try {
			int boardNo = sc.nextInt();sc.nextLine();
			System.out.println("변경할 내용 : ");
		
			String content = sc.nextLine();
			Board board = new Board(boardNo, "", content, "");
			service.updateBoard(board, boardAry);
			System.out.println(boardNo+"번 글의 내용이 변경되었습니다.");
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
			sc.nextLine();
		}
	}

}
