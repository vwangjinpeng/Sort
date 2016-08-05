package com.wang.sort;

public class MergeSort {
	static int[] ListA = {12,32,31,14,52,45};
	
	public static void main(String[] args) {
		int[] Temp=new int[ListA.length];
		int First=0;
		int Last=ListA.length-1;
		MSort(ListA,Temp,First,Last);
		for(int item : ListA)
			System.out.print(item+",");
	}
	public static void MSort(int[] ListB, int[] Temp, int First, int Last){
		if(First!=Last){
			int Mid=(int)((ListB.length-1)/2);
			MSort(ListB, Temp, First, Mid);
			MSort(ListB, Temp, Mid+1, Last);
			Merge(ListB, Temp, First, Mid, Last);
		}
	}
	//合并将两个有序序列（[first,mid],[mid+1,last]）合并
	public static void Merge(int[] ListC, int[] Temp, int First, int Mid, int Last){
		Mid=(int)((ListC.length-1)/2);
		int i=First;
		int j=Mid+1;
		int TempData=0;
		while(i<=Mid&&j<=Last){
			if(ListC[i]<ListC[j]){
				Temp[TempData++]=ListC[i++];
			}
			else{
				Temp[TempData++]=ListC[j++];
			}
		}
		while(i<=Mid){
			Temp[TempData++]=ListC[i++];
		}
		while(j<=Last){
			Temp[TempData++]=ListC[j++];
		}
		for(i=0;i<ListC.length;i++)
			ListC[i]=Temp[i];
	}
}