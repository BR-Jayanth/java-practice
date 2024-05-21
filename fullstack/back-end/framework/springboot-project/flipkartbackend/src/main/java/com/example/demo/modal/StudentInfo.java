package com.example.demo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student-info")
public class StudentInfo {
	@Id
	private Integer no;
	private String name;
	private String chocolate;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChocolate() {
		return chocolate;
	}
	public void setChocolate(String chocolate) {
		this.chocolate = chocolate;
	}
	

}
