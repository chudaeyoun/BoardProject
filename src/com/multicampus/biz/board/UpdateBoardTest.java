package com.multicampus.biz.board;

public class UpdateBoardTest {
	public static void main(String[] args) {
		// 1. DAO�� �����Ѵ�.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. �Խñ� ���� �Ŀ� �� �� ������ ����Ѵ�. 
		BoardVO vo = new BoardVO();
		vo.setTitle("== ���� ���� ==");
		vo.setContent("== ���� ���� ==");
		vo.setSeq(2);
		
		boardDAO.updateBoard(vo);
		boardDAO.getBoard(vo);
		
		
		
/*		// JDBC API ���� ����
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 2. DBMS�� Ŀ�ؼ��� �����Ѵ�.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL ���� ��ü) ����
			String sql = "update board set title=?, content=? where seq=?";
			stmt = conn.prepareStatement(sql);
			// ?�� �� �����ϱ�
			stmt.setString(1, "<���� ����>");
			stmt.setString(2, "<���� ����>");
			stmt.setInt(3, 7);
			
			// 4. SQL ����
			int cnt = stmt.executeUpdate();
			System.out.println(cnt + "�� ó�� ����!!!");			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. Ŀ�ؼ� ���� ����
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
