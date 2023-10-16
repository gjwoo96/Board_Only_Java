package DAO;

public class boardDAO {
	
	//게시글
	private int board_Idx;
	//제목
	private String title;
	//내용
	private String content;
	//작성자
	private String writer;
	//게시글 패스워드
	private String board_Pwd;
	//작성일자
	private String wirteDate;
	//수정일자
	private String updateDate;
	public int getBoard_Idx() {
		return board_Idx;
	}
	public void setBoard_Idx(int board_Idx) {
		this.board_Idx = board_Idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBoard_Pwd() {
		return board_Pwd;
	}
	public void setBoard_Pwd(String board_Pwd) {
		this.board_Pwd = board_Pwd;
	}
	public String getWirteDate() {
		return wirteDate;
	}
	public void setWirteDate(String wirteDate) {
		this.wirteDate = wirteDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "boardDAO [board_Idx=" + board_Idx + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", board_Pwd=" + board_Pwd + ", wirteDate=" + wirteDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
