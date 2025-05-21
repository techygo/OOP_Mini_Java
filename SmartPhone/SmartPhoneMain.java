package SmartPhone;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		int menu = 0;
		String searchName = null;
		
		Scanner in = new Scanner(System.in);
		SmartPhone sp = new SmartPhone();
		
		System.out.println("# 데이터 2개를 입력합니다.");
		Addr addrs1 = sp.inputAddrData();
		sp.addAddr(addrs1);
		Addr addrs2 = sp.inputAddrData();
		sp.addAddr(addrs2);

		while(true) {
			sp.printMenu();
			menu = in.nextInt();
			
			if(menu == 1) {
				Addr addrs = sp.inputAddrData();
				sp.addAddr(addrs);
			} else if(menu == 2) {
				sp.printAllAddr();
			} else if(menu == 3) {
				System.out.print("이름 : ");
				Scanner ins = new Scanner(System.in);
				searchName = ins.nextLine();
				sp.searchAddr(searchName);
			} else if(menu == 4) {
				System.out.print("이름 :  ");
				Scanner ind = new Scanner(System.in);
				searchName = ind.nextLine();
				sp.deleteAddr(searchName);
			} else if(menu == 5) {
				System.out.print("이름 : ");
				Scanner ine = new Scanner(System.in);
				searchName = ine.nextLine();
				Addr newAddr = sp.inputAddrData();
				sp.editAddr(searchName, newAddr);
			} else if(menu == 6) {
				in.close();
				System.exit(0);
			}
		}

	}
	

}
