package com.practice;

import java.util.ArrayList;
import java.util.List;

class Static {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Aamir khan");
		list.add("Aamir khan");
		list.add("Aasim khan");
		list.add("salman khan");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}

			}
		}
		System.out.println(list);

	}

}
