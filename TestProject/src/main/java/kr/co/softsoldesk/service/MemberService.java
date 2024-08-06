package kr.co.softsoldesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softsoldesk.DAO.MemberDAO;
import kr.co.softsoldesk.beans.MemberBean;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memeberDAO;
	
	public void test() {
		
		System.out.println("테스트");
	}
	
	public void addMember(MemberBean memberBean) {
		
		System.out.println("hello");
		memeberDAO.addMember(memberBean);
		System.out.println("안녕하세요");
		
	}


}
