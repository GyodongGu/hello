package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {

	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String loginCheck(String id, String pw) {
		String name = dao.getUserName(id, pw);
		return name;
	}

	@Override
	public void insertBoardDB(BoardDB board) {
		dao.insertBoard(board);

	}

	@Override
	public List<BoardDB> getBoardDBList() {
		List<BoardDB> list = dao.getBoardDBList();
		return list;
	}

	@Override
	public BoardDB getBoardDb(int boardNo) {
		BoardDB getBdb = dao.getBoardDb(boardNo);
		return getBdb;
	}

	@Override
	public void updateBoardDB(BoardDB board) {
		// 해당 글에 대한 관한 확인.
		if (dao.checkResponsibiltiy(board)) {
			dao.updateBoardDB(board);
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}
	}

	@Override
	public void deleteBoardDB(int boardNo) {
		dao.deleteBoardDB(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		List<BoardDB> list = dao.replyBoardDBList(boardNo);
		return list;
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.insertReplyBoardDB(board);

	}

}
