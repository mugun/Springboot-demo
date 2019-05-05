package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.boot.*;  
import org.springframework.boot.autoconfigure.*;  
import org.springframework.stereotype.*;  
import org.springframework.web.bind.annotation.*;

import com.example.demo.entry.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;  
  
@Controller  
@EnableAutoConfiguration  
public class SampleController {  
  
    @RequestMapping("/")  
    @ResponseBody  
    String home() {  
//        User user=new User();
//        Connection conn=user.getCon();
//        String sql="select * from user";
//        PreparedStatement pstmt;
//        StringBuffer result=new StringBuffer();
//        try {
//            pstmt = (PreparedStatement)conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            int col = rs.getMetaData().getColumnCount();
//            while(rs.next()) {
//            	for(int i=1;i<=col;i++) {
//            		result.append(rs.getString(i)+"\t");
//            	}
//            }
//        }catch(SQLException e) {
//        	e.printStackTrace();
//        }
//        return result.toString();
    	return "helloworld";
    }
  
//    public static void main(String[] args) throws Exception {  
//        SpringApplication.run(SampleController.class, args);  
//    }  
}  