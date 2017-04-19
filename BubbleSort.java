package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class BubbleSort {

	@Test
	public void bubbleSort1() {
		int a[] = { 1, 15, 8, 12, 19 };
		int n = a.length;
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 1; j < n - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		System.out.println("Bubble sort 1: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

	@Test
	public void bubbleSort2() {
		int a[] = { 1, 15, 8, 12, 19 };
		int n = a.length;
		int i, j;
		int k = n;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (j = 1; j < k; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					flag = true;
				}
			}
			k--;
		}
		System.out.println("Bubble sort 2: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

	@Test
	public void bubbleSort3() {
		int a[] = { 1, 15, 8, 12, 19 };
		int n = a.length;
		int i, j;
		int flag;
		flag = n;
		while (flag > 0) {
			int k = flag;
			flag = 0;
			for (j = 1; j < k; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					flag = j;
				}
			}
		}
		System.out.println("Bubble sort 3: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}
}
