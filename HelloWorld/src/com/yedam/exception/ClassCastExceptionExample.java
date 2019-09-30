package com.yedam.exception;

class Animal{
	
}

class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		
		Animal animal = null;
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal = dog;
		animal = cat;						//cat인스턴스를 animal에 넣었기 때문에
		
		Animal animal2 = new Animal();
		
		if(animal instanceof Cat) {
			cat = (Cat) animal;				//animal을 cat으로 넣는건 문제가 되지 않는다.
			
		}
		
		cat = (Cat) animal2;		//에러 발생할것이다.
		
	}
}
