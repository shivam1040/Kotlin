import kotlinx.coroutines.*

fun main(){
    runBlocking { //blocking type of coroutine, complete this first then others
        launch {
            delay(1000L)
            println("runBlock")
        }

        GlobalScope.launch {//not dying coroutine, global scope
            delay(500L)
            println("Global")
        }

        coroutineScope {//coroutine within a coroutine
            launch {
                delay(1500L)
                println("coroutineScope")
            }
        }
    } //tasks above will get repeated in the order of lowest to highest delay time

    println("continue")

}