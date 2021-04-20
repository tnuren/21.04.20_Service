package day16;

public class MemberDTO {
private	String id;
private	String pw;
private	String name;
private	String number;
	
	MemberDTO(){
		
	}
	
	public MemberDTO(String id, String pw, String name, String number) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", number=" + number + "]";
	}
	
	
	
	
}
