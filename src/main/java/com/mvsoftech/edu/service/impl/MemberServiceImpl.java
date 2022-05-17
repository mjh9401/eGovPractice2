package com.mvsoftech.edu.service.impl;

import java.util.ArrayList;

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
	
	@Override
	public ArrayList<MemberVo> searchMember(String searchKeyWord) {
		ArrayList<MemberVo> members = new ArrayList<>();
		members = new MemberVo().memberLists();
		ArrayList<MemberVo> searchMember = new ArrayList<>();
						
		for(MemberVo member : members) {			
			String memberName = member.getName();
			String memberAddress = member.getAddress();
			String memberEmadil = member.getEmail();
			String memberTel = member.getTel();
			
			if(memberName.contains(searchKeyWord)) {
				searchMember.add(member);
			} else if(memberAddress.contains(searchKeyWord)) {
				searchMember.add(member);
			} else if (memberEmadil.contains(searchKeyWord)) {
				searchMember.add(member);
			} else if (memberTel.contains(searchKeyWord)) {
				searchMember.add(member);
			}
			
		}
		
		return searchMember;
	}
	
	/** 
	 * 마이바티스 테스용 메소드
	 */
	@Override
	public String test() {
		return memberDao.getTime();
	}

	

}
