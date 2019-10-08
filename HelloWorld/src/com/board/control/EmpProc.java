package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.Employee;
import com.board.model.EmployeeService;


public class EmpProc {
	
	Scanner sc = new Scanner(System.in);
	
	List<Board> boardAry = new ArrayList<>();
	
//	BoardCollection service = new BoardCollectionImpl();
	
	EmployeeService service = new EmployeeServiceImpl();
	
	
	public void execute() {
		while(true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1. 작성 | 2. 단건조회 | 3. 전체조회 | 4. 글삭제 | 5.게시글 수정 | 6. 종료");
			int menu = 0;
			try {
				menu = sc.nextInt();	//에러가 발생 가능한 곳.
				sc.nextLine();
			}catch(Exception e) {
				
				System.out.println("메뉴에 없는 번호입니다. 다시 선택해주세요");
				sc.nextLine();
			}
	
			
			if(menu == 1) {
				writeBoard();
			}else if(menu == 2) {
				getBoard();
			}else if(menu == 3) {
				getBoardList();
			}else if(menu == 4) {
				deleteBoard();
			}else if(menu == 5) {
				updateBoard();
			}else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		System.out.println("프로그램 종료.");
	}
	
	
	public void writeBoard() {
		System.out.println("직원등록.");
		System.out.println("직원 번호입력.");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("email을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("입사일 입력하세요.");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt();sc.nextLine();
		System.out.println("jobid를 입력하세요.");
		String jobId = sc.nextLine();
		
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate);	//2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		
		service.insertEmployee(emp);
		
	}
	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회할 번호를 입력");
		try {
			int empNo = sc.nextInt();sc.nextLine();
			Employee employees = service.getEmployee(empNo);
			System.out.println(employees);
			
		}catch(Exception e) {
			System.out.println("잘못입력하셨습니다.");
			sc.nextLine();
		}
	}
	public void getBoardList() {
		System.out.println("전체글 조회");
		List<Employee> employees = service.getEmpList();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		
//		for(int i=0; i<boardAry.length; i++) {
//			if(boardAry[i] != null) {
//				System.out.println(boardAry[i].getBoardNo()+","+boardAry[i].getTitle()+","+boardAry[i].getContents()+","+boardAry[i].getWriter());
//			}
//		}
	}
	
	public void deleteBoard() {
		System.out.println("삭제할 글 번호");
		try {
			int de = sc.nextInt();sc.nextLine();
			
			service.deleteEmployee(de);
		
			System.out.println(de+"번 글이 삭제되었습니다.");
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
			sc.nextLine();
		}
	}
	
	
	public void updateBoard() {
		System.out.println("변경할 번호");
		try {
			int boardNo = sc.nextInt();sc.nextLine();
			System.out.println("변경사항 ");
			System.out.println("번호 : ");
			int eNo = sc.nextInt(); sc.nextLine();
			System.out.println("이름 : ");
			String fName = sc.nextLine();
			System.out.println("성 : ");
			String lName = sc.nextLine();
			System.out.println("email : ");
			String eemail = sc.nextLine();
			System.out.println("입사일 : ");
			String hDate = sc.nextLine();
			System.out.println("jobid : ");
			String jid = sc.nextLine();
			System.out.println("급여 : ");
			int esalary = sc.nextInt(); sc.nextLine();
			
			Employee emp = new Employee();
			emp.setEmployeeId(eNo);
			emp.setFirstName(fName);
			emp.setLastName(lName);
			emp.setEmail(eemail);
			emp.setHireDate(hDate);
			emp.setJobId(jid);
			emp.setSalary(esalary);
			
			service.updateEmployee(emp, boardNo);
			
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.");
			sc.nextLine();
		}
	}

}
