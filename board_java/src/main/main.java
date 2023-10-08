package main;

import util.menuUtil;
import util.textUtil;

public class main {
	public static textUtil txutil = new textUtil();
	public static menuUtil mutil = new menuUtil();
	
	public static void main(String[] args) {
		while(true) {
			int select = txutil.menuSelect();
			//계정생성
			if(select == 1) {
				txutil.createIdMenu();
			}
			//메뉴종료
			if(select == 5) {
				break;
			}
			if(select == 999) {
				System.out.println("잘못된 메뉴를 입력하셧습니다. 다시 입력해주세요.");
			}
			
			
		}
	}

}
