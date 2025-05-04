package g0001_g0100.s0001_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
           for (j in i + 1 until nums.size) {
               if ((nums[i] + nums[j] == target) || (target - nums[i]) == nums[j]){
                   return intArrayOf(i, j)
               }
           }
        }
        return intArrayOf()
    }
}