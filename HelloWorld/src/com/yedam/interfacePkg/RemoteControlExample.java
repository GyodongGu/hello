package com.yedam.interfacePkg;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc= null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("===============");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		
		RemoteControl rc1 = new RemoteControl() {
			
			int volume;

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("익명구현객체를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("익명구현객체를 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				this.volume = volume;
				
			}
			
		};
		
		rc1.turnOn();
		rc1.turnOff();
		
	}
	
}
