package SmartPhoneExt;

public class Addr implements ShowData {


	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String group;

	Addr() {}
	
	Addr(String name, String phoneNumber, String email, String address, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.group = group;				
	}
	
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
		
	/* 파라미터를 객체 주소로 받아 객체 주소의 각 정보를 배열에 저장 */	

	public void printInfo() {
		
		System.out.printf("이름: %s \n", this.name);
		System.out.printf("전화번호: %s \n", this.phoneNumber);
		System.out.printf("이메일: %s \n", this.email);
		System.out.printf("주소: %s \n", this.address);
		System.out.printf("그룹: %s \n", this.group);
		
	}
	
	@Override
	public void showData() {
		
		System.out.printf("이름: %s \n", this.name);
		System.out.printf("전화번호: %s \n", this.phoneNumber);
		
	}

}
