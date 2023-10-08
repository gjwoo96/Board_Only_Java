package DAO;

import java.util.HashMap;
import java.util.Map;

public class memberMap {
	
	public static Map<String, memberDAO> memberMap = new HashMap<String, memberDAO>();
	private static int user_idx = 0;
	
	public void setMembeMap(memberDAO mdao)throws Exception{
		mdao.setUser_idx(user_idx);
		user_idx ++;
		memberMap.put(mdao.getId(), mdao);
	}
	
	public memberDAO getMemberMap(String member_Id){
		System.out.println("select member"+ memberMap.get(member_Id));
		return memberMap.get(member_Id);
	}
	
	public boolean checkMemberInfo(String member_Id){
		
		return memberMap.containsKey(member_Id);
	}
	
	
}
