fun main() {
    val nums: List<Int> = listOf(1, 2, 3) //immutable list
    println(nums.indexOf(2))
    val num:MutableList<Int> = mutableListOf(1, 2, 3) //mutable list
    num[1]=6
    num.add(1)
    num.addAll(nums)
}