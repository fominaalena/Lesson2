package by.htp.lesson2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int numbers[] = new int[]{1,2,9,8,7,4,3,6,5};
		System.out.println(findMaxValue(numbers));
		System.out.println(findMinValue(numbers));
		System.out.println(Arrays.toString(sortAscending(numbers)));
		System.out.println(Arrays.toString(sortDescending(numbers)));
		
		
	}
	
	public static int findMaxValue(int[] numbers) {
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
		      if(numbers[i] > max) {
		         max = numbers[i];
		      }
		}
		return max;
	}
	
	public static int findMinValue(int[] numbers) {
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
		      if(numbers[i] <min) {
		         min = numbers[i];
		      }
		}
		return min;
	}
	
    public static int[] sortAscending(int[] numbers){
 
		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j<i ; j++) {
    			if (numbers[j]>numbers[j+1]) {
    				int tmp = numbers[j];
    				numbers[j] = numbers[j+1];
    				numbers[j+1] = tmp;
    			}
    		}
    	}
		return numbers;
    }
    public static int[] sortDescending(int[] numbers){
    	 
		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j<i ; j++) {
    			if (numbers[j]<numbers[j+1]) {
    				int tmp = numbers[j];
    				numbers[j] = numbers[j+1];
    				numbers[j+1] = tmp;
    			}
    		}
    	}
		return numbers;
    }
	

}
