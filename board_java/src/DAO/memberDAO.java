package DAO;

public class memberDAO {
	private int user_idx;
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

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	@Override
	public String toString() {
		return "memberDAO [user_idx=" + user_idx + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", birth="
				+ birth + "]";
	}
	
	public void resetMemberDao(memberDAO mdao) {
		mdao.setId("");
		mdao.setPwd("");
		mdao.setEmail("");
		mdao.setBirth("");
	}
	
}
