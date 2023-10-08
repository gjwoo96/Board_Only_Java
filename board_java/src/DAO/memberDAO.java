package DAO;

public class memberDAO {
	static private int idx = 0;
	private String id;
	private String pwd;
	private String email;
	private String birth;

	public String id() {
		return this.id;
	}

	public String pwd() {
		return this.pwd;
	}

	public String email() {
		return this.email;
	}

	public String birth() {
		return this.birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public static int getIdx() {
		return idx;
	}

	public static void setIdx(int idx) {
		memberDAO.idx = idx;
	}

}
