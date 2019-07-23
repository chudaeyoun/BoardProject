package com.multicampus.biz.board;

public class UpdateBoardTest {
	public static void main(String[] args) {
		// 1. DAO를 생성한다.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. 게시글 수정 후에 글 상세 정보를 출력한다. 
		BoardVO vo = new BoardVO();
		vo.setTitle("== 수정 제목 ==");
		vo.setContent("== 수정 내용 ==");
		vo.setSeq(2);
		
		boardDAO.updateBoard(vo);
		boardDAO.getBoard(vo);
		
		
		
/*		// JDBC API 변수 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 2. DBMS와 커넥션을 연결한다.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL 전달 객체) 생성
			String sql = "update board set title=?, content=? where seq=?";
			stmt = conn.prepareStatement(sql);
			// ?에 값 설정하기
			stmt.setString(1, "<수정 제목>");
			stmt.setString(2, "<수정 내용>");
			stmt.setInt(3, 7);
			
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
