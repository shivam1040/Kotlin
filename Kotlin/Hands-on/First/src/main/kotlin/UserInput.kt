fun main(){
    println("Input")
    val input= readLine()
    val i= readLine()?:""//if nothing entered then make it blank not null
    println(input?.toInt())
}