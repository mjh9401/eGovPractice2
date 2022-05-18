package com.mvsoftech.edu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mvsoftech.edu.vo.MemberVo;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/** 
 * MebmerDAO
 * @author mjh
 * @since 2022.05.12
 */
@Mapper("memberDao")
public interface MemberDAO {
	/** 
	 * DB에서 SQL로 현재시간을 찾는 메소드
	 * @return 현재시간
	 */
	@Select("SELECT NOW();")
	public String selectTime();
	
	/** 
	 * DB에 있는 직원정보 찾는 메소드
	 * @return 직원정보
	 */
	public MemberVo getMember(@Param("name")String name);
	
}
