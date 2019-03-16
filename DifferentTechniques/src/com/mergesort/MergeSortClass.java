package com.mergesort;

public class MergeSortClass {

	public static void main(String[] args) {

		int[] arr = {7,6,5,4,3,2,1};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		MergeSortClass msc = new MergeSortClass();
		
		msc.MergeSort(arr, 0,6);
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public void MergeSort(int[] arr, int l, int r) {
		if(l<r) {
			
			int m = (l+r)/2;
			
			MergeSort(arr, l, m);
			MergeSort(arr, m+1, r);
			Merge(arr, l, m, r );
			
		}
	}
	public void Merge(int[] arr, int l, int m, int r) {
		int n1= m-l+1;
		int n2= r-m;
		
		
//		int[] arr1 = new int[n1];
//		int[] arr2 = new int[n2];
		
		int i=l,j=m+1,k=0;
		int[] arr1 = new int[r-l+1];
		
		while(i<=m && j<=r) {
			
			if(arr[i]>arr[j])
				arr1[k++]=arr[j++];
			else
				arr1[k++]=arr[i++];
			
		}
		while(i<=m)
			arr1[k++]=arr[i++];
		while(j<=r)
			arr1[k++]=arr[j++];
		
		for(j=l,k=0;k<arr1.length;j++,k++) {
			arr[j]=arr1[k];
		}
				
		
		
		
	}

}
