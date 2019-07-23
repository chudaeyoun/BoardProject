package com.multicampus.biz.board;

public class InsertBoardTest {
	public static void main(String[] args) {
		// 1. DAO�� �����Ѵ�.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. �Խñ� ��� �Ŀ� �� ��� ������ ����Ѵ�.
		BoardVO vo = new BoardVO();
		vo.setContent("���� �׽�Ʈ�Դϴ�...");
		vo.setTitle("���� �׽�Ʈ");
		vo.setWriter("�׽���");		
		
		boardDAO.insertBoard(vo);
		boardDAO.getBoardList();
		
		
		
/*		// JDBC API ���� ����
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 2. DBMS�� Ŀ�ؼ��� �����Ѵ�.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL ���� ��ü) ����
			String sql = "insert into board(seq, title, writer, content) " + 
		                 "values((select nvl(max(seq), 0) + 1 from board), ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			// ?�� �� �����ϱ�
			stmt.setString(1, "JDBC �׽�Ʈ");
			stmt.setString(2, "ä����");
			stmt.setString(3, "�� ��ϵǰ���...");
			
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
