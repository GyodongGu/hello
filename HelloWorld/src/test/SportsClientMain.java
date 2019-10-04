package test;

import java.util.Scanner;

public class SportsClientMain {
	static Scanner sc = new Scanner(System.in);	//입력기능
	static SportsClient[] clientArray = new SportsClient[100];	//회원명단 저장할 배열
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("================================================================");
			System.out.println("1. 회원등록 | 2. 회원번호 조회 | 3. 등록그룹별 리스트 | 4.종료");
			System.out.println("================================================================");
			
			int number = sc.nextInt();sc.nextLine();	//메뉴 번호
			if(number == 1) {
				enroll();				//회원등록
			}else if(number == 2) {
				getClientList();		//회원번호 조회
			}else if(number == 3) {
				courseListAll();			//등록과정별 조회
			}else if(number == 4) {
				run = false;			//종료
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	public static void enroll() {	//회원 등록 메소드
		System.out.println("회원번호 : ");
		int ClientNo = sc.nextInt();sc.nextLine();	//회원번호 입력받기
		System.out.println("회원 이름 : ");
		String ClientName = sc.nextLine();			//회원이름 입력받기
		System.out.println("등록 과정 명 : ");
		String CourseName = sc.nextLine();			//회원이 등록할 과정명 입력
		
		SportsClient sc = new SportsClient(ClientNo, ClientName, CourseName);
		for(int i = 0; i<clientArray.length; i++) {
			if(clientArray[i]==null) {				//회원명단 배열에 값이 없으면 그 자리에 회원 명단 입력
				clientArray[i] = sc;
				break;
			}
		}
	}
	public static void getClientList() {	//회원 번호 조회
		System.out.println("죄회할 회원 번호 : ");
		int getNo = sc.nextInt();sc.nextLine();	//조회할 번호 입력
		
		for(int i =0; i<clientArray.length; i++) {
			if(clientArray[i] != null && clientArray[i].getNo() == getNo) {	//조회할 번호랑 회원명단 배열에 있는 번호랑 같은 회원의 정보만 출력
				System.out.println("회원번호 : "+ clientArray[i].getNo() + " 회원이름 : " + clientArray[i].getName() + " 등록한 과정 : " + clientArray[i].getCourse());
				
			}
		}
	}
	
//	public static void courseList() {		//등록그룹별 리스트
//		System.out.println("조회할 과정 : ");
//		String enCourse = sc.nextLine();	//보고자 하는 리스트의 과정명
//		
//		System.out.println("("+enCourse + ")");
//		for(int i = 0; i<clientArray.length; i++) {
//			if(clientArray[i] !=null && enCourse.equals(clientArray[i].course)) {	//입력한 과정명이랑 회원명단 배열에 있는 과정명이랑 같은 사람의 정보들을 모두 출력
//				System.out.println("번호 : "+clientArray[i].getNo() + " 이름 : " + clientArray[i].getName());
//				
//			}
//		}
//	}
	
	public static void courseListAll() {
		System.out.println("과정별 전체 조회");
		for(int i =0; i<clientArray.length; i++) {
			if(clientArray[i] !=null && clientArray[i].getCourse().equals("swim")) {		//과정별 넘버 주기
				clientArray[i].setCourseno(1);
			}else if(clientArray[i] !=null && clientArray[i].getCourse().equals("tennis")) {
				clientArray[i].setCourseno(2);
			}else if(clientArray[i] !=null && clientArray[i].getCourse().equals("badminton")) {
				clientArray[i].setCourseno(3);
			}
		}
		System.out.println("수영(swim)");
		for(int i =0; i<clientArray.length; i++) {	//과정이 수영인 사람 출력
			if(clientArray[i] !=null && clientArray[i].getCourseno()==1) {
				System.out.println("번호 : "+clientArray[i].getNo() + " 이름 : " + clientArray[i].getName());
			}
		}
		System.out.println("======================");
		System.out.println("테니스(tennis)");
		for(int i =0; i<clientArray.length; i++) {	//과정이 테니스인 사람 출력
			if(clientArray[i] !=null && clientArray[i].getCourseno()==2) {
				System.out.println("번호 : "+clientArray[i].getNo() + " 이름 : " + clientArray[i].getName());
			}
		}
		System.out.println("======================");
		System.out.println("배드민턴(badminton)");
		for(int i =0; i<clientArray.length; i++) {	//과정이 배드민턴인 사람 출력
			if(clientArray[i] !=null && clientArray[i].getCourseno()==3) {
				System.out.println("번호 : "+clientArray[i].getNo() + " 이름 : " + clientArray[i].getName());
			}
		}
	}
}
