package com.mvsoftech.edu.vo;

/** 
 * MemberVo
 * @author mjh
 * @since 2020.05.10
 */
public class MemberVo {
	private int idx;
	private String name;
	private int deptId;
	private String email;
	
	
	public MemberVo() {
		
	}
	
	public MemberVo(int idx,String name,int deptId,String email) {
		this.idx = idx;
		this.name = name;
		this.deptId = deptId;
		this.email = email;
		
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

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
}
