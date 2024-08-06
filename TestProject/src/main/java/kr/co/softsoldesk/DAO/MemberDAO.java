package kr.co.softsoldesk.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.MemberBean;
import kr.co.softsoldesk.mapper.MemberMapper;

@Repository
public class MemberDAO {
	
	@Autowired
	MemberMapper memberMapper;
	
	public void addMember(MemberBean memberBean) {
		
		memberMapper.addMember(memberBean);
	}
	

}
