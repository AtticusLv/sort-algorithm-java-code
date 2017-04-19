package com.htsc.aero.as.fms.uplinkencoding.learning;

import org.junit.Test;

public class ShellSort {
	@Test
	public void shellSort(){
		int a[] = { 49,38,65,97,26,13,27,49,55,4 };
		int n = a.length;
		int i,j,gap;
		for(gap=n/2;gap>0;gap/=2){
			for(i=gap;i<n;i++){
				for(j=i-gap;j>=0&&a[j]>a[j+gap];j-=gap){
					int temp = a[j];
					a[j] = a[j+gap];
					a[j+gap] = temp;
				}
			}
		}
		System.out.println("Shell sort: ");
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
	}
}
