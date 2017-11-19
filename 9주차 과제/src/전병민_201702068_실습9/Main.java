package ������_201702068_�ǽ�9;

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
		
		System.out.print(">������ �Է��Ͻÿ� : ");
		score = inputScore();
		
		
		while (score >= 0) {
			if ( score > 100 ) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudent] = score ;
				numberOfStudent ++;
			}
			System.out.print(">������ �Է��Ͻÿ� : ");
		    score = inputScore();
		}
		

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		
		int aboveClassAverage = 0 ;
		int count = 0 ;
		int count2 = 0 ;
		int count3 = 0 ;
		
		System.out.println();
		System.out.println("��� " + numberOfStudent + "���� ������ �ԷµǾ����ϴ�.");
		
		
		
		System.out.println("�б� ����� " + scoresAverage(scores, numberOfStudent) + "�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		
		while (count < numberOfStudent) {
			
			System.out.print("[" + count + "] " + scores[count]);
			if (scores[count] > scoresAverage(scores, numberOfStudent)) {
				System.out.println(" (��� �̻��Դϴ�)");
			}
			else {
				System.out.println(" (��� �̸��Դϴ�)");
			}
			count ++;
			
		}

		while (count2 < numberOfStudent) {
			if ( (double) scores[count2] >= scoresAverage(scores, numberOfStudent)) {
				aboveClassAverage ++ ;
			}
			count2 ++;
		}
		
		System.out.println("����� �Ѵ� �л� ���� " + aboveClassAverage + "���Դϴ�.");
		System.out.println();
		
		System.out.println("�ְ����� " + calcMax (scores, numberOfStudent) + "���Դϴ�.");
		System.out.println("�������� " + calcMin (scores, numberOfStudent) + "���Դϴ�.");
		
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");
		selectionSort (scores, numberOfStudent) ;
		
		while (count3 < numberOfStudent) {
			
			System.out.println("[" + count3 + "] " + scores[count3]);
			count3 ++;
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
