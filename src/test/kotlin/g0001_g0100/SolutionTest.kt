package g0001_g0100

import g0001_g0100.s0001_two_sum.Solution
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun case1() {
        Solution().twoSum(intArrayOf(2, 7, 11, 15), 9).shouldBe(intArrayOf(0, 1))
    }

    @Test
    fun case2(){
        Solution().twoSum(intArrayOf(3, 2, 4), 6).shouldBe(intArrayOf(1, 2))
    }

    @Test
    fun case3(){
        Solution().twoSum(intArrayOf(3, 3), 6).shouldBe(intArrayOf(0, 1))
    }
}