import java.util.Scanner;

public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore() {
		
		int score = myScanner.nextInt();
		
		return score;
	}
	
	private static double calcGPA(double point_Korean, double point_English, double point_Computer) {
		
		double gpa ;
		
		gpa = (point_Korean + point_English + point_Computer) / 3.0 ;
		
		return gpa ;
	}
	
	private static char score2Grade (int aScore) {
		
		
		char grade ;
		
		if (aScore >= 90) {
			grade = 'A' ;
		}
		else if (aScore < 90 && aScore >= 80) {
			grade = 'B' ;
		}
		else if (aScore < 80 && aScore >= 70) {
			grade = 'C' ;
		}
		else if (aScore < 70 && aScore >= 60) {
			grade = 'D' ;
		}
		else {
			grade = 'F' ;
		}

		return grade ;
	}
	
	private static double grade2Point (char aGrade) {
		
		double value ;
		
		if (aGrade == 'A') {
			value = 4.0 ;
		}
		else if (aGrade == 'B') {
			value = 3.0 ;
		}
		else if (aGrade == 'C') {
			value = 2.0 ;
		}
		else if (aGrade == 'D') {
			value = 1.0 ;
		}
		else {
			value = 0.0 ;
		}
		
		return value ;
		
	}

	public static void main(String[] args) {
		
		System.out.print( "> 새 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다.");
		
		int koreanScore ;
		int englishScore ;
		int computerScore ;

	    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count0 = 0;
		
		
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();
		
		
		while (koreanScore >= 0 && englishScore >= 0 && computerScore >= 0) {
			if (koreanScore > 100 || englishScore > 100 || computerScore > 100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
				System.out.println();
			}
			else {
				
			    char gradeKorean ;
			    char gradeEnglish ;
			    char gradeComputer ;
			    double koreanPoint ;
			    double englishPoint ;
			    double computerPoint ;
			    
			    gradeKorean = score2Grade(koreanScore);
			    koreanPoint = grade2Point(gradeKorean);
			    gradeEnglish = score2Grade(englishScore);
			    englishPoint = grade2Point(gradeEnglish);
			    gradeComputer = score2Grade(computerScore);
			    computerPoint = grade2Point(gradeComputer);
			    
			    
				System.out.print("[국   어] 점수 : " + koreanScore);
				System.out.print("     학점 : " + gradeKorean);
				System.out.println("     평점 : " + koreanPoint);
				
				System.out.print("[영   어] 점수 : " + englishScore);
				System.out.print("     학점 : " + gradeEnglish);
				System.out.println("     평점 : " + englishPoint);
				
				System.out.print("[컴퓨터] 점수 : " + computerScore);
				System.out.print("     학점 : " + gradeComputer);
				System.out.println("     평점 : " + computerPoint);
				System.out.println("이 학생의 평균평점은 " + calcGPA(koreanPoint, englishPoint, computerPoint) + "입니다.");
				
				if (calcGPA(koreanPoint, englishPoint, computerPoint) >= 4.0) {
					count4 ++;
				}
				else if (calcGPA(koreanPoint, englishPoint, computerPoint) >= 3.0) {
					count3 ++;
				}
				else if (calcGPA(koreanPoint, englishPoint, computerPoint) >= 2.0) {
					count2 ++;
				}
				else if (calcGPA(koreanPoint, englishPoint, computerPoint) >= 1.0) {
					count1 ++;
				}
				else {
					count0 ++ ;
				}
				
				System.out.println();
				
				
			}
			
			System.out.print( "> 새 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다.");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
	    System.out.println("평균평점이 4.0 이상인 학생은 " + count4 + "명 입니다.");
	    System.out.println("평균평점이 3.0 이상 4.0 미만인 학생은 " + count3 + "명 입니다.");
	    System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 " + count2 + "명 입니다.");
	    System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 " + count1 + "명 입니다.");
	    System.out.println("평균평점이  1.0 미만인 학생은 " + count0 + "명 입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
