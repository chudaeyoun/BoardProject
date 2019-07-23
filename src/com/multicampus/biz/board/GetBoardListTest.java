package com.multicampus.biz.board;

import java.util.List;

public class GetBoardListTest {
	public static void main(String[] args) {
		// 1. DAO를 생성한다. 
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. 게시글 목록을 출력한다.
		List<BoardVO> boardList = boardDAO.getBoardList();
		System.out.println(boardList.size() + "건 검색됨");
		
/*		System.out.println("[ 게시글 목록 ]");
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}*/
		
/*		// JDBC API 변수 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 2. DBMS와 커넥션을 연결한다.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL 전달 객체) 생성
			String sql = "select * from board order by seq asc";
			stmt = conn.prepareStatement(sql);
			
			// 4. SQL 전송
			rs = stmt.executeQuery();	
			
			// 5. 검색 결과 처리
			System.out.println("[ 게시글 목록 ]");
			while(rs.next()) {
				System.out.print(rs.getInt("SEQ") + " : ");
				System.out.print(rs.getString("TITLE") + " : ");
				System.out.print(rs.getString("WRITER") + " : ");
				System.out.print(rs.getString("CONTENT") + " : ");
				System.out.print(rs.getDate("REGDATE") + " : ");
				System.out.println(rs.getInt("CNT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 커넥션 연결 해제
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
