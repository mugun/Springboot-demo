package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.User;
import com.example.demo.dao.*;
import com.example.demo.service.UserService;

@Controller
@EnableAutoConfiguration
public class mybatisController {
	@Autowired
	private UserDao userdao;
	@RequestMapping(value="/all",method=(RequestMethod.GET) )
    @ResponseBody 
	public List<User> SelectID() {
		//Integer one=new Integer(1);
		List<User> u= userdao.getAll();
		return u;
	}
	@RequestMapping(value="/id",method=(RequestMethod.POST))
	@ResponseBody
	public User SelectId(@RequestParam("id") Integer id) {
		User u=userdao.getById(id);
		return u;
	}
	@RequestMapping(value="/name",method=(RequestMethod.POST))
	@ResponseBody
	public User SelectName(@RequestParam("name") String name) {
		return userdao.getByName(name);
	}
	@RequestMapping(value="/insert",method=(RequestMethod.POST))
	@ResponseBody
	public int insertUser(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("type") Integer type) {
		User u=new User(id,name,type);
		userdao.insertUser(u);
		return 1;
	}
	@RequestMapping(value="/update",method=(RequestMethod.POST))
	@ResponseBody
	public int updateUser(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("type") Integer type) {
		User u=new User(id,name,type);
		userdao.updateUser(u);
		return 1;
	}
	
	@RequestMapping(value="/delete",method=(RequestMethod.POST))
	@ResponseBody
	public int deleteUser(@RequestParam("id") Integer id) {
		userdao.deleteUser(id);
		return 1;
	}
}
