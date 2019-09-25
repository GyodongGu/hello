package hello;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		m1.setName("Gu");
		m1.setId("ggd");
		m1.setPassword("12345");
		m1.setAge(29);

		Member m2 = new Member("관리자","admin");
		m2.setPassword("admin");
		m2.setAge(30);
		
		Member m3 = new Member("사용자1", "user1", "user1234", 10);
		
		Member[] memberAry = new Member[3];
		
		memberAry[0] = m1;
		memberAry[1] = m2;
		memberAry[2] = m3;
		
//		for(Member m : memberAry) {
//			System.out.println("name : "+m.getName()+"  id : "+m.getId()+"  password : "+m.getPassword()+"  age : "+m.getAge());
//		}
		
		System.out.println("조회할 name 입력 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		for(Member m : memberAry) {
			if(m.getName().equals(name)) {
				System.out.println("name : "+m.getName()+"  id : "+m.getId()+"  password : "+m.getPassword()+"  age : "+m.getAge());
			}
		}
		
	}

}
