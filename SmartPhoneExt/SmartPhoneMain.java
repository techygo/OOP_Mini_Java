package SmartPhoneExt;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		int menu = 0;
		String searchName = null;
		
		Scanner in = new Scanner(System.in);
		SmartPhone sp = new SmartPhone();
		
	
		System.out.println("# 데이터 2개를 입력합니다.");
		CompanyAddr addr1 = sp.inputCompanyAddr();
		sp.addCompanyAddr(addr1);
		CustomerAddr addr2 = sp.inputCustomerAddr();
		sp.addCustomerAddr(addr2);

		while(true) {
			printMenu();
			menu = in.nextInt();

			switch(menu) {
			case 1: 
				if(sp.index >= 10) {
					System.out.println(" 저장공간이 없습니다. ");
					continue;
				}
				CompanyAddr addrs = sp.inputCompanyAddr();
				sp.addCompanyAddr(addrs);
				break;

			case 2: 
				if(sp.index >= 10) {
					System.out.println(" 저장공간이 없습니다. ");
					continue;
				}
				CustomerAddr addrc = sp.inputCustomerAddr();
				sp.addCustomerAddr(addrc);
				break;
			
			case 3: 
				sp.printAllAddr();
				break;
			
			case 4: 
				System.out.print("검색할 이름 : ");
				Scanner findName = new Scanner(System.in);
				searchName = findName.nextLine();
				sp.searchAddr(searchName);
				break;
			
			case 5: 
				System.out.print("삭제할 이름 :  ");
				Scanner delName = new Scanner(System.in);
				searchName = delName.nextLine();
				sp.deleteAddr(searchName);
				break;
			
			case 6: 
				System.out.print("수정할 이름 : ");
				Scanner editName = new Scanner(System.in);
				searchName = editName.nextLine();
				Addr newAddr = sp.inputAddrData();
				sp.editAddr(searchName, newAddr);
				break;

			case 7:
				System.out.print("전화번호 검색할 이름 : ");
				Scanner showData = new Scanner(System.in);
				searchName = showData.nextLine();
				sp.printContact(searchName);
				break;
				
			case 8: 
				in.close();
				System.exit(0);		
				break;
			}
			
		}
		
	}
	/* 메뉴 정보 출력 */ 
	public static void printMenu() {
		System.out.println("주소 관리 메뉴 ---------------");
		System.out.println("1. 연락처 등록(회사)");
		System.out.println("2. 연락처 등록(거래처)");
		System.out.println("3. 모든 연락처 출력");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 연락처 삭제");
		System.out.println("6. 연락처 수정");
		System.out.println("7. 전화번호 검색");
		System.out.println("8. 프로그램 종료");
		System.out.println("--------------------------");
	}


}
