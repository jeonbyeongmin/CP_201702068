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
		
		
		System.out.print("������ �Է��ϼ��� : ");
		score = myScanner.nextInt();
		
		while (score >= 0 ) {
			
			if (score > 100) {
				System.out.println("���� : �ִ����� 100�� �Ѿ����ϴ�.");
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
				System.out.println("     ���� : " + score + ", ���� : " + grade);
				
				
				
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
			System.out.print("������ �Է��ϼ��� : ");
			score = myScanner.nextInt();
			
		}
		
		average = (double) sumOfScores / (double) numberOfStudents ;
		
		System.out.println();
		System.out.println("�л����� " + numberOfStudents + "�� �Դϴ�.");
		System.out.println("A�� " + gradeA + "�� �Դϴ�.");
		System.out.println("B�� " + gradeB + "�� �Դϴ�.");
		System.out.println("C�� " + gradeC + "�� �Դϴ�.");
		System.out.println("D�� " + gradeD + "�� �Դϴ�.");
		System.out.println("F�� " + gradeF + "�� �Դϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println("<< ���� ó�� ���α׷��� �����մϴ� >>");
		
		myScanner.close();

	}

}
