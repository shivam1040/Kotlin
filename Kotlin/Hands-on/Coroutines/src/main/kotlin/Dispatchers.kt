import kotlinx.coroutines.*

fun main(){
    runBlocking {
        /*
        launch(Dispatchers.Main){ //unless we specify this in gradle we cant use main dispatcher it would throw exception
            println("Main ${Thread.currentThread().name}")
        }
        */
        launch(Dispatchers.Unconfined){
            println("Unconfined ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined2 ${Thread.currentThread().name}") //notice how first coroutine is in main thread but next coroutines are in different thread
        }

        launch(Dispatchers.Default){
            println("Default ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("New thread")){//mostly prefer coroutines over creating new thread
            println("New Single thread cntxt ${Thread.currentThread().name}")
        }
    }
}