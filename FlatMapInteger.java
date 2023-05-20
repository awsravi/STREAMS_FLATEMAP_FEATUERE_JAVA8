package com.fmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapInteger {
	public static void main(String[] args) {

		List<Integer> a1 = Arrays.asList(2, 4, 6);
		List<Integer> a2 = Arrays.asList(8, 10, 12);

		List<Integer> l1 = new ArrayList<>();
		l1.addAll(a1);
		l1.addAll(a2);
		System.out.println(l1);

		List<List<Integer>> lo = new ArrayList<>();

		lo.add(a1);
		lo.add(a2);

		List<List<Integer>> listalp = new ArrayList<>();
		listalp.add(a1);
		listalp.add(a2);
		System.out.println(listalp);
		
	}
}
