package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int matScore;

	public Student(String name, int engScore, int matScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

}

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("hong", 80,92), new Student("kang", 95,93));
	
	public static void printString(Function<Student, String> func) {
		for(Student student : list) {
			System.out.println(func.apply(student));
		}
	}
	public static void printInt(ToIntFunction<Student> func) {
		for(Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}
	
	public static double avg(ToIntFunction<Student> func) {
		int sum = 0, cnt = 0;
		for(Student student : list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		
		return (double)sum/cnt;
	}
	
	public static void main(String[] args) {
		
		printString((t)->{
			return t.getName();
		});
		System.out.println("영어성적입니다.");
		printInt((t)->{
			return t.getEngScore();
		});
		System.out.println("수학성적입니다.");
		printInt((t)->{
			return t.getMatScore();
		});
		System.out.println("영어 평균");
		double eresult = avg((t)->{
			return t.getEngScore();
		});
		System.out.println(eresult);
		
		System.out.println("수학 평균");
		
		double mresult = avg((t)->{
			return t.getMatScore();
		});
		System.out.println(mresult);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
