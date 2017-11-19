import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		double a, b, c ;
		double determinant ;
		double x1, x2 ;
		char userAnswer ;
		
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.println("Ǯ������ 'Y'�� ġ�ʽÿ� : ");
		userAnswer = input.next().charAt(0);
		
		while ( userAnswer == 'Y' || userAnswer == 'y') {
			
			System.out.println("����� ������� �Է����ּ���.");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();

			System.out.println ("a = " + a + " b = " + b + " c = " + c) ;
			determinant = b*b - 4.0*a*c ;
			
			if (determinant < 0) {
				
				System.out.println("�Ǳ��� �������� �ʽ��ϴ�.");
			}
			
			else if ((-0.0000001 < a) && (a < 0.0000001)) {
				
				System.out.println("�������� ����� 0�Դϴ�. ������������ Ǯ �� �����ϴ�.");
			}
			
			else {
				
				x1 = (-b + Math.sqrt(determinant)) / (2.0*a) ;
				x2 = (-b - Math.sqrt(determinant)) / (2.0*a) ;
				
				System.out.println("The solution is either " + x1 + " or " + x2) ;
			}
			
			System.out.println("������������ Ǯ�ڽ��ϱ�? ");
			System.out.println("Ǯ������ 'Y'�� ġ�ʽÿ� : ");
			userAnswer = input.next().charAt(0);
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		input.close();

	}

}
