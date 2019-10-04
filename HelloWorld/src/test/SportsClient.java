package test;

public class SportsClient {
	int no;	//회원번호
	String name;	//회원이름
	String course;	//등록과정
	int courseno;	//등록과정별 넘버부여
	
	//생성자
	public SportsClient() {
		
	}
	
	public SportsClient(int no, String name, String course) {
		super();
		this.no = no;
		this.name = name;
		this.course = course;
	}

	//get-set method
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getCourseno() {
		return courseno;
	}

	public void setCourseno(int courseno) {
		this.courseno = courseno;
	}
}
