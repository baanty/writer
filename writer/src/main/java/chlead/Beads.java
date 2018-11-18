package chlead;

public class Beads {
	
	/**
	 * The logic behind the solution is
	 * : The lecklace, with the maximum number of beads is (size of array/2) 
	 * if size or array is even. Otherwise it is ( (size of array + 1)/2 )
	 * @param A
	 * @return
	 */
	public int solution(int[] a) {
		
		if (!isValidArray(a)) {
			throw new RuntimeException("Invaid Array. It contains element more tha once.");
		}
		if (a != null ) {
			if (a.length % 2 == 0) {
				return a.length/2;
			}
			return ( a.length + 1 ) / 2;
		}
		return 0;
        
    }
	
	/**
	 * Check if one number appears only once in the 
	 * array
	 * @return
	 */
	public boolean isValidArray(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int apprearanceCount = 0;
			for (int numberOfArray : a) {
				if (i == numberOfArray) {
					apprearanceCount++;
				}

				if (apprearanceCount > 1) {
					return false;
				}
			} 
		}
		return true;
	}

}
