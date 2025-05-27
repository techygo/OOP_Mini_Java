package SmartPhoneExt;

import java.util.Scanner;

public class SmartPhone {

	Addr[] Addrs = new Addr[10];
	int index;

/* 입력 정보를 받아 객체를 생성하여 객체의 주소 정보를 리턴, 메서드는 객체타입으로 선언 */ 
	public Addr inputAddrData() {
		
		Scanner in = new Scanner(System.in);
		Addr addrs = new Addr();
		
		System.out.print("이름 : ");
		addrs.setName(in.nextLine());
			
		System.out.print("전화번호 : ");
		addrs.setPhoneNumber(in.nextLine());
			
		System.out.print("이메일 : ");
		addrs.setEmail(in.nextLine());
			
		System.out.print("주소 : ");
		addrs.setAddress(in.nextLine());
			
		System.out.print("그룹(친구/가족) : ");
		addrs.setGroup(in.nextLine());
			
		return addrs;
	}

	public CompanyAddr inputCompanyAddr() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = in.nextLine();
			
		System.out.print("전화번호 : ");
		String phoneNumber = in.nextLine();
			
		System.out.print("이메일 : ");
		String email = in.nextLine();
			
		System.out.print("주소 : ");
		String address = in.nextLine();
			
		System.out.print("생일 : ");
		String birthday = in.nextLine();

		System.out.print("그룹 : ");
		String group = in.nextLine();
		
		System.out.print("회사이름 : ");
		String companyName = in.nextLine();
		
		System.out.print("부서이름 : ");
		String department = in.nextLine();

		System.out.print("직급 : ");
		String grade = in.nextLine();
				
		CompanyAddr addr = new CompanyAddr(name, phoneNumber, email, address, birthday, group, companyName, department, grade);

		return addr;
	}

	public CustomerAddr inputCustomerAddr() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = in.nextLine();
			
		System.out.print("전화번호 : ");
		String phoneNumber = in.nextLine();
			
		System.out.print("이메일 : ");
		String email = in.nextLine();
			
		System.out.print("주소 : ");
		String address = in.nextLine();
			
		System.out.print("생일 : ");
		String birthday = in.nextLine();

		System.out.print("그룹 : ");
		String group = in.nextLine();
		
		System.out.print("거래처이름 : ");
		String customerName = in.nextLine();
		
		System.out.print("품목이름 : ");
		String item = in.nextLine();

		System.out.print("직급 : ");
		String grade = in.nextLine();
				
		CustomerAddr addr = new CustomerAddr(name, phoneNumber, email, address, birthday, group, customerName, item, grade );

		return addr;
	}

	/* 파라미터를 객체 주소로 받아 객체 주소의 각 정보를 배열에 저장 */	
	public void addAddr(Addr addr) {
		
		Addrs[index] = addr;
		System.out.printf("데이터가 저장되었습니다. (%d) \n", index+1);
		
		index++;
	}

	public void addCompanyAddr(CompanyAddr addr) {
		
		Addrs[index] = addr;
		System.out.printf("데이터가 저장되었습니다. (%d) \n", index+1);
		
		index++;
	}

	public void addCustomerAddr(CustomerAddr addr) {
		
		Addrs[index] = addr;
		System.out.printf("데이터가 저장되었습니다. (%d) \n", index+1);
		
		index++;
	}
	
/* 회사와 거래처를 구분하여 모든 정보 출력 */	
	public void printAllAddr() {
		for(int i=0;i<index;i++) {
			Addrs[i].printInfo();
			System.out.println();
		}
		
	}

/* 연락처 검색하기 */	
	public void searchAddr(String name) {
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				Addrs[i].printInfo();
				System.out.println();
				
			}
		}
		
	}

/* 연락처 삭제하기 */	
	public void deleteAddr(String name) {
		int count = 0;
		
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				count = i;
			}
		}
		
/* 삭제 내용 반영 후 앞단으로 이동하는 작업 진행 */
		index -= 1;	
		for(int i=count;i<index;i++) {
			Addrs[i] = Addrs[i+1];
			Addrs[i+1] = null;
		}		
	}

/* 연락처 수정하기 */	
	public void editAddr(String name, Addr newAddr) {
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				Addrs[i] = newAddr;
				
			}
		}
		
	}
	
	
	public void printContact(String name) {
		
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				Addrs[i].showData();				
			}
		}
		System.out.println();
		
	}


}
