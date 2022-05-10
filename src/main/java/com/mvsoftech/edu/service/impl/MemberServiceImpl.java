package com.mvsoftech.edu.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mvsoftech.edu.service.MemberService;
import com.mvsoftech.edu.vo.MemberVo;


@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
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

}
