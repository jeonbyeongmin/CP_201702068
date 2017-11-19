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
		
		System.out.print( "> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
		
		int koreanScore ;
		int englishScore ;
		int computerScore ;

	    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count0 = 0;
		
		
		koreanScore = inputScore();
		englishScore = inputScore();
		computerScore = inputScore();
		
		
		while (koreanScore >= 0 && englishScore >= 0 && computerScore >= 0) {
			if (koreanScore > 100 || englishScore > 100 || computerScore > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
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
			    
			    
				System.out.print("[��   ��] ���� : " + koreanScore);
				System.out.print("     ���� : " + gradeKorean);
				System.out.println("     ���� : " + koreanPoint);
				
				System.out.print("[��   ��] ���� : " + englishScore);
				System.out.print("     ���� : " + gradeEnglish);
				System.out.println("     ���� : " + englishPoint);
				
				System.out.print("[��ǻ��] ���� : " + computerScore);
				System.out.print("     ���� : " + gradeComputer);
				System.out.println("     ���� : " + computerPoint);
				System.out.println("�� �л��� ��������� " + calcGPA(koreanPoint, englishPoint, computerPoint) + "�Դϴ�.");
				
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
			
			System.out.print( "> �� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
			koreanScore = inputScore();
			englishScore = inputScore();
			computerScore = inputScore();
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
	    System.out.println("��������� 4.0 �̻��� �л��� " + count4 + "�� �Դϴ�.");
	    System.out.println("��������� 3.0 �̻� 4.0 �̸��� �л��� " + count3 + "�� �Դϴ�.");
	    System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� " + count2 + "�� �Դϴ�.");
	    System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� " + count1 + "�� �Դϴ�.");
	    System.out.println("���������  1.0 �̸��� �л��� " + count0 + "�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
