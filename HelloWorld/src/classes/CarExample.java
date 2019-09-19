package classes;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Car();
		
		Car car = new Car();
		car.model = "그랜저";
		car.color = "red";
		car.price = 10000;
		car.maxSpeed = 200;
		
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.price);
		System.out.println(car.maxSpeed);
		car.drive();
		
		
		Car car2 = new Car();
		car2.model = "소나타";
		car2.color = "blue";
		car2.price = 2000;
		car2.maxSpeed = 250;
		car2.drive();
		
		Car[] carAry = new Car[2];
		
		carAry[0] = car;
		carAry[1] = car2;
		
		
		for(Car c : carAry) {
			System.out.println(c);
		}
		
		

	}

}
