public class Main{
	
	public static void main(String[] args){
		
		Calculator cal = new Calculator();
		
		int ex1 = cal.square(cal.add(cal.multiply(3, 4), cal.multiply(5, 7)));
		
		System.out.println("Result of (3 * 4 + 5 * 7)²: " + ex1);
		
		int ex2 = cal.add(cal.square(cal.add(4, 7)), cal.square(cal.add(8, 3)));
		
		System.out.println("Result of (4 + 7)² + (8 + 3)²: " + ex2);
	}
}