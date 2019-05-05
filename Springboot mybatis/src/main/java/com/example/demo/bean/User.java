package com.example.demo.bean;

public class User {
    private Integer id;
    private String name;
    private Integer type;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(Integer type) {
    	this.type=type;
    }
    public Integer getType() {
    	return type;
    }
    public User(Integer id,String name,Integer type) {
    	this.id=id;
    	this.name=name;
    	this.type=type;
    }
}
