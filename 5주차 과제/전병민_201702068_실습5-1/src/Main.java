import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int score ;
		int numberOfStudents = 0 ;
		int sumOfScores = 0 ;
		double average ;
		char grade ;
		int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0 ;
		
		
		System.out.print("성적을 입력하세요 : ");
		score = myScanner.nextInt();
		
		while (score >= 0 ) {
			
			if (score > 100) {
				System.out.println("오류 : 최대점수 100을 넘었습니다.");
			}
			else {
				
				numberOfStudents = numberOfStudents + 1 ;
				sumOfScores = sumOfScores + score ;
				
				
				if (score >= 90 && score <= 100) {
					grade = 'A' ;
				}
				else if (score >= 80 && score <= 89) {
					grade = 'B' ;
				}
				else if (score >= 70 && score <= 79) {
					grade = 'C' ;
				}
				else if (score >= 60 && score <= 69) {
					grade = 'D' ;
				}
				else {
					grade = 'F' ;
				}
				System.out.println("     성적 : " + score + ", 학점 : " + grade);
				
				
				
				if (score >= 90 && score <= 100) {
					gradeA = gradeA + 1 ;
				}
				else if (score >= 80 && score <= 89) {
					gradeB = gradeB + 1 ;
				}
				else if (score >= 70 && score <= 79) {
					gradeC = gradeC + 1 ;
				}
				else if (score >= 60 && score <= 69) {
					gradeD = gradeD + 1 ;
				}
				else {
					gradeF = gradeF + 1 ;
				}
				
				
				
			}
			System.out.print("성적을 입력하세요 : ");
			score = myScanner.nextInt();
			
		}
		
		average = (double) sumOfScores / (double) numberOfStudents ;
		
		System.out.println();
		System.out.println("학생수는 " + numberOfStudents + "명 입니다.");
		System.out.println("A는 " + gradeA + "명 입니다.");
		System.out.println("B는 " + gradeB + "명 입니다.");
		System.out.println("C는 " + gradeC + "명 입니다.");
		System.out.println("D는 " + gradeD + "명 입니다.");
		System.out.println("F는 " + gradeF + "명 입니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println("<< 성적 처리 프로그램을 종료합니다 >>");
		
		myScanner.close();

	}

}
