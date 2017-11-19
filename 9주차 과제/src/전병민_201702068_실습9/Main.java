package 전병민_201702068_실습9;

import java.util.Scanner;

public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int[] scores = new int[50];
	
	private static int inputScore() {

		int score = myScanner.nextInt();
		
		return score ;
		
	}
	
	private static double scoresAverage(int[] elements, int aSize) {
		
		int count = 0;
		int total = 0;
		double average ;
		
		while (count < aSize) {
			
			total = total + elements[count] ;
			count ++ ;
		}
		
		average = (double) total / aSize ;
		
		return average ;
		
	}
	
	private static int calcMax (int[] elements, int aSize) {
		
		int count = 1;
		int max = scores[count] ;
		
		while (count < aSize) {
			if (scores[count] > max) {
				max = scores[count] ;
			}
			count ++ ;
		}
		
		return max ;
		
	}
	
	private static int calcMin (int[] elements, int aSize) {
		
		int count = 1;
		int min = scores[count] ;
		
		while (count < aSize) {
			if (scores[count] < min) {
				min = scores[count] ;
			}
			count ++ ;
		}
		
		return min ;
		
	}
	
	private static void selectionSort (int[] elements, int aSize) {
		
		int lastLoc = aSize ;
		int maxLoc, maxValue ;
		int curLoc;
		int selectionLoc = 0 ;
		
		while (selectionLoc < lastLoc) {
			
			maxLoc = selectionLoc ;
			maxValue = elements[maxLoc];
			curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc ) {
				if (elements[maxLoc] < elements[curLoc]) {
					maxLoc = curLoc ;
					maxValue = elements[maxLoc] ;
				}
				curLoc ++ ;
			}
			elements[maxLoc] = elements[selectionLoc] ;
			elements[selectionLoc] = maxValue ;
			
			selectionLoc ++;
		}
	}

	public static void main(String[] args) {
		
		int score ;
		int numberOfStudent = 0;
		
		System.out.print(">점수를 입력하시오 : ");
		score = inputScore();
		
		
		while (score >= 0) {
			if ( score > 100 ) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scores[numberOfStudent] = score ;
				numberOfStudent ++;
			}
			System.out.print(">점수를 입력하시오 : ");
		    score = inputScore();
		}
		

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		
		int aboveClassAverage = 0 ;
		int count = 0 ;
		int count2 = 0 ;
		int count3 = 0 ;
		
		System.out.println();
		System.out.println("모두 " + numberOfStudent + "명의 성적이 입력되었습니다.");
		
		
		
		System.out.println("학급 평균은 " + scoresAverage(scores, numberOfStudent) + "입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		
		while (count < numberOfStudent) {
			
			System.out.print("[" + count + "] " + scores[count]);
			if (scores[count] > scoresAverage(scores, numberOfStudent)) {
				System.out.println(" (평균 이상입니다)");
			}
			else {
				System.out.println(" (평균 미만입니다)");
			}
			count ++;
			
		}

		while (count2 < numberOfStudent) {
			if ( (double) scores[count2] >= scoresAverage(scores, numberOfStudent)) {
				aboveClassAverage ++ ;
			}
			count2 ++;
		}
		
		System.out.println("평균을 넘는 학생 수는 " + aboveClassAverage + "명입니다.");
		System.out.println();
		
		System.out.println("최고점은 " + calcMax (scores, numberOfStudent) + "점입니다.");
		System.out.println("최저점은 " + calcMin (scores, numberOfStudent) + "점입니다.");
		
		System.out.println();
		System.out.println("성적순은 다음과 같습니다.");
		selectionSort (scores, numberOfStudent) ;
		
		while (count3 < numberOfStudent) {
			
			System.out.println("[" + count3 + "] " + scores[count3]);
			count3 ++;
			
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
