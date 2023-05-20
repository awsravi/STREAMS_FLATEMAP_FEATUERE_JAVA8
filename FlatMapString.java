package com.fmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapString {

	public static void main(String[] args) {
		List<String> al1 = Arrays.asList("A", "B", "C", "D");
		List<String> al2 = Arrays.asList("E", "F", "G", "H");

		List<String> alladd = new ArrayList<String>();
		alladd.addAll(al1);
		alladd.addAll(al2);
		System.out.println(alladd);

		List<List<String>> listalp = new ArrayList<>();
		listalp.add(al1);
		listalp.add(al2);
		System.out.println(listalp);

		List<String> stream = listalp.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println(stream);

	}

}
