package com.mvsoftech.edu.service;

import java.util.ArrayList;

import com.mvsoftech.edu.vo.MemberVo;

/** 
 * MemberService
 * @author mjh
 * @since 2022.05.10
 */
public interface MemberService {

	/** 
	 * 검색어 받아 해당하는 것을 찾는 메소드
	 * @param searchkeyword : 검색어
	 * @return 검색결과
	 */
	public ArrayList<MemberVo> searchMember(String searchkeyword);
	/** 
	 * 마이바티스 테스트용 메소드
	 * @return 현재시간
	 */
	public String test();
}
