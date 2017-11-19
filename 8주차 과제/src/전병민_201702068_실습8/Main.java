package 전병민_201702068_실습8;

import java.util.Scanner;

public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int[] korScores = new int[50];
	
	private static int[] comScores = new int[50];
	
	private static double[] studentAverages = new double[50];
	
	private static int inputScore() {

		
		int score = myScanner.nextInt();
		
		return score ;
		
	}

	public static void main(String[] args) {
		
		int korScore, comScore ;
		int numberOfStudent = 0;
		double total = 0 ;
		double average ;
		
		System.out.print("> 두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
		korScore = inputScore();
		comScore = inputScore();
		
		
		while (korScore >= 0 || comScore >= 0 ) {
			if ( korScore > 100 || comScore > 100 ) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				korScores[numberOfStudent] = korScore ;
				comScores[numberOfStudent] = comScore ;
				studentAverages[numberOfStudent] = (double)(korScore + comScore) / 2.0 ;
				numberOfStudent ++;
			}
			System.out.print("> 두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			korScore = inputScore();
			comScore = inputScore();
		}
		

		System.out.println("음의 점수가 입려되어 입력을 종료합니다.");
		
		int aboveClassAverage = 0 ;
		int count = 0;
		int count2 = 0 ;
		
		System.out.println();
		System.out.println("모두 " + numberOfStudent + "명의 성적이 입력되었습니다.");

		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		while  (count < numberOfStudent) {
			System.out.print("[" + count + "] " + korScores[count] + "  " + comScores[count] + "  ");
			System.out.println("(평균 " + studentAverages[count] + ")");
			total = total + studentAverages[count] ;
			count ++;
		}
		
		System.out.println();
		average = (double) total / numberOfStudent ;
		System.out.println("학급 평균은 " + average + "입니다.");

		while (count2 < numberOfStudent) {
			if ( (double) studentAverages[count2] >= average) {
				aboveClassAverage ++ ;
			}
			count2 ++;
		}
		
		System.out.println("평균을 넘는 학생 수는 " + aboveClassAverage + "입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
