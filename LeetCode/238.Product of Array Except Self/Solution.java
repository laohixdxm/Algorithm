public class Solution {
  public int[] productExceptSelf(int[] nums) {

    int[] left = new int[nums.length];
    left[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      left[i] = left[i - 1] * nums[i];
    }

    int[] right = new int[nums.length];
    right[nums.length - 1] = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      right[i] = right[i + 1] * nums[i];
    }

    int[] ans = new int[nums.length];

    ans[0] = right[1];
    ans[nums.length - 1] = left[nums.length - 2];

    for (int i = 1; i < nums.length - 1; i++) {
      ans[i] = left[i - 1] * right[i + 1];
    }

    return ans;
  }
}

// for Follow up:
public class Solution {
  public int[] productExceptSelf(int[] nums) {
    int pre = nums[0];
    int[] ans = new int[nums.length];
    ans[0] = 1;

    for (int i = 1; i < nums.length; i++) {
      ans[i] = pre;
      pre *= nums[i];
    }

    pre = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      ans[i] *= pre;
      pre *= nums[i];
    }

    return ans;
  }
}