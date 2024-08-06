package kr.co.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.co.softsoldesk.beans.MemberBean;

public interface MemberMapper{
	
	@Insert("insert into member values(user_seq.nextval, #{user_name}, #{user_pass})")
	void addMember(MemberBean memberBean);
	

}
