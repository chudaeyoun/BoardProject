package com.multicampus.biz.user;

public class InsertUserTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setRole("Admin");
		vo.setName("¼Õ´Ô");
		vo.setPassword("test123");
		vo.setId("guest");
		userDAO.insertUser(vo);
		
		userDAO.getUserList();
		
/*		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "insert into users values(?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "guest");
			stmt.setString(2, "test123");
			stmt.setString(3, "¼Õ´Ô");
			stmt.setString(4, "Admin");
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}*/
	}
}
