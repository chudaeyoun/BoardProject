package com.multicampus.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.multicampus.biz.common.JDBCUtil;

// DAO(Data Access Object) 클래스 
public class UserDAO {
	// JDBC 관련 변수
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	// BOARD 관련 SQL 명령어
	private final String USER_INSERT = "insert into users values(?, ?, ?, ?)";
	private final String USER_UPDATE = "update users set role=? where id=?";
	private final String USER_DELETE = "delete users where id=?";
	private final String USER_GET    = "select * from users where id=? and password=?";
	private final String USER_LIST   = "select * from users order by name asc";
	
	// USERS 테이블과 관련된 CRUD 메소드
	// 회원 등록
	public void insertUser(UserVO vo) {
		System.out.println("===> JDBC 기반으로 insertUser() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_INSERT);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 회원 수정
	public void updateUser(UserVO vo) {
		System.out.println("===> JDBC 기반으로 updateUser() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_UPDATE);
			stmt.setString(1, vo.getRole());
			stmt.setString(2, vo.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 회원 삭제
	public void deleteUser(UserVO vo) {
		System.out.println("===> JDBC 기반으로 deleteUser() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_DELETE);
			stmt.setString(1, vo.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
	// 회원 상세 조회
	public void getUser(UserVO vo) {
		System.out.println("===> JDBC 기반으로 getUser() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
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
		}
	}
	
	// 회원 목록 검색
	public void getUserList() {
		System.out.println("===> JDBC 기반으로 getUserList() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_LIST);
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
		}
	}

}
