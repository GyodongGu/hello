package com.yedam.example;

public class Tire {

	int maxRotation;	//사용가능한 최대 회전수.
	int accumulatedRotation;	//사용으로 인해 축적된 회전수.
	
	String location;			//타이어 위치
	
	public Tire(){
		
	}
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "타이어 수명 : " + (maxRotation - accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
	}

	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
