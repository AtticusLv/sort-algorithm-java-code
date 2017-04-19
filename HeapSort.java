package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class HeapSort {

	@Test
	public void heapSort() {
		int a[] = { 3, 5, 7, 123, 534, 345, 8, 13, 67, 90, 34, 12, 67, 90, 32 };
		int n = a.length;

		for(int i = n -1;i>=1;i--){
			minHeapFixup(a,i);
		}
		
		for (int i = n - 1; i >= 1; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			minHeapFixdown(a, 0, i);
		}
		int i;
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

	// Add data to Heap
	private void minHeapFixup(int[] a, int i) {
		int j, temp;
		temp = a[i];
		j = (i - 1) / 2;// 父节点
		while (j >= 0 && i != 0) {
			if (a[j] <= temp)
				break;
			a[i] = a[j];// 把较大的子节点往下移动，替换它的子节点
			i = j;
			j = (i - 1) / 2;
		}
		a[i] = temp;
	}

	// Delete data in the heap
	private void minHeapFixdown(int[] a, int i, int n) {
		int j, temp;
		temp = a[i];
		j = 2 * i + 1;
		while (j < n) {
			if (j + 1 < n && a[j + 1] < a[j])// 在左右子节点中找最小的
				j++;
			if (a[j] > temp)
				break;
			a[i] = a[j];// 把较小的子节点往上移动，替换父节点
			i = j;
			j = 2 * i + 1;
		}
		a[i] = temp;
	}
}
