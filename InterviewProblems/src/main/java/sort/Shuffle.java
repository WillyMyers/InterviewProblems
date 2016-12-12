package main.java.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Shuffle<T> {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Shuffle<Integer> shuff = new Shuffle<>();
		shuff.shuffle(list);
		printList(list, "shuffle1");

		list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		shuff.shuffle2(list);
		printList(list,"shuffle2");
	}

	private static void printList(List<Integer> list, String s) {
		for (Integer integer : list) {
			System.out.println(s + ":" + integer);
		}
	}

	private List<T> shuffle(List<T> list) {
		Collections.shuffle(list);
		return list;
	}
	
	private List<T> shuffle2(List<T> list) {
		Random rand = new Random();
		for (int i = list.size() -1; i > 0; i--) {
			T x = list.get(i);
			int idx = rand.nextInt(i);
			list.set(i, list.get(idx));
			list.set(idx, x);
		}
		return list;
	}

}
