import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        launch(CoroutineName("coroutine 1")){ //giving data to coroutine context
            println("run from ${this.coroutineContext.get(CoroutineName.Key)}")
        }
    }
}