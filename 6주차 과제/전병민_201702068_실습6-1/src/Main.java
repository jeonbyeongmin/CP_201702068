import java.util.Scanner;

public class Main {
	
	private static void printAsterisks (int n) {
		
		while ( n >= 1) {
			System.out.print("*");
			n--;
		}
	}
	
	private static int inputNumber() {
		
		Scanner myScanner = new Scanner(System.in);
		int givenN ;
		
		System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
		givenN = myScanner.nextInt();
		
		return givenN;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("<< ���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�. >>");
		System.out.println();
		int a = inputNumber() ;
		
		while (a >= 0) {
			printAsterisks(a) ;
			System.out.println();
			a = inputNumber() ;
		}
		
		System.out.println();
	    System.out.println("<< ���α׷��� �����մϴ�. >>");
	    
		}
	}

	

	


