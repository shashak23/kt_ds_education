package contact;

// 연락처들의 정보
public class ContactVO {

	// 이름, 휴대전화, 이메일
	private String name;
	private int phone;
	private String email;
	
	public ContactVO(String name, int phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
