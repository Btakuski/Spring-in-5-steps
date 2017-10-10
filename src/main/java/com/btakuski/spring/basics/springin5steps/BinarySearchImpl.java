package com.btakuski.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	public int binarySearch(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;
		while(start <= end) {
			int mid = start + end / 2;
			if(target == numbers[mid]) {
				return mid;
			}
			if(target < numbers[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}


}
