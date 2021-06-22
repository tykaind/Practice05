package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member mem_1 = new Member("정우성","jws",50000);
		Member mem_2 = new Member("유재석","yjs",30000);
		Member mem_3 = new Member("이효리","lhr",40000);
		
		mem_1.showInfo();
		mem_2.showInfo();
		mem_3.showInfo();
		
	}

}
