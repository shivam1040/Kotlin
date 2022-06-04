fun main(){
    val arr= arrayOf(1, 2, 3)
    try {
        println(arr[3])
        throw java.lang.IllegalArgumentException("") //intentionally throwing exception
    }
    catch (e: java.lang.Exception){

    }
    finally {

    }
}