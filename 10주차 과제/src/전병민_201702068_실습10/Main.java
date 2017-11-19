package 전병민_201702068_실습10;

import java.util.Scanner;
public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore(){

		return myScanner.nextInt();
		
	}

	public static void main(String[] args) {
		
		Student myStudent = new Student();
		GPACounter myCounter = new GPACounter();
		
		System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다 : ");
		int korScore, engScore, comScore ;
		korScore = inputScore();
		engScore = inputScore();
		comScore = inputScore();
		System.out.println();
		
		while (korScore > 0 && engScore > 0 && comScore > 0) {
			
			myStudent.setScoreKor(korScore);
			myStudent.setScoreEng(engScore);
			myStudent.setScoreCom(comScore);
			
			if ( korScore > 100 || engScore > 100 || comScore > 100 ) {
				
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				
				System.out.println("[국   어] 점수 : " + korScore + ",  학점 : " + myStudent.gradeKor() + ", 평점 : " + myStudent.pointKor());
				System.out.println("[영   어] 점수 : " + engScore + ",  학점 : " + myStudent.gradeEng() + ", 평점 : " + myStudent.pointEng());
				System.out.println("[컴퓨터] 점수 : " + comScore + ",  학점 : " + myStudent.gradeCom() + ", 평점 : " + myStudent.pointCom());
				System.out.println("이 학생의 평균평점은 " + myStudent.gpa() + "입니다.");
				myCounter.count(myStudent.gpa());
			}
			System.out.println();
			System.out.print("세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다 : ");
			korScore = inputScore();
			engScore = inputScore();
			comScore = inputScore();
			
		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		
		System.out.println("평균평점이 3.0 이상인 학생은 " + myCounter.numberOfGPA3() + "명입니다.");
		System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 " + myCounter.numberOfGPA2() + "명입니다.");
		System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 " + myCounter.numberOfGPA1() + "명입니다.");
		System.out.println("평균평점이 1.0 미만인 학생은 " + myCounter.numberOfGPA0() + "명입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
