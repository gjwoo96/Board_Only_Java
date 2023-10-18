package DAO;

import java.util.HashMap;
import java.util.Map;

public class BoardMap {
	
	private static int board_idx = 0;
	private static Map<String, boardDAO> boardMap = new HashMap<String, boardDAO>();
	
	public void setBoadInfo(boardDAO boardDao) {
		String mapIdx = Integer.toString(board_idx);
		boardMap.put(mapIdx, boardDao);
		System.out.println("boardMap_check: "+ boardMap);
	}
	
}

