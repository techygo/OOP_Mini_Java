package SmartPhone;

public class CustomerAddr extends Addr {

	private String birthday;
	private String customerName;
	private String item;
	private String grade;
	
	CustomerAddr() {}
	
	CustomerAddr(String name, String phoneNumber, String email, String address, String group, String birthday, String customerName, String item, String grade) {
		super(name, phoneNumber, email, address, group);
		this.birthday = birthday;
		this.customerName = customerName;
		this.item = item;
		this.grade = grade;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public String getItem() {
		return item;
	}
	
	public String getGrade() {
		return grade;
	}
	

	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("생일: %s \n", this.birthday);
		System.out.printf("회사이름: %s \n", this.customerName);
		System.out.printf("부서이름: %s \n", this.item);
		System.out.printf("직급: %s \n", this.grade);
	    System.out.println();
		
	}

	
}
