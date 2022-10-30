package com.henrikbeck95.sort.algorithms;

public class QuickSort {
	public static int[] main(int[] array) {
		swap(array, 0, array.length - 1);

		return array;
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] <= pivot) {
				i++;

				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		int tmp = arr[i + 1];

		arr[i + 1] = arr[high];
		arr[high] = tmp;

		return i + 1;
	}

	static void swap(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);

			swap(arr, low, pivot - 1);
			swap(arr, pivot + 1, high);
		}
	}
}
