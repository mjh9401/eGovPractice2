package com.mvsoftech.edu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvsoftech.edu.dao.MemberDAO;
import com.mvsoftech.edu.service.MemberService;
import com.mvsoftech.edu.vo.MemberVo;

/** 
 * @author mjh
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Resource(name="memberDao")
	private MemberDAO memberDao;
	
	
	/** 
	 * 마이바티스 테스용 메소드
	 */
	@Override
	public MemberVo test() {
		String name = null;
		return memberDao.getMember(name);
	}

	

}
