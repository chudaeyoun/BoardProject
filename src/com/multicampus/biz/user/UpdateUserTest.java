package com.multicampus.biz.user;

public class UpdateUserTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setRole("User");
		vo.setId("guest");
		userDAO.updateUser(vo);
		
		vo.setPassword("test123");
		userDAO.getUser(vo);
		
		
/*		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "update users set role=? where id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "User");
			stmt.setString(2, "guest");
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
