package com.multicampus.biz.user;

import java.util.List;

import com.multicampus.biz.board.BoardVO;

public class GetUserListTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		List<UserVO> userList = userDAO.getUserList();
		
		System.out.println(userList.size() + "°Ç °Ë»öµÊ");
		
		
		
		
/*		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "select * from users order by name asc";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
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
