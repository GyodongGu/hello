package com.yedam.interfacePkg;

public interface RemoteControl {
	
	//상수필드
	public static final int MAX_VALUE = 10;
	int MIN_VALUE = 0;						// public static final을 선언 안해도 자동설정됨
	
	//추상메소드
	public abstract void turnOn();
	public void turnOff();							// abstract없어도 자동 설정
	public void setVolume(int volume);
	
}
