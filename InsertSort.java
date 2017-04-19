package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class InsertSort {
	@Test
	public void insertSort() {
		int a[] = { 3, 14, 2, 8, 2, 1 };
		int n = a.length;
		int i, j, k;
		for (i = 1; i < n; i++) {
			for (j = i - 1; j >= 0; j--) {
				if (a[j] < a[i]) {
					break;
				}
			}
			if (j != i - 1) {
				int temp = a[i];
				for (k = i - 1; k > j; k--) {
					a[k + 1] = a[k];

				}
				a[k + 1] = temp;
			}
		}
		System.out.println("Insert sort 1: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

	@Test
	public void insertSort3() {
		int a[] = { 3, 14, 2, 8, 2, 1 };
		int n = a.length;
		int i, j;
		for (i = 1; i < n; i++) {
			for(j=i-1;j>=0&&a[j]>a[j+1];j--){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		System.out.println("Insert sort 3: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}
}
