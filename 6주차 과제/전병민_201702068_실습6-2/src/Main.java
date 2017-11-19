
public class Main {

	public static void main(String[] args) {

		double radian ;
		double sineValue ;

		int degree = 1 ;
		
		while ( degree < 180 ) {
			
			radian = (double)(degree / 180.0 ) * 3.141592 ;
			sineValue = mySine (radian) ;
			
			if (degree < 10) {
				System.out.print("sine(00" + degree + "µµ) : ");
			}
			else if ( 10 <= degree && degree < 100) {
				System.out.print("sine(0" + degree + "µµ) : ");
			}
			else {
				System.out.print("sine(" + degree + "µµ) : ");
			}
			
			printAsterisks (sineValue) ;
			
			degree = degree + 5 ;
			
		}
		
	}
	
	private static void printAsterisks ( double number ) {
		
		int numberOfAsterisks ;
		numberOfAsterisks = (int)((number * 40.0 ) + 0.5 );
		
		
		while (numberOfAsterisks >= 1) {
			
			System.out.print("*");
			numberOfAsterisks -- ;
			
		}
		System.out.println();
		
	}
	
	private static double mySine (double x) {
		
		double xSquare = x * x ;
		double currentTerm = x ;
		double nextTerm ;
		
		int n = 1 ;
		double sineValue = currentTerm ;
		
		while (Math.abs(currentTerm) >= 0.000001) {
			
			nextTerm = -currentTerm * xSquare / (double) ((n+1) * (n + 2)) ;
			n = n + 2 ;
			currentTerm = nextTerm ;
			sineValue = sineValue + currentTerm ;
			
		}
		return sineValue ;
	}


}
