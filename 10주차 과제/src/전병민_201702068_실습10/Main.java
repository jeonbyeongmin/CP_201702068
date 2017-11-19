package ������_201702068_�ǽ�10;

import java.util.Scanner;
public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);
	
	private static int inputScore(){

		return myScanner.nextInt();
		
	}

	public static void main(String[] args) {
		
		Student myStudent = new Student();
		GPACounter myCounter = new GPACounter();
		
		System.out.print("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ� : ");
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
				
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				
				System.out.println("[��   ��] ���� : " + korScore + ",  ���� : " + myStudent.gradeKor() + ", ���� : " + myStudent.pointKor());
				System.out.println("[��   ��] ���� : " + engScore + ",  ���� : " + myStudent.gradeEng() + ", ���� : " + myStudent.pointEng());
				System.out.println("[��ǻ��] ���� : " + comScore + ",  ���� : " + myStudent.gradeCom() + ", ���� : " + myStudent.pointCom());
				System.out.println("�� �л��� ��������� " + myStudent.gpa() + "�Դϴ�.");
				myCounter.count(myStudent.gpa());
			}
			System.out.println();
			System.out.print("�� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ� : ");
			korScore = inputScore();
			engScore = inputScore();
			comScore = inputScore();
			
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		
		System.out.println("��������� 3.0 �̻��� �л��� " + myCounter.numberOfGPA3() + "���Դϴ�.");
		System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� " + myCounter.numberOfGPA2() + "���Դϴ�.");
		System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� " + myCounter.numberOfGPA1() + "���Դϴ�.");
		System.out.println("��������� 1.0 �̸��� �л��� " + myCounter.numberOfGPA0() + "���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
