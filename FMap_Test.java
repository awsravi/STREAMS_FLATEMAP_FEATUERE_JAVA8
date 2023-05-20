package com.fmap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FMap_Test {

	public static void main(String[] args) {

		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> str = Arrays.stream(array);

		System.out.println(str);

		List<Employeee> emp =  List.of(new Employeee("ravi", List.of(96969696L, 6969696L)),
				new Employeee("ravi", List.of(666666L, 9999999L))

		);

	}

}
