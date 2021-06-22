package com.javaex.ex01;

public class Member {

	private String id;
	private String name;
	private int point;
	
	public Member(String name,String id,int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("회원정보: "+name+"("+id+")"+", "+point+"점");
	}
}
