import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int sum ;
		int givenN ;
		int count ;
		
		System.out.println("1부터 N까지의 합을 구하려고 합니다. N의 값을 입력하세요.");
		givenN = input.nextInt();
		
		
		sum = 0 ;
		count = 0 ;
		
		
		while (count < givenN) {

			count ++ ;
			sum = sum + count ;
			
			System.out.println("1부터 " + count + "까지의 합은 " + sum +" 입니다.");
			
		}
		
		input.close();
		
		
	}

}
