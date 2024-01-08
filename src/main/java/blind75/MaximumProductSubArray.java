package blind75;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] nums = { -2,0,-1 };
		int maxProductSubArr = maximumProductSubArray(nums);
		System.out.println(maxProductSubArr);
	}

	private static int maximumProductSubArray(int[] nums) {
		int result = nums[0];
		int min = 1;
		int max = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				min = 1;
				max = 1;
				result = Math.max(result, nums[i]);
			} else {
				int tmp = min;
				min = Math.min(Math.min(nums[i], min * nums[i]), max * nums[i]);
				max = Math.max(Math.max(nums[i], tmp * nums[i]), max * nums[i]);
				if (max > result) {
					result = max;
				}
			}
			
		}

		return result;
	}

}
