import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		
		int integerN ;
		char userAnswer ;
		
		System.out.println("팩토리얼 계산을 하시겠습니까?");
		System.out.println("하시겠으면 'Y'를 입력해주세요. : ");
		System.out.println("종료하고 싶으면 다른키를 누르시오");
		userAnswer = input.next().charAt(0);
		
		while ( userAnswer == 'Y' || userAnswer == 'y') {
			
			System.out.println("팩토리얼 값을 계산할 정수 N을 입력해주세요.");
			integerN = input.nextInt();
			
			if (integerN < 0 ) {
				System.out.println("계산할수 없습니다.");
			}
			
			else if (integerN == 0) {
				System.out.println("계산값은 1입니다.");
			}
			else {

				int fact = 1 ;
				int count ;
				count = 1 ;
				while ( count <= integerN ) {
					
					fact = fact * count ;
					count ++ ;
					
				}
				
				System.out.println("계산값은 " + fact + "입니다.");
				
			}
			System.out.println();
			
			System.out.println("팩토리얼을 풀겠습니까? ");
			System.out.println("풀겠으면 'Y'를 치십시오 : ");
			System.out.println("종료하고 싶으면 아무키나 누르시오");
			userAnswer = input.next().charAt(0);
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();

	}

}
