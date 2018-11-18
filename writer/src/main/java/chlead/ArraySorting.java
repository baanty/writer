package chlead;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {

	/**
	 * 
	 * This program calculates the highest distance between the same 
	 * numbers. For a very long array, traverse the array only one and
	 * store all the available information while trversing.
	 * 
	 * Also, the original program assumes that there can be only one element in the
	 * array, that can occur more tha once. This assumption is inherently incorrect.
	 * 
	 * Stil, the solution assumes that there is only one elemnt that ca occur once.
	 * And, then solves with Streaming.
	 * 
	 * @param a
	 * @param b
	 * @return 
	 * @return
	 */
	public static int solutionNew(int[] a) {

		List<Integer> listRepresentation = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		for (Integer element : listRepresentation) {
			int firstIndex = listRepresentation.indexOf(element);
			int lastIndex = listRepresentation.lastIndexOf(element);
			
			if (lastIndex != firstIndex) {
				return lastIndex - firstIndex;
			}
		}
		
		return 0;
	}
	

	
	/**
	 * 
	 * This program calculates the highest distance between the same 
	 * numbers.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int solution(int[] a) {
		int n = a.length;
		int result = 0;
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (a[i] == a[j])
					result = Math.max(result, Math.abs(i - j));
		
		
		return result;
	}

	public static void main(String[] x) {

		int[] inputArray = { 4, 6, 2, 2, 6, 6, 1 };
		System.out.println(solution(inputArray));
	}



}
