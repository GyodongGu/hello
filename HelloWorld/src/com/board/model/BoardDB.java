package com.board.model;

public class BoardDB {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String creationdate;
	private int origNo;
	
	public BoardDB() {		//기본 생성자
		
	}
	
	//생성자(매개값)
	public BoardDB(int boardNo, String title, String content, String writer, String creationdate, int origNo) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creationdate = creationdate;
		this.origNo = origNo;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public int getOrigNo() {
		return origNo;
	}

	public void setOrigNo(int origNo) {
		this.origNo = origNo;
	}

	@Override
	public String toString() {
		return "BoardDB [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", creationdate=" + creationdate + ", origNo=" + origNo + "]";
	}
	


}
