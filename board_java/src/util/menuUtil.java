package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import DAO.memberDAO;
import DAO.memberMap;

public class menuUtil {
	
	public static memberDAO mdao = new memberDAO();
	public static configUtil cUtil = new configUtil();
	public static memberMap mMap = new memberMap();
	private Scanner sc = new Scanner(System.in);
	
	public void createId() throws Exception {
		String info = sc.nextLine();
		String[] infoArry = info.split(",");
		if(infoArry.length < 4) {
			System.out.println("충분한 정보가 입력되지 않았습니다.");
			return;
		}else {
			Map<String, Object> infoMap = new HashMap<String, Object>();
			for(int i=0; i < infoArry.length; i++) {
				if(i == 0) {
					infoMap.put("id",infoArry[i]);
				}
				if(i == 1) {
					infoMap.put("pwd",infoArry[i]);
				}
				if(i == 2) {
					infoMap.put("email",infoArry[i]);
				}
				if(i == 3) {
					infoMap.put("birth",infoArry[i]);
				}
			}
			boolean check = false;
			check = cUtil.checkInfoData(infoMap);
			if(check == false) {
				for(int i=0; i < infoArry.length; i++) {
					if(i == 0) {
						mdao.setId(infoArry[i]);
					}
					if(i == 1) {
						mdao.setPwd(infoArry[i]);
					}
					if(i == 2) {
						mdao.setEmail(infoArry[i]);
					}
					if(i == 3) {
						mdao.setBirth(infoArry[i]);
					}
				}
				mMap.setMembeMap(mdao);
				System.out.println("입력하신"+mdao.getId()+"가 생성되었습니다.");
				//dao 초기화
				mdao.resetMemberDao(mdao);
			}else {
				System.out.println("입력하신 정보가 올바르지 않습니다.");
			}
		}
	}
	
	public memberDAO selectMemberInfo(String memberId,String pwd,String cate) {
		
		if(mMap.checkMemberInfo(memberId,pwd,cate)) {
			mdao =  mMap.getMemberMap(memberId);
		}else {
			System.out.println("입력하신 아이디로 조회되는 정보가 없습니다.");
		}
		return mdao; 
	}
	
	public void deleteMemberCheckInfo(String memberId) {
	
		if(mMap.checkMemberInfo(memberId,"","select")) {
			System.out.println("---------------------------------------------------------");
			System.out.println("아이디가 확인되었습니다, 삭제하려는계정의 비밀번호를 입력해주세요.");
			System.out.println("---------------------------------------------------------");
			if(mMap.checkMemberInfo(memberId,sc.nextLine(),"delete")) {
				System.out.println("---------------------------------------------------------");
				System.out.println(memberId+"가 삭제되었습니다");
				System.out.println("---------------------------------------------------------");
			}else {
				System.out.println("---------------------------------------------------------");
				System.out.println("패스워드가 틀립니다.");
				System.out.println("---------------------------------------------------------");
			}
		}
	
	}
	public boolean deleteMemberInfo(String memberId,String pwd) {
		boolean result = true;
		//if(mMap.check)
		return result;
	}
	
}
