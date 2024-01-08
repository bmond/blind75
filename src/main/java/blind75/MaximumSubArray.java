package blind75;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArray = maxSubArray(nums);
		System.out.println(maxSubArray);
	}

	private static int maxSubArray(int[] nums) {
		int maxSubArray = nums[0]; //-2
		int curMaxSubArr = nums[0]; //-2
		if(nums.length==1) {
			return maxSubArray;
		}
		for (int i = 1; i < nums.length; i++) {
			int newSubArr = nums[i] + curMaxSubArr; //-1
			if (newSubArr < nums[i]) {
				curMaxSubArr = nums[i]; 
			} else {
				curMaxSubArr = newSubArr;
			}
			if (curMaxSubArr > maxSubArray) {
				maxSubArray = curMaxSubArr; 
			}

		}

		return maxSubArray;
	}

}
