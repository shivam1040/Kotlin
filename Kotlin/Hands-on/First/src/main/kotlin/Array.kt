fun main(){
    var arr= arrayOf("1", "2", "3") //defining array of strings, automatic type defining
    var arr1:Array<Int> =arrayOf(1, 2, 3) //array of intger,explicit type mention

    for(i in arr)
        println(i)

    for((i,s) in arr.withIndex()) //iterating through array along with its index
        println(i)

    arr[0] //way to access elements
    arr.get(0) //another way to acess
    arr.set(0, "A")//way to set elements
    arr.size
}