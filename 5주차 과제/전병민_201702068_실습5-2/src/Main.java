
public class Main {

	public static void main(String[] args) {
		
		System.out.println("<< Sine 값 출력 프로그램을 시작합니다 >>");
		
		double x ;
		int n = 1 ;
		double y ;
		
		while (n < 180) {
			
			x = (double) n * (3.141592 / 180.0) ;
			y = Math.sin(x) ;
			System.out.println("Sine(" + n + "도) 는 " + y + "입니다.");
			n = n + 1 ;
			
			if (n == 180) {
				System.out.println("Sine(" + n + "도) 는  0.0 입니다.");
			}
			
		}
		
		System.out.println("<< Sine 값 출력 프로그램을 종료합니다 >>");

	}

}
