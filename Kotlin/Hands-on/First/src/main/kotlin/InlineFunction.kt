fun main(){
    calc3 { loop(99999) }
}

//generally if we create a lambda function,bts it creates class and object for lambda method implementation.
//but in inline, compiler copies the body of code and pastes it right where it is called from, so no new obj/class created so performance benefit over lambda
inline fun calc3(fn:()->Unit){ //this is an inline function which takes another function as parameter does some operation along with the passed function
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println(end-start)
}

fun loop(n:Long){
    for(i in 1..n);
}