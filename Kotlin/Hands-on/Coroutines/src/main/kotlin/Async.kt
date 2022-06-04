import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val one=async { first() } //storing async type function
        val two=async { second() }
        println("processing values")
        delay(500L)
        println("waiting values")
        val firstV=one.await() //calling async function in parallel
        val secondV=two.await()
        println(firstV+secondV) //waiting for above await to finally print this
    }
}

suspend fun first():Int{
    delay(2000L)
    println("returning first")
    return 1
}

suspend fun second():Int{
    delay(1000L)
    println("returning second")
    return 2
}