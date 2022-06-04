fun main(){

}

fun add(vararg value:Int){ //using vararg one can pass arrray of integers
    var sum=0
    for(i in value)
        sum+=i
    println(sum)
}