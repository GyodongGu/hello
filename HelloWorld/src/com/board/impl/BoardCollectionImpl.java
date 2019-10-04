package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection{

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		// TODO Auto-generated method stub
		
		
//		for(int i = 0; i<boards.size(); i++) {
//			if(boards.get(i) == null) {
//				boards.set(i, board);
//				break;
//			}
			boards.add(board);
//		}
		
	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		// TODO Auto-generated method stub
		Board board = null;
		for(int i =0; i<boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				board = boards.get(i);
			}
		}
		return board;
	}


	@Override
	public List<Board> getBoardList(List<Board> boards) {
		// TODO Auto-generated method stub
		
//		Board[] boardAry = new Board[boards.size()];
//		for(int i = 0; i<boardAry.length; i++) {
//			boardAry[i] = boards.get(i);
//		}
//		return boardAry;
		List<Board> list = new ArrayList<>();
		for(int i =0; i<list.size(); i++) {
			list.add(i, boards.get(i));
		}
		return list;
	}

	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		// TODO Auto-generated method stub
		for(int i = 0; i<boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				boards.remove(i);
			}
		}

		
	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<boards.size(); i++) {
			if(boards.get(i).getBoardNo()==board.getBoardNo()) {
				//boards[i].setContents(board.getContents());
				//boards.set(i, board.getContents());
				boards.set(i, board);
				
			}
		}
		
		
	}

	

}
