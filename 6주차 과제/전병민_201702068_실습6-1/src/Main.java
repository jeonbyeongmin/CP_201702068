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
		
		System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
		givenN = myScanner.nextInt();
		
		return givenN;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("<< 양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다. >>");
		System.out.println();
		int a = inputNumber() ;
		
		while (a >= 0) {
			printAsterisks(a) ;
			System.out.println();
			a = inputNumber() ;
		}
		
		System.out.println();
	    System.out.println("<< 프로그램을 종료합니다. >>");
	    
		}
	}

	

	


