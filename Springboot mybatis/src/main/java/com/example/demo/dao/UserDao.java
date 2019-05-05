package com.example.demo.dao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.bean.User;
@Repository
public interface UserDao {
	User getById(Integer id);
	User getByName(String name);
	List<User> getAll();
	int insertUser(User user);
	int deleteUser(Integer id);
	int updateUser(User user);
}
