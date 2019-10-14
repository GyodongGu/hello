package com.board.model;

import java.util.List;

public interface BoardDBService {
	public String loginCheck(String id, String pw);	//로그인
	public void insertBoardDB(BoardDB board);	//게시글 작성
	public List<BoardDB> getBoardDBList();	//게시글 전체 리스트 조회
	public BoardDB getBoardDb(int boardNo);	//게시글 한건 조회
	public void updateBoardDB(BoardDB board);	//게시글 수정
	public void deleteBoardDB(int boardNo);	//게시글 삭제
	
	public List<BoardDB> getReply(int boardNo);	//해당 게시글 댓글목록 조회
	public void insertReply(BoardDB board);	//댓글작성
	
}
