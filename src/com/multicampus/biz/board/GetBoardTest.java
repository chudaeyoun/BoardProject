package com.multicampus.biz.board;

public class GetBoardTest {
	public static void main(String[] args) {
		// 1. DAO를 생성한다.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. 특정 게시글을 상세조회한다.
		BoardVO vo = new BoardVO();
		vo.setSeq(1);
		BoardVO board = boardDAO.getBoard(vo);
		System.out.println("번호 : " + board.getSeq());
		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		System.out.println("작성자 : " + board.getWriter());
		System.out.println("등록일 : " + board.getRegDate());
		System.out.println("주회수 : " + board.getCnt());
		
/*		if(board != null) {
			System.out.println(board.getSeq() + "번 게시글이 존재합니다.");
		} else {
			System.out.println("요청한 게시글이 존재하지 않습니다.");
		}*/
		
		
/*		// JDBC API 변수 선언
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 2. DBMS와 커넥션을 연결한다.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL 전달 객체) 생성
			String sql = "select * from board where seq=?";
			stmt = conn.prepareStatement(sql);
			
			// ?에 값 설정하기
			stmt.setInt(1, 1);
			
			// 4. SQL 전송
			rs = stmt.executeQuery();	
			
			// 5. 검색 결과 처리
			System.out.println("[ 게시글 상세 정보 ]");
			if(rs.next()) {
				System.out.println("번호 : " + rs.getInt("SEQ"));
				System.out.println("제목 : " + rs.getString("TITLE"));
				System.out.println("내용 : " + rs.getString("CONTENT"));
				System.out.println("작성자 : " + rs.getString("WRITER"));
				System.out.println("등록일 : " + rs.getDate("REGDATE"));
				System.out.println("주회수 : " + rs.getInt("CNT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 커넥션 연결 해제
			JDBCUtil.close(rs, stmt, conn);
		}*/
	}
}
