package org.edwith.webbe.guestbook.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.edwith.webbe.guestbook.dto.Guestbook;

public class GuestbookDao {
	private static String dburl = "jdbc:mysql://localhost:3306/guestbook?useSSL=false&serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
    public List<Guestbook> getGuestbooks(){

    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
        List<Guestbook> list = new ArrayList<>();
        
        String sql = "SELECT * FROM guestbook ORDER BY regdate";
        
        try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
        		PreparedStatement ps = conn.prepareStatement(sql)) {
        	try(ResultSet rs = ps.executeQuery()) {
        		while(rs.next()) {
        			Long id = rs.getLong("id");
        			String name = rs.getString("name");
        			String content = rs.getString("content");
        			Date regdate = rs.getDate("regdate");
        			
        			Guestbook guestbook = new Guestbook(id, name, content, regdate);
        			list.add(guestbook);
        		}
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        }

        return list;
    }

    public void addGuestbook(Guestbook guestbook) {
        
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	String sql = "INSERT INTO guestbook(id,content,name,regdate) VALUES (id, ?, ?, now())";
    	try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
    			PreparedStatement ps = conn.prepareStatement(sql)) {
    			ps.setString(1,guestbook.getName());
    			ps.setString(2, guestbook.getContent());
    			ps.executeUpdate();
    			ps.close();
    			
    			
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    	
    }
}
