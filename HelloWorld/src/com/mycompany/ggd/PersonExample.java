package com.mycompany.ggd;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.setName("Gu");
		p1.setAge(29);
		p1.setHeight(183.4);
		p1.setWeight(83.3);
		
		System.out.println("이름은 : " + p1.getName() + " 나이는 : " + p1.getAge() + " 키는 : "+p1.getHeight()+" 몸무게는 : "+p1.getWeight());
		

	}

}
