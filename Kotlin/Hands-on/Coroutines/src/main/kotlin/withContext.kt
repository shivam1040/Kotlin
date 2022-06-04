import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {
        launch(Dispatchers.Default){
            println("First context $coroutineContext")
            withContext(Dispatchers.IO){ //this lets us witch cpntext from one to another
                println("Second context $coroutineContext")
            }
            println("third context $coroutineContext")
        }
    }
}