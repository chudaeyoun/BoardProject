package com.multicampus.biz.user;

public class DeleteUserTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setId("guest");
		userDAO.deleteUser(vo);
		
		userDAO.getUserList();
		
/*		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "delete users where id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "guest");
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
