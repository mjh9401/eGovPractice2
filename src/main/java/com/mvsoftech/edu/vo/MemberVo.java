package com.mvsoftech.edu.vo;

import java.util.ArrayList;

/** 
 * MemberVo
 * @author mjh
 * @since 2020.05.10
 */
public class MemberVo {
	private int idx;
	private String name;
	private String address;
	private String email;
	private String tel;
	ArrayList<MemberVo> members = new ArrayList<>();
	
	public MemberVo() {
		
	}
	
	public MemberVo(int idx,String name,String address,String email,String tel) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.email = email;
		this.tel = tel;
	}
		
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	/* 테스트용 더미데이터*/
	public ArrayList<MemberVo> memberLists() {
		members.add(new MemberVo(1,"짱구","서울특별시","jjangu@gmail.com","010-8959-8888"));
		members.add(new MemberVo(2,"철수","서울특별시","iron@naver.com","010-1414-5741"));
		members.add(new MemberVo(3,"맹구","서울특별시","mangu@gmail.com","010-1122-8421"));
		members.add(new MemberVo(4,"훈이","서울특별시","hun@gmail.com","010-4753-1288"));
		members.add(new MemberVo(5,"유리","서울특별시","yuri@gmail.com","010-1698-4465"));
		
		return members;
	}
	
}
