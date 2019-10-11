package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {

	Connection conn = null;		
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	//답글 리스트 조회
	public List<BoardDB> replyBoardDBList(int boardNo) {
		conn = DAO.getConnect();	//DB와 연결하는 작업(DAO.java에 연결하는 세부사항이 있습니다.)
		List<BoardDB> list = new ArrayList<>();	//한칸에 BoardDB타입의 데이터를 담을수 있는 ArrayList를 생성합니다.
		String sql = "select * from boards where orig_no = ?";	//실행하고자 하는 sql문을 작성합니다.
		BoardDB board = null;	//ArrayList에 담고자 하는 BoardDB 타입의 변수를 생성해줍니다.

		try {
			pstmt = conn.prepareStatement(sql);	//위의 sql문으로 데이터베이스에 접근 합니다.
			pstmt.setInt(1, boardNo);	//sql문에 있는 ?에 값을 삽입합니다.(데이터 타입에 맞게)
			rs = pstmt.executeQuery();	//완성된 sql문을 실행합니다.

			while (rs.next()) {		//sql문을 실행한 결과는 rs에 보관이 됩니다.
				board = new BoardDB();	//위에서 만들었던 BoardDb타입의 변수의 인스턴스를 생성합니다.
				board.setBoardNo(rs.getInt("board_no"));	//인스턴스에 각각의 값을 입력합니다.
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationdate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

				list.add(board);	//입력해서 만들었는 BoardDb타입의 데이터를 미리 만들어놓은 ArrayList에 삽입합니다.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();		//db와 연결했던 작업을 이제 종료합니다.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;	//만든 ArrayList를 반환합니다.
	}
	//답글 작성
	public void insertReplyBoardDB(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values ((select nvl(max(board_no),0)+1 from boards), ?, ?, ?, sysdate, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getOrigNo());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건의 답글이 작성되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//게시글 삭제
	public void deleteBoardDB(int boardNo) {
		conn = DAO.getConnect();
		String sql = "delete from boards where board_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);

			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//게시글 수정
	public void updateBoardDB(BoardDB board) {
		conn = DAO.getConnect();

		String sql = "update boards set title = ?, content = ? where board_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getBoardNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 업데이트 되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//특정 게시글 불러오기
	public BoardDB getBoardDb(int boardNo) {
		conn = DAO.getConnect();
		BoardDB board = null;

		String sql = "select * from boards where board_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationdate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return board;
	}
	//게시글 전체 리스트
	public List<BoardDB> getBoardDBList() {
		conn = DAO.getConnect();
		List<BoardDB> list = new ArrayList<>();

		String sql = "select * from boards";
		BoardDB board = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationdate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

				list.add(board);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}
	//게시글 삽입
	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values ((select nvl(max(board_no),0)+1 from boards), ?, ?, ?, sysdate, null)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());

			int r = pstmt.executeUpdate();
			System.out.println(r + "건 작성하였습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//로그인
	public String getUserName(String id, String pass) {
		conn = DAO.getConnect();
		String sql = "select * from user_login where id = ? and passwd = ?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("name");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return name;
	}

}
