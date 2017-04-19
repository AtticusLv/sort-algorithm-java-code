package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class MergeSort {

	@Test
	public void mergerSort() {
		int arr[] = { 3, 5, 7, 123, 534, 345, 8, 13, 67, 90, 34, 12, 67, 90, 32 };
		int n = arr.length;
		msort(arr, 0, n - 1);
		int i;
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------");
	}

	private void msort(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			msort(arr, low, mid);
			msort(arr, mid + 1, high);
			merger(arr, low, mid, high);
		}
	}

	// 将两个有序数组合并成一个有序数组
	private void merger(int[] arr, int low, int mid, int high) {
		// temp数组用于暂存合并的结果
		int[] temp = new int[high - low + 1];
		// 左半边的指针
		int i = low;
		// 右半边的指针
		int j = mid + 1;
		// 合并后数组的指针
		int k = 0;
		for (; i <= mid && j <= high; k++) {
			if (arr[i] < arr[j]) {
				temp[k] = arr[i++];
			} else {
				temp[k] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}

		for (int l = 0; l < temp.length; l++) {
			arr[low + l] = temp[l];
		}
	}
}
