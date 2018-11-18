package chlead;

public class SquareRoot {
	
	
	/**
	 * This problem is essentially about finding the 
	 * highest possible number, which is found by applying
	 * a maximum power of two.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	@SuppressWarnings("unused")
	public static int solution(int a, int b) {
		
		if (a < 2) {
			throw new RuntimeException("Unacceptale input of lower bound = 1");
		}
				
		for (int x = a; x < b ; x++) {
			if (Math.ceil(Math.sqrt(x)) == Math.ceil(Math.sqrt(x))) {
				break;
			}
			return 0;
		}
		
		if (a < b) {
			
			double floor = Math.ceil(Math.sqrt(a));
			double ceiling = Math.floor(Math.sqrt(b));
			
			int maxResult = 0;
			
			for (double eles = floor ; eles <= ceiling ; eles++) {
				
				int result = 1;
				double sqt = Math.sqrt(eles);
				
				while(Math.ceil(sqt) == Math.floor(sqt)) {
					result++;
					sqt = Math.sqrt(sqt);
				}
				
				maxResult = Math.max(maxResult, result);
			}
			
			return maxResult;
		}
		return 0;
	}
	
	public static void main(String[] x) {
		
		System.out.println(solution(1, 99));
	}
	
	

}
