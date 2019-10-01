package com.yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Worker("직장인1"));
		personCourse.add(new Student("학생1"));
		personCourse.add(new HighStudent("고등학생1"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정",5);
		
		workerCourse.add(new Worker("직장인2"));
		
		Course<Student> studentCourse = new Course<>("학생과정",5);
		studentCourse.add(new Student("학생3"));
		studentCourse.add(new HighStudent("고등학생3"));
		
		Course<HighStudent> highstudentCourse = new Course<>("고등학생과정",5);
		highstudentCourse.add(new HighStudent("고등학생4"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		
//		registerStudent(personCourse);		//Student 클래스를 상속하는 클래스만 가져온다.
//		registerStudent(workerCourse);
		registerStudent(highstudentCourse);
		registerStudent(studentCourse);
		
		registerWorker(personCourse);
		registerWorker(workerCourse);
//		registerWorker(highstudentCourse);	//worker의 상위클래스만 가져온다.
//		registerWorker(studentCourse);
	}
	
	public static Course<? super Worker> getCourse(){
		Course<Person> coursePerson = new Course<>("일반인과정",5);
		Course<Worker> courseWorker = new Course<>("일반인과정",5);
		Course<Student> courseStudent = new Course<>("일반인과정",5);
		Course<HighStudent> courseHigh = new Course<>("일반인과정",5);
		return coursePerson;
	}
	
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println("과정명: " + course.getName()+", 수강생: "+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println("과정명: " + course.getName()+", 수강생: "+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourse(Course<?> course) {
		System.out.println("과정명: " + course.getName()+", 수강생: "+ Arrays.toString(course.getStudents()));
	}
	
	
}
