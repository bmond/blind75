package blind75;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4 };
		int[] productOfArrayExceptSelf = productOfArrayExceptSelf(nums);
		for(int elem: productOfArrayExceptSelf) {
			System.out.println(elem);
		}
	}

	private static int[] productOfArrayExceptSelf(int[] nums) {
		int[] prefixArray = new int[nums.length];
		int[] productOfArrayExceptSelf = new int[nums.length];
		for (int i=0; i<nums.length;i++) {
			if(i==0) {
				prefixArray[i]=1;
			} else {
				prefixArray[i] = prefixArray[i-1]*nums[i-1];
			}
		}
		int prevProduct = 1;
		for (int i=nums.length-1; i>=0;i--) {
			
			if(i==nums.length-1) {
				productOfArrayExceptSelf[i] = 1*prefixArray[i];
			}else {
				prevProduct = prevProduct * nums[i+1];
				productOfArrayExceptSelf[i] = prevProduct*prefixArray[i];
			}
		}
		return productOfArrayExceptSelf;
	}

}
