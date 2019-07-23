package com.multicampus.biz.board;

public class DeleteBoardTest {
	public static void main(String[] args) {
		// 1. DAO�� �����Ѵ�.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. �Խñ� ���� �Ŀ� �� ��� ������ ����Ѵ�. 
		BoardVO vo = new BoardVO();
		vo.setSeq(2);
		boardDAO.deleteBoard(vo);
		boardDAO.getBoardList();
		
		
		
/*		// JDBC API ���� ����
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 2. DBMS�� Ŀ�ؼ��� �����Ѵ�.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL ���� ��ü) ����
			String sql = "delete board where seq=?";
			stmt = conn.prepareStatement(sql);
			// ?�� �� �����ϱ�
			stmt.setInt(1, 9);
			
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
