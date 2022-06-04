import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
//do import coroutine external library
fun main(){
    GlobalScope.launch {//scope command to start a coroutine
        delay(2000L) //delaying execution, so it moves out of scope and prints hello
        println("World")
    }
    println("Hello")
    Thread.sleep(3000L)

    //the flow will be coroutine will launch, due to execution delay of 1 sec control will go out of block and hello will be printed, current thread will sleep for 2 secs and then finally coroutine block will finish execution
    //ensure to keep sleep value above delay value, else coroutine will die during delay
}