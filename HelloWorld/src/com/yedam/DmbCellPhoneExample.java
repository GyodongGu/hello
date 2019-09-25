package com.yedam;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dmbCell = new DmbCellPhone("S10","white",10);
		System.out.println("model : " + dmbCell.model);		//부모필드
		System.out.println("color : " + dmbCell.color);		//부모필드
		System.out.println("channel : " + dmbCell.channel);	//자신필드
		
		dmbCell.powerOn();		//부모메소드
		dmbCell.turnOnDmb();	//자신메소드
		dmbCell.turnOffDmb();
		dmbCell.powerOff();

	}

}
