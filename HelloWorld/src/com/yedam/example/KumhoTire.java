package com.yedam.example;

public class KumhoTire extends Tire{

	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	boolean roll() {
		this.accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "kumho타이어 수명 : " + (maxRotation - accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***" + location + "kumho타이어 펑크 ***");
			return false;
		}
	}
	
	
}
