package ssss;

public class MemberVO {
	private String id;
	private String name;
	private String pass;
	private String addr;
	private String joinday;

	public MemberVO(String id, String name, String pass, String addr, String joinday) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.addr = addr;
		this.joinday = joinday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJoinday() {
		return joinday;
	}

	public void setJoinday(String joinday) {
		this.joinday = joinday;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", pass=" + pass + ", addr=" + addr + ", joinday=" + joinday
				+ "]";
	}

}
