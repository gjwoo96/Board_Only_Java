package util;

import DAO.memberDAO;
import DAO.memberMap;

public class testUtil {
	public static memberMap mMap = new memberMap();
	private static int testIndex = 0;
	
	public void createTestId () {
		memberDAO mDao = new memberDAO();
		mDao.setId("gjwoo96"+testIndex);
		mDao.setPwd("12345678");
		mDao.setEmail("gjwoo96"+testIndex+"@naver.com");
		mDao.setBirth("1996-01-01");
		
		System.out.println("테스트계정: "+mDao.getId()+" 생성 완료");
		testIndex++;
		
		try {
			mMap.setMembeMap(mDao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
