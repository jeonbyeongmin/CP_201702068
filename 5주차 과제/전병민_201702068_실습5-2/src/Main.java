
public class Main {

	public static void main(String[] args) {
		
		System.out.println("<< Sine �� ��� ���α׷��� �����մϴ� >>");
		
		double x ;
		int n = 1 ;
		double y ;
		
		while (n < 180) {
			
			x = (double) n * (3.141592 / 180.0) ;
			y = Math.sin(x) ;
			System.out.println("Sine(" + n + "��) �� " + y + "�Դϴ�.");
			n = n + 1 ;
			
			if (n == 180) {
				System.out.println("Sine(" + n + "��) ��  0.0 �Դϴ�.");
			}
			
		}
		
		System.out.println("<< Sine �� ��� ���α׷��� �����մϴ� >>");

	}

}
