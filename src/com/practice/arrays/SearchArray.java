package com.practice.arrays;

public class SearchArray {

	void search(int arr[], int position) {
		if(position>arr.length) {
			System.out.println("Invalid Position");
		}else {
			System.out.println(arr[position]);
		}
	}
	
	public static void main(String[] args) {
		SearchArray searchArray = new SearchArray();
		int arr[] = {1,2,3,4,5,6,7};
		searchArray.search(arr, 11);
	}
}
