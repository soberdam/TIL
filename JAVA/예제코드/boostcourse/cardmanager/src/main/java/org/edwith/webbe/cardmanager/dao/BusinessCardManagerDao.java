package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.dto.BusinessCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardManagerDao {
	private static String dburl = "jdbc:mysql://localhost:3306/carddb?useSSL=false&serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
    public List<BusinessCard> searchBusinessCard(String keyword){
    	List<BusinessCard> bizCards = new ArrayList<>();
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	String sql = "SELECT * FROM businesscard where name like ? ";
    	
    	try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
    		PreparedStatement ps = conn.prepareStatement(sql)) {
    		ps.setString(1, '%' + keyword + '%');
    		try(ResultSet rs = ps.executeQuery()) {
    			
    			while(rs.next()) {
    				String name = rs.getString(1);
    				String phone = rs.getString(2);
    				String companyName = rs.getString(3);
    				BusinessCard bizcard = new BusinessCard(name, phone, companyName);
    				bizCards.add(bizcard);
    				
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	
    	return bizCards;
    }

    public BusinessCard addBusinessCard(BusinessCard businessCard){
    	int updatedNum=0;
    
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	String sql = "INSERT INTO businesscard(name, phone, companyName) VALUES (?,?,?)";
    		
    	try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
    		PreparedStatement ps = conn.prepareStatement(sql)) {
    		ps.setString(1, businessCard.getName());
    		ps.setString(2, businessCard.getPhone());
    		ps.setString(3, businessCard.getCompanyName());
    		updatedNum= ps.executeUpdate();
    } catch (Exception e) {
		e.printStackTrace();
	}
    	return businessCard;
    }
}
