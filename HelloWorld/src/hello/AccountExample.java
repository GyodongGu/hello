package hello;

import java.util.Scanner;

public class AccountExample {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------");
			int menu = sc.nextInt(); sc.nextLine();
			if(menu ==1) {
				createAccount();
			}else if(menu == 2) {
				getAccountlist();
			}else if(menu == 3) {
				deposit();
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
	
	//계좌생성
	public static void createAccount() {
		System.out.println("계좌번호 : ");
		String accountNo = sc.nextLine();
		System.out.println("사용자 : ");
		String accountName = sc.nextLine();
		System.out.println("첫 계좌금액 : ");
		int accountBalance = sc.nextInt();
		
		Account acc = new Account(accountNo, accountName, accountBalance);
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
	}
	//계좌 리스트
	public static void getAccountlist() {
		for(Account a : accountArray) {
			if(a != null)
			System.out.println("계좌번호 : "+a.getAno() +"소유자 : "+ a.getOwner()+ "금액 : " + a.getBalance());
		}
		
	}
	//입금
	public static void deposit() {
		System.out.println("계좌번호 : ");
		String ano = sc.nextLine();
		System.out.println("입금액 : ");
		int money = sc.nextInt();
		

		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}else {
			int newBalance = account.getBalance()+money;
			account.setBalance(newBalance);
		}
		
	}
	//출금
	public static void withdraw() {
		System.out.println("출금계좌 : ");
		String ano = sc.nextLine();
		System.out.println("출금액 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}else {
			int newBalance = account.getBalance()-money;
			if(newBalance <0) {
				System.out.println("잔금이 부족합니다.");
			}
			else {
				account.setBalance(newBalance);
			}
		}
		
	}
	
	public static Account findAccount(String ano) {
		Account account = null;
		
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] !=null) {
				String dbano = accountArray[i].getAno();
				
				if(dbano.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		
		return account;
	}
	

}
