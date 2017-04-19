package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class SelectSort {

	@Test
	public void selectSort(){
		int a[] = { 49,38,65,97,26,13,27,49,55,4 };
		int n = a.length;
		int i,j,minIndex;
		for(i=0;i<n;i++){
			minIndex = i;
			for(j=i+1;j<n;j++){
				if(a[j]<a[minIndex]){
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		System.out.println("Select sort: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}

}
