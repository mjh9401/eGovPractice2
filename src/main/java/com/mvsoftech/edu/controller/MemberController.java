package com.mvsoftech.edu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvsoftech.edu.service.MemberService;
import com.mvsoftech.edu.vo.MemberVo;


/** 
 * MemberController
 * @author mjh
 * @since 2022.05.10
 */
@Controller
public class MemberController {
	/**MemberService*/
	@Resource(name="memberService")
	private MemberService memberService;
	

	
	/** 
	 * 마이바이스 테스용 메소드
	 */
	@RequestMapping("test.do")
	public void test() {
		//String time = memberService.test();
		MemberVo member = memberService.test();
		//System.out.println("시간 : "+time);
		System.out.println("상태 : "+member);
		
	}
	
	
	/** 
	 * 검색어 요청처리
	 * @return view
	 */
	@RequestMapping("searchMember.do")
	public String serachMember() {
		
		return "member/searchMember";
	}
	
	/** 
	 * 검색수행 요청처리
	 * @param searchKeyWord : 검색어
	 * @param model : 모델
	 * @return view
	 */
	@RequestMapping("actionSearchMember.do")
	public String actinoSerachMember(String searchKeyWord,Model model) {
		//List<MemberVo> members = memberService.searchMember(searchKeyWord);		
		//model.addAttribute("members", members);
		
		return "member/list";
	}
	
}
