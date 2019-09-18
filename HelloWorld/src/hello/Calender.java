package hello;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showCal(10);
	}
	
	
	public static void showCal(int mon) {
		
		String week[] = {"Sun","Mon","Tus","Wed","Tur","Fri","Sat"};
		int month = mon;
		int sday = getStartday(month);
		int monthDay = getMonthday(month);
		System.out.println(month+"월");
		for(String str : week) {
			System.out.print(" " + str);
		}
		System.out.println();
		for(int i=1; i<sday; i++) {
			System.out.printf("%4s","");
		}
		for(int i=1; i<=monthDay; i++) {
			System.out.printf("%4d",i);
			if((sday + i -1)%7 == 0) {
				System.out.println();
			}
		}
		
	}
	
	
	public static int getMonthday(int month) {
		int day=0;
		if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12) {
			day = 31;
		}
		else if(month ==4 || month == 6 || month == 9 || month ==11) {
			day = 30;
		}else {
			day = 29;
		}
		return day;
	}
	
	public static int getStartday(int month) {
		int startDay = 0;
		if(month == 9) {
			startDay =1;
		}else if(month == 10) {
			startDay = 3;
		}
		
		
		
		return startDay;
	}
	
	
	

}
