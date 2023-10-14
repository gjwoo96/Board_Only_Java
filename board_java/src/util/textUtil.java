package util;

import java.util.Map;
import java.util.Scanner;

public class textUtil {
	
	private Scanner sc = new Scanner(System.in);
	public static menuUtil mutil = new menuUtil();
	public static configUtil cutil = new configUtil();
	
	public int menuSelect() {
		System.out.println("---------------------------------------------------------");
		System.out.println("이용하실 메뉴를 선택해주세요");
		System.out.println("계정생성시 '1'을 입력해주세요");
		System.out.println("계정조회시 '2'을 입력해주세요");
		System.out.println("계정삭제시 '3'을 입력해주세요");
		System.out.println("게시글 메뉴로 이동하실경우 '4'을 입력해주세요");
		System.out.println("메뉴를 종료하시려면 '5'을 입력해주세요");
		System.out.println("---------------------------------------------------------");
		String select_str = sc.nextLine();
		boolean typecheck = cutil.typeCheck(select_str);
		int select = -1;
		if(typecheck == true) {
			select = Integer.parseInt(select_str);
			if(select >  0  && select < 6) {
				System.out.println(select+"번을 선택하셧습니다.");
			}else {
				return 999;
			}
		}else {
			select = 999;
		}
		
		return select;
	}
	
	public void createIdMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("id,pwd,email,birth 순으로 입력하세요.");
		System.out.println("아래와 같은 양식으로 입력해주세요.");
		System.out.println("예) ID,패스워드(7자이상),xxx@xxx.xxx,yyyy-mm-dd");
		System.out.println("---------------------------------------------------------");
		try {
			mutil.createId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectInfoMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("조회하려는 아이디를 입력하세요.");
		System.out.println("---------------------------------------------------------");
		mutil.selectMemberInfo(sc.nextLine(),"","select");
	}
	public void deleteMemberInfoMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("삭제하려는 아이디를 입력하세요.");
		System.out.println("---------------------------------------------------------");
		mutil.deleteMemberCheckInfo(sc.nextLine());
			
	}

}
