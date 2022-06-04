import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val job1=launch {
            //delay(1000L) //if this delay is enabled then since delay time is more than delay time just before cancel none of the sub jobs will execute
            println("job1 launched")
            val job2=launch { //creting sub job
                println("job2 launched")
                delay(3000L)
                println("job2 finished")
            }
            job2.invokeOnCompletion { println("job2 invoking done") } //starting a job

            val job3=launch {
                println("job3 launched")
                delay(3000L)
                println("job3 finished")
            }
            job3.invokeOnCompletion { println("job3 invoking done") }
        }
        job1.invokeOnCompletion { println("job1 invoking done") }
        delay(500L)
        println("cancelling job")
        job1.cancel()
        //notice after cancelling how all the jobs started but never finished because they were cancelled before the time required(explicitly defined delay blocks in their scope) for their completion
    }
}