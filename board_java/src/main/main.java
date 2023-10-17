package main;

import util.menuUtil;
import util.testUtil;
import util.textUtil;

public class main {
	
	public static textUtil txutil = new textUtil();
	public static menuUtil mutil = new menuUtil();
	public static testUtil testUtil = new testUtil();
	
	public static void main(String[] args) {
		
		//메뉴선택
		// 1.생성 2.조회 3.삭제 4.게시판 5.종료 
		
		while(true) {
			int select = txutil.menuSelect();
			
			if(select == 1) {
				//생성
				txutil.createIdMenu();
			}else if (select == 2) {
				//조회
				txutil.selectInfoMenu();
			}else if(select == 3 ) {
				//삭제
				txutil.selectInfoMenu();
			}else if(select == 4){
				//게시판 메뉴 이동
				txutil.enterBoardMenu();
			}else if(select == 99) {
				//테스트 계정생성(관리자)
				testUtil.createTestId();
			}else if (select == 6) {
				//전체 회원 조회(관리자)
				txutil.selectAllMemberInfo();
			}
			
			//메뉴종료
			if(select == 5) {
				break;
			}
			if(select == 999) {
				System.out.println("잘못된 메뉴를 입력하셧습니다. 다시 입력해주세요.");
			}
			
			//테스트
		}
	}

}
