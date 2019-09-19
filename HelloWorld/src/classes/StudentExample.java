package classes;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S = new Student("x","y");
		
		System.out.println(S.name);
		System.out.println(S.major);
		
		
		Student st1 = new Student();
		st1.name = "hong";
		st1.major = "history";
		
		st1.studentNo = 1111;
		System.out.println(st1.name+","+st1.major+","+st1.studentNo);
		
		
		S.studentNo = 2222;
		
		System.out.println(S.name+","+S.major+","+S.studentNo);
	}

}
