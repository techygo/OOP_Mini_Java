package SmartPhoneExt;

public class CompanyAddr extends Addr {


	private String birthday;
	private String companyName;
	private String department;
	private String grade;
	
	CompanyAddr() {}
	
	CompanyAddr(String name, String phoneNumber, String email, String address, String group, String birthday, String companyName, String department, String grade) {
		super(name, phoneNumber, email, address, group);
		this.birthday = birthday;
		this.companyName = companyName;
		this.department = department;
		this.grade = grade;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getGrade() {
		return grade;
	}
		
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("생일: %s \n", this.birthday);
		System.out.printf("회사이름: %s \n", this.companyName);
		System.out.printf("부서이름: %s \n", this.department);
		System.out.printf("직급: %s \n", this.grade);
	    System.out.println();
		
	}
	
}
