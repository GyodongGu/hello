package com.yedam;

import com.yedam.example.Tire;

class Bus extends Vehicle{
	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle{
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}

public class Vehicle {
	
	String engine;
	String handle;
	Tire tire;
	void start() {
		System.out.println("차가 출발합니다.");
	}
	void run() {
		System.out.println("차가 달립니다.");
	}
	void stop() {
		System.out.println("차가 정지합니다.");
	}
	
	
}
