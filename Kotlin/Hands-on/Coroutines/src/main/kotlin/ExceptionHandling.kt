import kotlinx.coroutines.*

fun main(){
    runBlocking {
        //below type of exception handler also gives ability to define custom exceptions
        val exceptionHandler= CoroutineExceptionHandler { coroutineContext, throwable -> println("Exception handled ${throwable.localizedMessage}") }
        val job=GlobalScope.launch(exceptionHandler) {//passing exception handler
            println("Throwing exception")
            //if this job is not used anywhere then at the time of initiallization exception will be handled within globalscope not console
            throw IndexOutOfBoundsException("exception occured") //when this exception occurs exceptionHandler defined will manage it
        }
        job.join() //exception won't be thrown to console unless it is used explicityly

        val asyncType=GlobalScope.async {
            println("Throwing exception async")
            //if this job is not used anywhere then at the time of initiallization exception will be handled within globalscope not console
            throw ArithmeticException("async excep")
        }
        try {
            asyncType.await()//now the exception is thrown because we used the asyncType job
        }
        catch (e:Exception){
            println("handled")
        }
    }
}