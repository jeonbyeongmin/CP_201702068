import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int sum ;
		int givenN ;
		int count ;
		
		System.out.println("1���� N������ ���� ���Ϸ��� �մϴ�. N�� ���� �Է��ϼ���.");
		givenN = input.nextInt();
		
		
		sum = 0 ;
		count = 0 ;
		
		
		while (count < givenN) {

			count ++ ;
			sum = sum + count ;
			
			System.out.println("1���� " + count + "������ ���� " + sum +" �Դϴ�.");
			
		}
		
		input.close();
		
		
	}

}
