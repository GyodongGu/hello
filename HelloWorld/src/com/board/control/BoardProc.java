package com.board.control;

import java.util.Scanner;

import com.board.model.Board;

public class BoardProc {
	
	Scanner sc = new Scanner(System.in);
	
	Board[] boardAry = new Board[10];
	
	public void execute() {
		while(true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1. 작성 | 2. 단건조회 | 3. 전체조회 | 4. 종료");
			int menu = sc.nextInt();sc.nextLine();
			if(menu == 1) {
				writeBoard();
			}else if(menu == 2) {
				getBoard();
			}else if(menu == 3) {
				getBoardList();
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		System.out.println("프로그램 종료.");
	}
	
	
	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글 번호입력.");
		int boardNo = sc.nextInt();sc.nextLine();
		
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		
		Board board = new Board(boardNo, title, contents, writer);
		for(int i =0; i<boardAry.length; i++) {
			if(boardAry[i] == null) {
				boardAry[i] = board;
				break;
			}
		}
		
	}
	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회할 번호를 입력");
		int boardNo = sc.nextInt();
		for(int i = 0; i<boardAry.length; i++) {
			if(boardAry[i] !=null && boardAry[i].getBoardNo() == boardNo) {
				System.out.println(boardAry[i].getTitle() + ","+ boardAry[i].getContents()+","+ boardAry[i].getWriter());
			}
		}
	}
	public void getBoardList() {
		System.out.println("전체글 조회");
		for(int i=0; i<boardAry.length; i++) {
			if(boardAry[i] != null) {
				System.out.println(boardAry[i].getBoardNo()+","+boardAry[i].getTitle()+","+boardAry[i].getContents()+","+boardAry[i].getWriter());
			}
		}
	}

}
