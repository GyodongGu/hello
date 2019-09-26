package com.yedam.interfacePkg;

public class Television implements RemoteControl{

	int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
		
	}

	
	
}
