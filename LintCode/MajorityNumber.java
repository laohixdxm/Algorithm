/**
 * Majority Number
 * www.lintcode.com/en/problem/majority-number/
 *
 * Given an array of integers, the majority number is the number that occurs
 * more than half of the size of the array. Find it.
 *
 * Example
 * Given [1, 1, 1, 1, 2, 2, 2], return 1.
 */

public class Solution {
  /**
   * @param nums: a list of integers
   * @return: find a  majority number
   */
  public int majorityNumber(ArrayList<Integer> nums) {
    if (nums == null || nums.size() == 0) {
      return 0;
    }
    int count = 0;
    int candidate = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (count == 0) {
        candidate = nums.get(i);
        count++;
      } else {
        if (candidate == nums.get(i)) {
          count++;
        } else {
          count--;
        }
      }
    }
    return candidate;
  }
}