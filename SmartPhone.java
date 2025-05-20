package SmartPhone;

import java.util.Scanner;

public class SmartPhone {
	
	Addr[] Addrs = new Addr[10];
	int index;

/* 입력 정보를 받아 객체를 생성하여 리턴 */ 
	public Addr inputAddrData() {
		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String group = null;
				
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = in.nextLine();
		
		System.out.print("전화번호 : ");
		phoneNumber = in.nextLine();
		
		System.out.print("이메일 : ");
		email = in.nextLine();
		
		System.out.print("주소 : ");
		address = in.nextLine();
		
		System.out.print("그룹(친구/가족) : ");
		group = in.nextLine();
		
		Addr addr = new Addr(name, phoneNumber, email, address, group);
	
		return addr;
		
	}

/* 입력 정보를 배열에 저장 */	
	public void addAddr(Addr addr) {
		
		Addrs[index] = new Addr(addr.getName(), addr.getPhoneNumber(), addr.getEmail(), addr.getAddress(), addr.getGroup());
		System.out.printf("데이터가 저장되었습니다. (%d) \n", index+1);
		
		index++;
	}
	
	public void printAddr(Addr Addr) {
		System.out.println("이름: "+ Addr.getName());
		System.out.println("전화번호: "+ Addr.getPhoneNumber());
		System.out.println("이메일: "+ Addr.getEmail());
		System.out.println("주소: "+ Addr.getAddress());
		System.out.println("그룹: "+ Addr.getGroup());
	
	}

/* 모든 정보 출력 */	
	public void printAllAddr() {
		for(int i=0;i<index;i++) {
			System.out.printf("이름: %s \n",Addrs[i].getName());
			System.out.printf("전화번호: %s \n",Addrs[i].getPhoneNumber());
			System.out.printf("이메일: %s \n",Addrs[i].getEmail());
			System.out.printf("주소: %s \n ",Addrs[i].getAddress());
			System.out.printf("그룹: %s \n",Addrs[i].getGroup());
				
		}
		
	}

/* 연락처 검색하기 */	
	public void searchAddr(String name) {
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				System.out.println("이름: "+ Addrs[i].getName());
				System.out.println("전화번호: "+ Addrs[i].getPhoneNumber());
				System.out.println("이메일: "+ Addrs[i].getEmail());
				System.out.println("주소: "+ Addrs[i].getAddress());
				System.out.println("그룹: "+ Addrs[i].getGroup());
				
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
		Addrs[count].setName(null);
		Addrs[count].setPhoneNumber(null);
		Addrs[count].setEmail(null);
		Addrs[count].setAddress(null);
		Addrs[count].setGroup(null);
		
		index -= 1;

		for(int i=count;i<index;i++) {
			Addrs[i].setName(Addrs[i+1].getName());
			Addrs[i+1].setName(null);
			
			Addrs[i].setPhoneNumber(Addrs[i+1].getPhoneNumber());
			Addrs[i+1].setPhoneNumber(null);
			
			Addrs[i].setEmail(Addrs[i+1].getEmail());
			Addrs[i+1].setEmail(null);
			
			Addrs[i].setAddress(Addrs[i+1].getAddress());
			Addrs[i+1].setAddress(null);
			
			Addrs[i].setGroup(Addrs[i+1].getGroup());
			Addrs[i+1].setGroup(null);
		}		
	}

/* 연락처 수정하기 */	
	public void editAddr(String name, Addr newAddr) {
		for(int i=0;i<index;i++) {
			if(name.equals(Addrs[i].getName())) {
				Addrs[i].setName(newAddr.getName());
				Addrs[i].setPhoneNumber(newAddr.getPhoneNumber());
				Addrs[i].setEmail(newAddr.getEmail());
				Addrs[i].setAddress(newAddr.getAddress());
				Addrs[i].setGroup(newAddr.getGroup());
				
			}
		}
		
	}
	
	public void printMenu() {
		System.out.println("주소 관리 메뉴 ---------------");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 모든 연락처 출력");
		System.out.println("3. 연락처 검색");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 수정");
		System.out.println("6. 프로그램 종료");
		System.out.println("--------------------------");
	}
	
	
}
