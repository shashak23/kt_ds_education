package com.naver.bbs.management;

import com.naver.member.management.Member;

public class Article {

	public static void main(String[] args) {
		Member member = new Member("ID", "관리자");
		member.setId("siha");
		
		System.out.println(member);
		System.out.println(member.getId());
		System.out.println(member.getName());

		//member.printHello(); // 그냥은 못 써요
		 
	}
}
