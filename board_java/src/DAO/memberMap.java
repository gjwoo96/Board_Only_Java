package DAO;

import java.util.HashMap;
import java.util.Map;

public class memberMap {
	
	public static Map<String, memberDAO> memberMap = new HashMap<String, memberDAO>();
	private static int user_idx = 0;
	
	public void setMembeMap(memberDAO mdao)throws Exception{
		memberDAO memberdao = new memberDAO();
		memberdao.setId(mdao.getId());
		memberdao.setPwd(mdao.getPwd());
		memberdao.setEmail(mdao.getEmail());
		memberdao.setBirth(mdao.getBirth());
		memberdao.setUser_idx(user_idx);
		user_idx ++;
		memberMap.put(memberdao.getId(), memberdao);
	}
	
	public memberDAO getMemberMap(String member_Id){
		memberDAO memberdao = new memberDAO();
		memberdao.setMemberData(memberMap.get(member_Id));
		return memberMap.get(member_Id);
	}
	
	public boolean checkMemberInfo(String memberId ,String pwd, String cate){
		
		boolean result = false;
		
		if(cate.equals("select")) {
			result = memberMap.containsKey(memberId);
		}else if(cate.equals("delete")) {
			memberDAO mdao = memberMap.get(memberId);
			if(mdao.getPwd().equals(pwd)) {
				memberMap.remove(memberId);
				System.out.println("해당 아이디가 삭제되엇습니다.");
				result = true;
			}else {
				System.out.println("입력하신 패스워드가 틀렸습니다.");
				result = false;
			}
		}
		
		return result;
	}
	
	
	
}
