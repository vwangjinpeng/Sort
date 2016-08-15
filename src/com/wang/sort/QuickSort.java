package com.wang.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] ListA = new int[] { 12, 32, 11, 43, 23, 12, 34 };

		System.out.println(1);
	}

	public static void QSort(int[] ListB, int Left, int Right) {
		int m = Left;
		int n = Right;
		int Key = ListB[Left];
		while (m < n) {
			while (ListB[m] > Key) {
				Swap(ListB[m], ListB[Left]);
			}
		}
	}

	public static void Swap(int a, int b) {
		int temp = a;
		b = a;
		a = temp;
	}
}
