package SmartPhone;

public class Addr {

	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String group;
	
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
	
	
	
	
}
