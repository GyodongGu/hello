package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년 : ");
		int year = sc.nextInt();
		System.out.println("월 : ");
		int month = sc.nextInt();
		
		getCal(year,month);

	}
	
	public static void getCal(int year, int month) {
		
		Calendar cal = Calendar.getInstance();

		cal.set(year, month-1, 1);
		
		String week[] = {"Sun","Mon","Tus","Wed","Tur","Fri","Sat"};
		
		System.out.println(month+"월");
		for(String str : week) {
			System.out.print(" " + str);
		}
		System.out.println();
		for(int i=1; i<cal.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("%4s","");
		}
		for(int i=1; i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%4d",i);
			if((cal.get(Calendar.DAY_OF_WEEK) + i -1)%7 == 0) {
				System.out.println();
			}
		}
		
	
//		System.out.println("년 : " + cal.get(Calendar.YEAR));
//		System.out.println("월 : " + cal.get(Calendar.MONTH));
//		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("전체일수 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
			
		
	}

}
