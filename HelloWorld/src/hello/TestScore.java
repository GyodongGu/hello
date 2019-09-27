package hello;

import java.util.Scanner;

public class TestScore {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score[] score = new Score[100];
		
		while(true) {
			System.out.println("메뉴선택해주세요.");
			System.out.println("1.학생성적 등록 | 2. 전체리스트 조회 | 3.학생번호 조회 | 4.전체 통계 |5. 정렬 | 6. 종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("학생번호 입력 : ");
				int stNo = sc.nextInt();sc.nextLine();
				System.out.println("학생 이름 입력 : ");
				String name = sc.nextLine();
				System.out.println("학생 국어 성적입력 : ");
				int kScore = sc.nextInt();sc.nextLine();
				System.out.println("학생 영어 성적 입력 : ");
				int eScore = sc.nextInt();sc.nextLine();
				System.out.println("학생 수학 성적 입력 : ");
				int mScore = sc.nextInt();sc.nextLine();
				
				int sScore = kScore + eScore + mScore;
				double aScore = sScore/3;
				//각 입력 값을 받아서 배열에 넣는 과정(학생번호, 이름, 국어, 영어 , 수학, 총점, 평균)
				Score newScore = new Score(stNo, name, kScore, eScore, mScore, sScore, aScore);
				for(int i =0; i< score.length; i++) {
					if(score[i] == null) {
						score[i] = newScore;
						break;
					}
					
				}
				//score에 입력된 학생 리스트 출력
			}else if(menu == 2) {
				System.out.println("학생 전체 리스트");
				for(int i = 0; i<score.length; i++) {
					if(score[i] != null) {
						System.out.println("학생번호 : "+score[i].getStudentId()+" 학생이름 : "+score[i].getName() + " 국어성적 : " + score[i].getKoreanScore()+" 영어성적 : "+ score[i].getEnglishScore() + " 수학성적 : " + score[i].getMathScore());
					}
				}
				//선택조회
			}else if(menu == 3) {
				System.out.println("학생 번호 조회");
				int idNo = sc.nextInt();sc.nextLine();
				
				for(int i = 0; i<score.length; i++) {
					if(score[i] != null && score[i].getStudentId() == idNo ) {
						System.out.println("학생번호 : "+score[i].getStudentId()+" 학생이름 : "+score[i].getName() + " 국어성적 : " + score[i].getKoreanScore()+" 영어성적 : "+ score[i].getEnglishScore() + " 수학성적 : " + score[i].getMathScore() + " 총점 : " + score[i].getSumScore() + " 평균점수 : " + score[i].getAvgScore());
					}
				}
				
				//전체점수, 평균
			}else if(menu == 4) {
				System.out.println("반 전체 점수");
				int allScore = 0;
				double savgScore = 0.0;
				double avg = 0.0;
				int cnt = 0;
				for(int i =0; i<score.length; i++) {
					if(score[i] != null) {
						allScore += score[i].getSumScore();
						savgScore += score[i].getAvgScore();
						cnt++;
					}
				}
				avg = savgScore/cnt;
				System.out.println("반 전체 총점 : " + allScore + "평균 점수 : "+ avg);
				
				//선택정렬(오름차순)
			}else if(menu == 5) {
				System.out.println("오름차순으로 정렬하시오(총점기준)");
				for(int i =0; i<score.length-1; i++) {
					for(int j = i+1; j<score.length; j++) {
						if(score[i] != null && score[j] != null) {
							if(score[i].getSumScore() > score[j].getSumScore()) {
								int tmp = score[j].getSumScore();
								score[j].setSumScore(score[i].getSumScore());
								score[i].setSumScore(tmp);
							}
						}
					}
				}
				for(int k = 0; k<score.length; k++) {
					if(score[k] != null) {
						System.out.println("학생번호 : " + score[k].getStudentId() + " 학생 이름 : " + score[k].getName() + " 총점 : " + score[k].getSumScore());
					}
				}
				//종료				
			}else if(menu == 6) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}

class Score{
	int studentId;
	String Name;
	int koreanScore;
	int englishScore;
	int mathScore;
	int sumScore;
	double avgScore;
	
	public Score(int studentId, String name, int koreanScore, int englishScore, int mathScore, int sumScore, double avgScore) {
		super();
		this.studentId = studentId;
		Name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.sumScore = sumScore;
		this.avgScore = avgScore;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getSumScore() {
		return sumScore;
	}

	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}

	
}




