package blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		boolean containsDuplicate = containsDuplicate(nums);
		System.out.println(containsDuplicate);
	}

	private static boolean containsDuplicate(int[] nums) {
		Set set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
	}

}
