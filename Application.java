package com.jwt.controller;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void findDuplicate(final int arr[]) {

		final int n = arr.length;
		int counter = 0;

		final Map<Integer, Integer> num = new HashMap<Integer, Integer>(n);

		for (int i = 1; i < n; i++) {

			if (!num.containsKey(arr[i])) {
				num.put(arr[i], counter++);
			} else {
				System.out.println("Duplicate element: " + arr[i]);

			}
		}
	}

	public static void main(final String[] args) {

		final int n = 6;
		final int arr[] = { 1, 2, 3, 4, 5, 2 };

		findDuplicate(arr);
	}
}