package com.multicampus.biz.board;

public class GetBoardTest {
	public static void main(String[] args) {
		// 1. DAO�� �����Ѵ�.
		BoardDAO boardDAO = new BoardDAO();
		
		// 2. Ư�� �Խñ��� ����ȸ�Ѵ�.
		BoardVO vo = new BoardVO();
		vo.setSeq(1);
		BoardVO board = boardDAO.getBoard(vo);
		System.out.println("��ȣ : " + board.getSeq());
		System.out.println("���� : " + board.getTitle());
		System.out.println("���� : " + board.getContent());
		System.out.println("�ۼ��� : " + board.getWriter());
		System.out.println("����� : " + board.getRegDate());
		System.out.println("��ȸ�� : " + board.getCnt());
		
/*		if(board != null) {
			System.out.println(board.getSeq() + "�� �Խñ��� �����մϴ�.");
		} else {
			System.out.println("��û�� �Խñ��� �������� �ʽ��ϴ�.");
		}*/
		
		
/*		// JDBC API ���� ����
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 2. DBMS�� Ŀ�ؼ��� �����Ѵ�.
			conn = JDBCUtil.getConnection();
			
			// 3. Statement(SQL ���� ��ü) ����
			String sql = "select * from board where seq=?";
			stmt = conn.prepareStatement(sql);
			
			// ?�� �� �����ϱ�
			stmt.setInt(1, 1);
			
			// 4. SQL ����
			rs = stmt.executeQuery();	
			
			// 5. �˻� ��� ó��
			System.out.println("[ �Խñ� �� ���� ]");
			if(rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("SEQ"));
				System.out.println("���� : " + rs.getString("TITLE"));
				System.out.println("���� : " + rs.getString("CONTENT"));
				System.out.println("�ۼ��� : " + rs.getString("WRITER"));
				System.out.println("����� : " + rs.getDate("REGDATE"));
				System.out.println("��ȸ�� : " + rs.getInt("CNT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. Ŀ�ؼ� ���� ����
			JDBCUtil.close(rs, stmt, conn);
		}*/
	}
}
