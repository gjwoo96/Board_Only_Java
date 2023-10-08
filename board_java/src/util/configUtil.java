package util;

import java.util.Map;
import java.util.regex.Pattern;

public class configUtil {
	
	public boolean checkInfoData(Map<String, Object> data) {
		boolean result = false;
		String express = "";
		int cnt = 0;
			//영문만 허용
			express = "^[\\w]*$";
			if(!Pattern.matches(express, data.get("id").toString())) {
				cnt++;
			}
			//7자 이상
			if(data.get("pwd").toString().length() > 7) {
				cnt++;
			}
			//이메일형식
			express = "^\\w+@\\w+\\.\\w+(\\.\\w+)?$";
			if(!Pattern.matches(express, data.get("email").toString())) {
				cnt++;
			}
			//생년월일(xxxx-xx-xx)
			express =  "^\\d{4}-\\d{2}-\\d{2}$";
			if(!Pattern.matches(express, data.get("birth").toString())) {
				cnt++;
			}
		
		if(cnt > 1) {
			result = true;
		}
		
		return result;
	}
	// 잘못된 메뉴 선택시 예외처리로 메뉴 재선택 가능하는 메소드
	public boolean typeCheck(String data) {
		boolean result = true;
		try {
			int select = Integer.parseInt(data);
		}catch(ClassCastException cce) {
			//형변환 에러시 타는 예외처리 부분
			result = false;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
	
	
	
}
