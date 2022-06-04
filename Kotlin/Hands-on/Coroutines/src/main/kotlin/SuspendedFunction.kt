import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var b=0 //this is part of main application
//depicting synchronization here
fun main(){
    GlobalScope.launch{ //control comes here, starts processing in background
        a()
    }
    GlobalScope.launch {//control comes here starts processing in background
        c()
    }
    println("main") //control comes here and prints
    Thread.sleep(2000L) //main thread sleeps for 2 seconds so that global scope can complete which requires 1.5 seconds
    println(b) //prints this after printing results of global scope in order of lowest to highest required time
}

suspend fun a(){ //this is a part of coroutine, allows us to run this function within a coroutine
    delay(500L)
    println("a")
    b++
}

suspend fun c(){
    delay(1000L)
    println("c")
    b++
}