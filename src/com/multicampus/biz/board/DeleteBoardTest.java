package com.multicampus.biz.board;

public class DeleteBoardTest {
	public static void main(String[] args) {
		// 1. DAO를 생성한다.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. 게시글 삭제 후에 글 목록 정보를 출력한다. 
		BoardVO vo = new BoardVO();
		vo.setSeq(2);
		boardDAO.deleteBoard(vo);
		boardDAO.getBoardList();
		
		
		
/*		// JDBC API 변수 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 2. DBMS와 커넥션을 연결한다.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL 전달 객체) 생성
			String sql = "delete board where seq=?";
			stmt = conn.prepareStatement(sql);
			// ?에 값 설정하기
			stmt.setInt(1, 9);
			
			// 4. SQL 전송
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "건 처리 성공!!!");			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 커넥션 연결 해제
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
