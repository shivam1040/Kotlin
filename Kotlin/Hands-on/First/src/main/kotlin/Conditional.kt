fun main(){
    if(1>2) //else if is also supported
        print(1)
    else
        print(2)

    val num=9
    val result=num in 1..5

    var a=when(num){ //like switch in java
        1 -> println("a")
        9 -> println("b")
        else -> println("w")
    }
}