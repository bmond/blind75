package blind75;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		Integer[] list = { 3,2,4 };
		Integer target = 8;
		int[] twoSum = twoSum(list, target);
		System.out.println(twoSum);
	}

	private static int[] twoSum(Integer[] list, Integer target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int size = list.length;
		int[] twoSum = new int[2];
		for (int i=0; i<size -1; i++) {
			if (map.containsKey(target-list[i])) {
				twoSum[0] = map.get(target-list[i]);
				twoSum[1] = i;
				
			} else {
				map.put(list[i],i);
			}
		}
		return twoSum;
	}

}
