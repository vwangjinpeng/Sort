package com.wang.sort;

public class MergeSort {
	static int[] ListA = {12,32,31,14,52,45};
	public static void main(String[] args) {
		MSort(ListA,0,5);
	}
	//合并将两个有序序列（[low,mid],[mid+1,high]）合并
	public static void MSort(int[] ListA, int First, int Last){
		int Mid = (int)((ListA.length-1)/2);
		int i=First;
		int j=Mid+1;
		int[] NewList = new int[ListA.length];
		int NewData=0;
		while(i<=Mid&&j<=Last){
			if(ListA[i]<ListA[j]){
				NewList[NewData++]=ListA[i++];
			}
			else{
				NewList[NewData++]=ListA[j++];
			}
		}
		while(i<=Mid){
			NewList[NewData++]=ListA[i++];
		}
		while(j<=Last){
			NewList[NewData++]=ListA[j++];
		}
		for(i=0;i<ListA.length;i++)
			ListA[i]=NewList[i];
	}
}