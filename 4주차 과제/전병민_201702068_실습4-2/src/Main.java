import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		
		int integerN ;
		char userAnswer ;
		
		System.out.println("���丮�� ����� �Ͻðڽ��ϱ�?");
		System.out.println("�Ͻð����� 'Y'�� �Է����ּ���. : ");
		System.out.println("�����ϰ� ������ �ٸ�Ű�� �����ÿ�");
		userAnswer = input.next().charAt(0);
		
		while ( userAnswer == 'Y' || userAnswer == 'y') {
			
			System.out.println("���丮�� ���� ����� ���� N�� �Է����ּ���.");
			integerN = input.nextInt();
			
			if (integerN < 0 ) {
				System.out.println("����Ҽ� �����ϴ�.");
			}
			
			else if (integerN == 0) {
				System.out.println("��갪�� 1�Դϴ�.");
			}
			else {

				int fact = 1 ;
				int count ;
				count = 1 ;
				while ( count <= integerN ) {
					
					fact = fact * count ;
					count ++ ;
					
				}
				
				System.out.println("��갪�� " + fact + "�Դϴ�.");
				
			}
			System.out.println();
			
			System.out.println("���丮���� Ǯ�ڽ��ϱ�? ");
			System.out.println("Ǯ������ 'Y'�� ġ�ʽÿ� : ");
			System.out.println("�����ϰ� ������ �ƹ�Ű�� �����ÿ�");
			userAnswer = input.next().charAt(0);
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		input.close();

	}

}
