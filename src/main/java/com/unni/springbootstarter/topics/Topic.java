package com.unni.springbootstarter.topics;

public class Topic {

	private String id;
	private String desc;
	private String name;
	
	public Topic() {
	
	}
	
	
	public Topic(String id, String desc, String name) {
		super();
		this.id = id;
		this.desc = desc;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
