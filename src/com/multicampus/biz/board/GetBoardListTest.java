package com.multicampus.biz.board;

import java.util.List;

public class GetBoardListTest {
	public static void main(String[] args) {
		// 1. DAO�� �����Ѵ�. 
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. �Խñ� ����� ����Ѵ�.
		List<BoardVO> boardList = boardDAO.getBoardList();
		System.out.println(boardList.size() + "�� �˻���");
		
/*		System.out.println("[ �Խñ� ��� ]");
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}*/
		
/*		// JDBC API ���� ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 2. DBMS�� Ŀ�ؼ��� �����Ѵ�.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL ���� ��ü) ����
			String sql = "select * from board order by seq asc";
			stmt = conn.prepareStatement(sql);
			
			// 4. SQL ����
			rs = stmt.executeQuery();	
			
			// 5. �˻� ��� ó��
			System.out.println("[ �Խñ� ��� ]");
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
			// 6. Ŀ�ؼ� ���� ����
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
