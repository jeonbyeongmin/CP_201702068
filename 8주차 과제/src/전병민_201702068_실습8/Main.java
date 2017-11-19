package ������_201702068_�ǽ�8;

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
		
		System.out.print("> �� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		korScore = inputScore();
		comScore = inputScore();
		
		
		while (korScore >= 0 || comScore >= 0 ) {
			if ( korScore > 100 || comScore > 100 ) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				korScores[numberOfStudent] = korScore ;
				comScores[numberOfStudent] = comScore ;
				studentAverages[numberOfStudent] = (double)(korScore + comScore) / 2.0 ;
				numberOfStudent ++;
			}
			System.out.print("> �� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			korScore = inputScore();
			comScore = inputScore();
		}
		

		System.out.println("���� ������ �Է��Ǿ� �Է��� �����մϴ�.");
		
		int aboveClassAverage = 0 ;
		int count = 0;
		int count2 = 0 ;
		
		System.out.println();
		System.out.println("��� " + numberOfStudent + "���� ������ �ԷµǾ����ϴ�.");

		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while  (count < numberOfStudent) {
			System.out.print("[" + count + "] " + korScores[count] + "  " + comScores[count] + "  ");
			System.out.println("(��� " + studentAverages[count] + ")");
			total = total + studentAverages[count] ;
			count ++;
		}
		
		System.out.println();
		average = (double) total / numberOfStudent ;
		System.out.println("�б� ����� " + average + "�Դϴ�.");

		while (count2 < numberOfStudent) {
			if ( (double) studentAverages[count2] >= average) {
				aboveClassAverage ++ ;
			}
			count2 ++;
		}
		
		System.out.println("����� �Ѵ� �л� ���� " + aboveClassAverage + "�Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");

	}

}
