package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class QuickSort {
	
	@Test
	public void quickSort(){
		int arr[] = {3,5,7,123,534,345,8,13,67,90,34,12,67,90,32};
		int n = arr.length;
		qsort(arr,0,n-1);
		System.out.println("Quick sort: ");
		int i;
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------");
	}
	
	private static void qsort(int[] arr, int low, int high){
		if(low<high){
			int pivot = partition(arr,low,high);
			qsort(arr, low, pivot-1);
			qsort(arr,pivot+1,high);
		}
	}
	private static int partition(int[] arr, int low,int high){
		int pivot = arr[low];
		while(low<high){
			while(low<high && arr[high]>=pivot) --high;
			arr[low] = arr[high];
			while(low<high && arr[low]<=pivot) ++low;
			arr[high] = arr[low];
		}
		arr[low] = pivot;
		return low;
	}
}
