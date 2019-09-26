package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {
	Tire[] TireAry = {new Tire("왼쪽앞",6), new Tire("오른쪽앞",2), new Tire("뒤왼쪽",3), new Tire("뒤오른쪽",4)};
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i =0; i<TireAry.length; i++) {
			if(TireAry[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
