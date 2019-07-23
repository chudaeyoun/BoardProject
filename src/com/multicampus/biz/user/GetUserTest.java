package com.multicampus.biz.user;

public class GetUserTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		userDAO.getUser(vo);
		
/*		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "select * from users where id=? and password=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "aaa");
			stmt.setString(2, "aaa");
			rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.print(rs.getString("ID") + " : ");
				System.out.print(rs.getString("PASSWORD") + " : ");
				System.out.print(rs.getString("NAME") + " : ");
				System.out.println(rs.getString("ROLE"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}*/
	}
}
